package com.yash.security;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.yash.entities.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JwtTokenProvider {

	private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationFilter.class);

	// generate token bt accesing value of authentication passed
	public String generateToken(Authentication authentication) {
		logger.info("Inside JwtTokenProvider()");
		User user = (User) authentication.getPrincipal();
		Date issueDate = new Date(System.currentTimeMillis());
		Date expiryDate = new Date(issueDate.getTime() + (1 * 60 * 60 * 1000));
		String userId = Long.toString(user.getId());
		Map<String, Object> claims = new HashMap<>();
		claims.put("id", (Long.toString(user.getId())));
		claims.put("username", user.getUsername());
		claims.put("fullName", user.getFullName());
		return Jwts.builder().setSubject(userId).setClaims(claims).setIssuedAt(issueDate).setExpiration(expiryDate)
				.signWith(SignatureAlgorithm.HS512, "YashTechnologies#SecretKey").compact();
	}

	// valitde the token  
	public boolean validateToken(String token) {
		logger.info("Inside validateToken()");
		try {
			Jwts.parser().setSigningKey("YashTechnologies#SecretKey").parseClaimsJws(token);
			return true;
		} catch (SignatureException ex) {
			logger.error("Invalid JWT Signature");
		} catch (MalformedJwtException ex) {
			logger.error("Invalid JWT Token");
		} catch (ExpiredJwtException ex) {
			logger.error("Expired JWT token");
		} catch (UnsupportedJwtException ex) {
			logger.error("Unsupported JWT token");
		} catch (IllegalArgumentException ex) {
			logger.error("JWT claims string is empty");
		}
		return false;
	}

	// remove actual token from the header
	public Long getUserIdFromJWT(String token) {
		logger.info("Inside getUserIdFromJWT()");
		Claims claims = Jwts.parser().setSigningKey("YashTechnologies#SecretKey").parseClaimsJws(token).getBody();
		String id = (String) claims.get("id");
		return Long.parseLong(id);
	}

}
