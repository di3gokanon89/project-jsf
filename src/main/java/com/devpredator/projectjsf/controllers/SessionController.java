/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.devpredator.projectjsf.dto.UsuarioDTO;

/**
 * @author DevPredator
 * Clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo
 * en sesion.
 */
@ManagedBean
@SessionScoped
public class SessionController {
	/**
	 * Usuario que se mantendra en sesion.
	 */
	private UsuarioDTO usuarioDTO;
	/**
	 * Inicializa la sesion del usuario.
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesion...");
	}

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
}
