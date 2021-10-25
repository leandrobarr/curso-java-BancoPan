package com.microcalculadora.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microcalculadora.model.Calculadora;
import com.microcalculadora.model.Tabela;

@Service
public class CalculadoraService {
	
	//@Value("http://localhost:8004")
	@Value("${micro_tabela.host}")
	private String microTabela;
	
	@Autowired
	private RestTemplate restTemplate;
	
	//na calculadora deste projeto , passa duas variaveis
	public Calculadora getCalculo(Long tabelaId, int dias) {
		//crio um hash e nele  passo um paramentro la para o controller como string
		Map<String, String> urlParamentros = new HashMap<String, String>();
		//a variavel id, virá do parametro
		urlParamentros.put("id",""+tabelaId);
		//pegue os dadios relativos a outra aplicação
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}",Tabela.class, urlParamentros);
		return new Calculadora(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}

}
