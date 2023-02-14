package one.digitalinnovation.gof.facade;

import subsistema1.crm.CrmService;
import subsistema2.cep.CepApi;

public class Facade {

	public void migrarCliente(String nome, String treino, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		
		CrmService.gravarCliente(nome, treino, cep, cidade, estado);
	}
}
