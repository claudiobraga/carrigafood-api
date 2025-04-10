/**Classe responsável por receber requisições WEB - @Controller**/
package com.claudiobraga.carrigafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.claudiobraga.carrigafood.di.modelo.Cliente;
import com.claudiobraga.carrigafood.di.service.ActivarClienteService;

@Controller
public class MeuPrimeiroController {
	
	private ActivarClienteService activarClienteService;
	
	public MeuPrimeiroController(ActivarClienteService activarClienteService) {
		super();
		this.activarClienteService = activarClienteService;
		
		System.out.println("MeuPrimeiroController" + activarClienteService);
	}
	@GetMapping("/hello")
	@ResponseBody /** Vincular o retorno do método(à resposta)ao corpo da resposta na página web.**/
	public String hello() {
		
		Cliente Joao = new Cliente("João", "joao@conadamae.com", "917283979220");
		activarClienteService.activar(Joao);
		
		return "Olá João";
	}
}
