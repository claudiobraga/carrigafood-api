package com.claudiobraga.carrigafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.claudiobraga.carrigafood.di.notificar.NivelDeUrgencia;
import com.claudiobraga.carrigafood.di.notificar.Notificador;
import com.claudiobraga.carrigafood.di.notificar.TipoDoNotificador;
import com.claudiobraga.carrigafood.di.service.ClienteActivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelDeUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void ClienteActivadoListener(ClienteActivadoEvent event) {
		
		System.out.println("Cliente " + event.getCliente().getNome() + " Agora está activo");
		
		notificador.notificar(event.getCliente(), "Seu registo no sistema está activo");
		
	}

}
