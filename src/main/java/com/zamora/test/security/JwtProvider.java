package com.zamora.test.security;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;
import com.zamora.test.modelo.ApplicationUser;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;

@Component
public class JwtProvider {

	private final static Logger logger = LoggerFactory.getLogger(JwtProvider.class);

	
	private String secretkey;

	private int expiration;

	// Generar el token
	public String generarToken(Authentication authentication) {

		ApplicationUser usuarioPrincipal = (ApplicationUser) authentication.getPrincipal();

		return "Bearer " + Jwts.builder().setSubject(usuarioPrincipal.getUser_name()).setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512, secretkey).compact();
	}

	// Obtiene el nombre del usuario
	public String getNombreDeUsuarioDelToken(String token) {

		return Jwts.parser().setSigningKey(secretkey).parseClaimsJws(token).getBody().getSubject();
	}

	// Valida el token
	public boolean validarToken(String token) {

		try {

			Jwts.parser().setSigningKey(secretkey).parseClaimsJws(token);
			return true;
			
		} catch (MalformedJwtException e) {
			logger.error("Token mal formado");

		} catch (ExpiredJwtException e) {

			logger.error("Token Expirado");

		} catch (UnsupportedJwtException e) {

			logger.error("Token no soportado");

		} catch (IllegalArgumentException e) {

			logger.error("Token vacio");

		} catch (SignatureException e) {
			logger.error("Fallo con la firma");
		}

		return false;
	}
}
