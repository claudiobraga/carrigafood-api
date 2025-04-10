package com.claudiobraga.carrigafood.di.notificar;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.claudiobraga.carrigafood.di.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador (NivelDeUrgencia.NORMAL)
@Component
public class NotificadorDeEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
//	@Value("${notificador.email.host-servidor}")
//	private String host;
//	
//	@Value("${notificador.email.porta-servidor}")
//	private Integer porta;
//	
//	public NotificadorDeEmail() {
//		
//		System.out.println("Notificador de Email REAL");
//	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("Host: " + notificadorProperties.getHostServidor()); //só para verificar se está a funcionar
		System.out.println("Porta: " + notificadorProperties.getPortaServidor());//só para verificar se está a funcionar
		
		System.out.printf("A notificar o(a) %s através de email %s: %s\n",
				cliente.getNome(), cliente.getEmail(), mensagem);	
	}
}
