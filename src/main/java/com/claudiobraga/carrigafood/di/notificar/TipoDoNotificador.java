package com.claudiobraga.carrigafood.di.notificar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

@Retention(RetentionPolicy.RUNTIME)//A especificar a politica de retenção, neste caso em Tempo de execução.
@Qualifier
public @interface TipoDoNotificador {
	
	NivelDeUrgencia value();

}
