package com.claudiobraga.carrigafood.di.notificar;

import com.claudiobraga.carrigafood.di.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);
}