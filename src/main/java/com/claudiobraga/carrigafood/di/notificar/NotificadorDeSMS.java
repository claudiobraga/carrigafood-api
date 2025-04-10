package com.claudiobraga.carrigafood.di.notificar;



import org.springframework.stereotype.Component;

import com.claudiobraga.carrigafood.di.modelo.Cliente;

@TipoDoNotificador (NivelDeUrgencia.URGENTE)
@Component
public class NotificadorDeSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("A notificar o(a) %s por SMS através do telefone %s: %s\n",
				cliente.getNome(), cliente.getTelefone(), mensagem);	
	}
}
