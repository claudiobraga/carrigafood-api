package com.claudiobraga.carrigafood.di.service;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.claudiobraga.carrigafood.di.modelo.Cliente;
import com.claudiobraga.carrigafood.di.notificar.NivelDeUrgencia;
import com.claudiobraga.carrigafood.di.notificar.Notificador;
import com.claudiobraga.carrigafood.di.notificar.TipoDoNotificador;


@Component
public class ActivarClienteService {
	
	@TipoDoNotificador(NivelDeUrgencia.URGENTE)
	@Autowired
	private Notificador notificador;
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	@PostConstruct
	public void init() {
		System.out.println("INIT" + notificador);
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}
	
		public void activar(Cliente cliente) {
			cliente.activar();
			
			eventPublisher.publishEvent(new ClienteActivadoEvent(cliente));
			
			//notificador.notificar(cliente, "Seu registo no sistema está activo");
			}
}