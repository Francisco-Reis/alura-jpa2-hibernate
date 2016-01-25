package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.MovimentacaoDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteConsultaComDao {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		Conta conta = new Conta();
		conta.setId(1);
		
		MovimentacaoDao dao = new MovimentacaoDao(manager);
	    Double media = dao.mediaDaConta(conta);
	    
	    System.out.println(media);
		
		manager.close();

	}
}
