package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.nomeDesafio.Cliente;
import br.com.confidencecambio.javabasico.nomeDesafio.Gerente;
import br.com.confidencecambio.javabasico.nomeDesafio.Robo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBasicoApplication.class, args);



		Robo robo = new Robo("José Dutra de Oliveira");
		robo.nomeDaClasse();
		if (robo.validaNome(robo.getNome())){
			robo.obtemPrimeiroNome(robo.getNome());
			robo.obterUltimoNome(robo.getNome());
			robo.completamenteMaiusculo(robo.getNome());
			robo.abreviacaoNome(robo.getNome());
		}




		Gerente gerente = new Gerente("Matheus Brasileiro Aguiar");
		gerente.nomeDaClasse();
		if (gerente.validaNome(gerente.getNome())){
			gerente.obtemPrimeiroNome(gerente.getNome());
			gerente.obterUltimoNome(gerente.getNome());
			gerente.completamenteMaiusculo(gerente.getNome());
			gerente.abreviacaoNome(gerente.getNome());
		}

		Cliente cliente = new Cliente("Marlon Brandon Coelho Couto");
		cliente.nomeDaClasse();
		if (cliente.validaNome(cliente.getNome())){
			cliente.obtemPrimeiroNome(cliente.getNome());
			cliente.obterUltimoNome(cliente.getNome());
			cliente.completamenteMaiusculo(cliente.getNome());
			cliente.abreviacaoNome(cliente.getNome());
		}


	}





}
