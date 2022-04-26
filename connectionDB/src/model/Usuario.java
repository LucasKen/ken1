package model;

import java.sql.Date;
import java.util.Calendar;

public class Usuario {
	
	// atributos
	private long id; 
	private String nome;
	private String email;
	private int telefone;
	private Date dataRegistro;
	
	// construtor
	public Usuario() {	
		this.dataRegistro = new Date(Calendar.getInstance().getTimeInMillis());
		
	}
	
	// m�todos getters e setters
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public Date getDataRegistro() {
		return dataRegistro;
	}
	
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	
}
