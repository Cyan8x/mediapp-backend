package com.mitocode.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class PacienteDTO {
	
	private Integer idPaciente;
	
	@NotNull
	@Size(min = 3)
	private String nombres;
	
	@NotNull
	@Size(min = 3)	
	private String apellidos;
	
	@NotNull
	@Size(min = 8)
	private String dni;
	
	@NotNull
	@Size(min = 3, max = 150)
	private String direccion;
		
	@NotEmpty
	@Email
	private String email;
	
	@Size(min = 9, max = 9)	
	//@Pattern(regexp = "")
	private String telefono;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
