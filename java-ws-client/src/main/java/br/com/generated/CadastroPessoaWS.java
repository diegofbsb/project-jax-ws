
package br.com.generated;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CadastroPessoaWS", targetNamespace = "http://server.com.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CadastroPessoaWS {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "cadastrarPessoa", targetNamespace = "http://server.com.br/", className = "br.com.generated.CadastrarPessoa")
    @ResponseWrapper(localName = "cadastrarPessoaResponse", targetNamespace = "http://server.com.br/", className = "br.com.generated.CadastrarPessoaResponse")
    public void cadastrarPessoa(
        @WebParam(name = "arg0", targetNamespace = "")
        Pessoa arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns br.com.generated.Pessoa
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarPorCodigo", targetNamespace = "http://server.com.br/", className = "br.com.generated.BuscarPorCodigo")
    @ResponseWrapper(localName = "buscarPorCodigoResponse", targetNamespace = "http://server.com.br/", className = "br.com.generated.BuscarPorCodigoResponse")
    public Pessoa buscarPorCodigo(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

}