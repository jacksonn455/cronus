package br.com.Vendas.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.Vendas.DAO.ClientesDAO;
import br.com.Vendas.domain.Cliente;

@FacesConverter("clientesConverter")
public class ClientesConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent componente, String valor) {
		try {

			Long codigo = Long.parseLong(valor);
			ClientesDAO dao = new ClientesDAO();
			Cliente cliente = dao.buscarPorCodigo(codigo);

			return cliente;

		} catch (RuntimeException ex) {
			return null;
		}

	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent componente, Object objeto) {

		try {

			Cliente cliente = (Cliente) objeto;
			Long codigo = cliente.getCodigo();
			return codigo.toString();

		} catch (RuntimeException ex) {
			return null;
		}
	}

}
