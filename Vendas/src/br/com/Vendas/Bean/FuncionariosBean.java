package br.com.Vendas.Bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Logger;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import br.com.Vendas.DAO.FuncionariosDAO;
import br.com.Vendas.domain.Funcionario;
import br.com.Vendas.util.JSFUtil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBFuncionarios")
@SessionScoped

public class FuncionariosBean implements Serializable {
	private static final long serialVersionUID = 2350857541987046126L;
	private Funcionario funcionario = new Funcionario();
	private FuncionariosDAO fdao = new FuncionariosDAO();

	private ArrayList<Funcionario> itens;
	private ArrayList<Funcionario> itensFiltrados;
	private String acao;
	private String nome;
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public Funcionario getFuncionario() {

		return funcionario;
	}

	//
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public ArrayList<Funcionario> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Funcionario> itens) {
		this.itens = itens;
	}

	public ArrayList<Funcionario> getItensFiltrados() {
		return itensFiltrados;
	}

	public void setItensFiltrados(ArrayList<Funcionario> itensFiltrados) {
		this.itensFiltrados = itensFiltrados;
	}

	// @PostConstruct
	public void prepararPesquisa() {

		try {
			FuncionariosDAO fdao = new FuncionariosDAO();
			itens = (ArrayList<Funcionario>) fdao.listar();

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void carregarCadastro() {

		try {

			if (codigo != null) {

				FuncionariosDAO fdao = new FuncionariosDAO();

				funcionario = fdao.buscarPorCodigo(codigo);

			} else {
				funcionario = new Funcionario();

			}

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void carregarNome() {

		try {

			if (nome != null) {

				FuncionariosDAO fdao = new FuncionariosDAO();

				funcionario = fdao.buscarPorNome(nome);

			} else {
				funcionario = new Funcionario();

			}

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void novo() {
		funcionario = new Funcionario();
	}

	public void salvar() {

		try {
			FuncionariosDAO fdao = new FuncionariosDAO();
			fdao.salvar(funcionario);

			funcionario = new Funcionario();

			JSFUtil.adicionarMensagemSucesso("Funcionário salvo com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}

	public void excluir() {
		try {
			fdao.excluir(funcionario);

			JSFUtil.adicionarMensagemSucesso("Funcionário excluido com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("Não é possível excluir um funcionário que tenha uma venda associado!");
			e.printStackTrace();
		}
	}

	public void autenticar() {
		try {
			// Recebe login e senha do usuário e chama método DAO para autenticar
			funcionario = fdao.autenticar(funcionario.getCpf(), (funcionario.getSenha()));
			FacesContext context = FacesContext.getCurrentInstance();
			// Verifica se o funcionário é nulo ou diferente
			if (funcionario == null) {
				JSFUtil.adicionarMensagemErro("Usuário ou senha invalida");
			} else {
				// Redireciona para página principal após autenticar o funcionário.
				FacesContext.getCurrentInstance().getExternalContext().redirect("principal.xhtml");
			}
		} catch (IOException erro) {
			erro.printStackTrace();
			Messages.addGlobalError(erro.getMessage());
		}
	}

	public void logout() {
		
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().clear();
				FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
	}

	public void editar() {
		try {
			FuncionariosDAO fdao = new FuncionariosDAO();
			fdao.editar(funcionario);

			JSFUtil.adicionarMensagemSucesso("Funcionário editado com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}
}
