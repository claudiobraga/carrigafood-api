package com.claudiobraga.carrigafood.di.service;

import com.claudiobraga.carrigafood.di.modelo.Cliente;

public class ClienteActivadoEvent {
	
	private Cliente cliente;

	public ClienteActivadoEvent(Cliente cliente) {
		super();
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}