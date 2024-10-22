package com.springlearn.boot.services;

import com.fasterxml.jackson.core.JsonEncoding;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.boot.json.JsonParseException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TokenAuthenticationService {

    private static final long EXPIRATION_TIME = 860_000_000;
    private static final String SECRET = "awdjhlawjd";
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";

    public static void addAuthentication(HttpServletResponse response, String username) throws IOException {
        String JWT = Jwts.builder()
                .setSubject("username")
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
        response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
        Map<String, String> token = new HashMap<>();
        token.put("token", JWT);

        // TODO Converter token para JSON -> Baixar biblioteca Gson do google
        response.getWriter().write(token.toString());
    }

    public static Authentication getAuthentication(HttpServletRequest request) throws JsonParseException, MalformedJwtException {
        String token = request.getHeader(HEADER_STRING);

        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey(SECRET)
                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
                    .getBody()
                    .getSubject();

            if (user != null) {
                return new UsernamePasswordAuthenticationToken(user, null, Collections.emptyList());
            }

        }
        return null;
    }
}
