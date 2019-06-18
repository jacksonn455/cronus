package br.com.Vendas.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.Vendas.domain.Funcionario;
import br.com.Vendas.util.HibernateUtil;

public class FuncionariosDAO {

	public void salvar(Funcionario funcionario) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação
			sessao.save(funcionario);
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
	public List<Funcionario> listar() {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		List<Funcionario> funcionario = null;

		try {

			Query consulta = sessao.getNamedQuery("Funcionario.listar");
			funcionario = consulta.list();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return funcionario;
	}

	public Funcionario buscarPorCodigo(Long codigo) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Funcionario funcionario = null;

		try {

			Query consulta = sessao.getNamedQuery("Funcionario.buscarPorCodigo");
			consulta.setLong("codigo", codigo);
			funcionario = (Funcionario) consulta.uniqueResult();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return funcionario;
	}

	public Funcionario buscarPorNome(String nome) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Funcionario funcionario = null;

		try {

			Query consulta = sessao.getNamedQuery("Funcionario.buscarPorNome");
			consulta.setString("nome", nome);
			funcionario = (Funcionario) consulta.uniqueResult();

		} catch (RuntimeException ex) {
			throw ex;
		}

		finally {
			sessao.close();
		}

		return funcionario;
	}
	
	public void excluir(Funcionario funcionario) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação
			sessao.delete(funcionario);
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

	public Funcionario autenticar(String cpf, String senha) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();
		Funcionario funcionario = null;

		try {
			// Executa a query de consulta
			Query consulta = sessao.getNamedQuery("Funcionario.logar");
			// Recebe os dados informados
			consulta.setString("cpf", cpf);
			consulta.setString("senha", senha);
			// Cria consulta do funcionário
			funcionario = (Funcionario) consulta.uniqueResult();
		} catch (RuntimeException ex) {
			throw ex;
		} finally {
			sessao.close();
		}
		return funcionario;
	}
	
	public void editar(Funcionario funcionario) {
		Session sessao = HibernateUtil.getSessionFactory().openSession();

		Transaction transacao = null;

		try {
			transacao = sessao.beginTransaction(); // abrindo a transação

			sessao.update(funcionario);
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
