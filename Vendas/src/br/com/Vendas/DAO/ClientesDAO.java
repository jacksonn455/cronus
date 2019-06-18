package br.com.Vendas.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.Vendas.domain.Cliente;
import br.com.Vendas.util.HibernateUtil;

public class ClientesDAO {

	public void salvar(Cliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação
			sessao.save(cliente);
			transacao.commit(); // confirmando a transação

		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback(); // desfaz a transação
			}

		}

		finally {
			sessao.close();
		}

	}

	@SuppressWarnings("unchecked")
	public List<Cliente> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		List<Cliente> cliente = null;

		try {

			Query consulta = sessao.getNamedQuery("Cliente.listar");
			cliente = consulta.list();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return cliente;
	}

	public Cliente buscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Cliente cliente = null;

		try {

			Query consulta = sessao.getNamedQuery("Cliente.buscarPorCodigo");
			consulta.setLong("codigo", codigo);
			cliente = (Cliente) consulta.uniqueResult();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return cliente;
	}

	public Cliente buscarPorNome(String nome) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Cliente cliente = null;

		try {

			Query consulta = sessao.getNamedQuery("Cliente.buscarPorNome");
			consulta.setString("nome", nome);
			cliente = (Cliente) consulta.uniqueResult();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return cliente;
	}
	
	public void excluir(Cliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação
			sessao.delete(cliente);
			transacao.commit(); // confirmando a transação

		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback(); // desfaz a transação
			}

		}

		finally {
			sessao.close();
		}

	}

	public Cliente autenticar(String cpf, String senha) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Cliente cliente = null;

		try {
			// Executa a query de consulta
			Query consulta = sessao.getNamedQuery("Cliente.logar");
			// Recebe os dados informados
			consulta.setString("cpf", cpf);
			consulta.setString("senha", senha);
			// Cria consulta do funcionário
			cliente = (Cliente) consulta.uniqueResult();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return cliente;
	}
	
	public void editar(Cliente cliente) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação

			sessao.update(cliente);
			transacao.commit(); // confirmando a transação

		} catch (RuntimeException ex) {
			if (transacao != null) {
				transacao.rollback(); // desfaz a transação
			}

		}

		finally {
			sessao.close();
		}

	}
}
