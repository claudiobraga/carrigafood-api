package com.claudiobraga.carrigafood.di.modelo;

public class Cliente {
	
	// Propriedades
		private String nome;
		private String email;
		private String telefone;
		private boolean activo = false;
		
		// Constructor
		public Cliente(String nome, String email, String telefone) {
			
			this.nome = nome;
			this.email = email;
			this.telefone = telefone;
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

		public String getTelefone() {
			return telefone;
		}

		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		public boolean isActivo() {
			return activo;
		}
		
		public void activar() {
			this.activo = true;
		}

}
