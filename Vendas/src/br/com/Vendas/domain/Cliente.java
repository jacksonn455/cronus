package br.com.Vendas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Table(name = "tb_clientes")
@NamedQueries({
@NamedQuery(name = "Cliente.listar", query = "SELECT cliente FROM Cliente cliente" ),
@NamedQuery(name = "Cliente.buscarPorCodigo", query = "SELECT cliente FROM Cliente cliente WHERE cliente.codigo = :codigo" ),
})
public class Cliente {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "cli_codigo")
	private Long codigo;

	@NotEmpty(message = "Insira o Nome")
	@Column(name = "cli_nome", length = 50, nullable = false)
	private String nome;
 
	
	@CPF(message = "CPF Incorreto")
	@Column(name = "cli_cpf", length = 14, nullable = false, unique = true)
	private String cpf;
    
	@NotEmpty(message = "Insira um Telefone")
	@Column(name = "cli_telefone", length = 50, nullable = false)
	private String telefone;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", telefone="
				+ telefone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	
	
	
	
	
	

}
