package br.com.brq.ws;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
public class TesteWS {
	
	@WebMethod
	public int calculaValores(@WebParam(name="valorUm") int valorUm, @WebParam(name="valorDois") int valorDois){
		return valorUm + valorDois;
	}
	
}
