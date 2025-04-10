package com.claudiobraga.carrigafood.di.notificar;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.claudiobraga.carrigafood.di.modelo.Cliente;


@Profile("dev")
@TipoDoNotificador (NivelDeUrgencia.NORMAL)
@Component
public class NotificadorDeEmailMock implements Notificador {
	
	//Constructor sem parametros
	public NotificadorDeEmailMock() {
		
		System.out.println("Notificador de Email MOCK");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: A notificação seria enviada para o(a) %s através de email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);	
	}
}
