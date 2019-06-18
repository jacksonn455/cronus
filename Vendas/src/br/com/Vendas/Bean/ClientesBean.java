package br.com.Vendas.Bean;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.omnifaces.util.Faces;
import org.omnifaces.util.Messages;

import br.com.Vendas.DAO.ClientesDAO;
import br.com.Vendas.domain.Cliente;
import br.com.Vendas.domain.Fornecedor;
import br.com.Vendas.util.JSFUtil;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean(name = "MBClientes")
@SessionScoped

public class ClientesBean implements Serializable {
	private static final long serialVersionUID = 2350857541987046126L;
	private Cliente cliente = new Cliente();
	private ClientesDAO cdao = new ClientesDAO();

	private ArrayList<Cliente> itens;
	private ArrayList<Cliente> itensFiltrados;
	private String acao;
	private String nome;
	private Long codigo;
	private List<Cliente>listaCliente;

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

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

	public Cliente getCliente() {

		return cliente;
	}

	//
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Cliente> getItens() {
		return itens;
	}

	public void setItens(ArrayList<Cliente> itens) {
		this.itens = itens;
	}

	public ArrayList<Cliente> getItensFiltrados() {
		return itensFiltrados;
	}

	public void setItensFiltrados(ArrayList<Cliente> itensFiltrados) {
		this.itensFiltrados = itensFiltrados;
	}

	// @PostConstruct
	public void prepararPesquisa() {

		try {
			ClientesDAO cdao = new ClientesDAO();
			itens = (ArrayList<Cliente>) cdao.listar();

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void carregarCadastro() {

		try {

			if (codigo != null) {

				ClientesDAO cdao = new ClientesDAO();

				cliente = cdao.buscarPorCodigo(codigo);

			} else {
				cliente = new Cliente();

			}

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void carregarNome() {

		try {

			if (nome != null) {

				ClientesDAO cdao = new ClientesDAO();

				cliente = cdao.buscarPorNome(nome);

			} else {
				cliente = new Cliente();

			}

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}

	}

	public void novo() {
		cliente = new Cliente();
	}

	public void salvar() {

		try {
			ClientesDAO cdao = new ClientesDAO();
			cdao.salvar(cliente);

			cliente = new Cliente();

			JSFUtil.adicionarMensagemSucesso("Cliente salvo com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}

	public void excluir() {
		try {
			cdao.excluir(cliente);

			JSFUtil.adicionarMensagemSucesso("Cliente excluido com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("Não é possível excluir um cliente que tenha uma venda associado!");
			e.printStackTrace();
		}
	}

	

	public void editar() {
		try {
			ClientesDAO cdao = new ClientesDAO();
			cdao.editar(cliente);

			JSFUtil.adicionarMensagemSucesso("Cliente editado com sucesso!");

		} catch (RuntimeException e) {
			JSFUtil.adicionarMensagemErro("ex.getMessage()");
			e.printStackTrace();
		}
	}
}
