
package br.com.generated;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "CadastroPessoaWSService", targetNamespace = "http://server.com.br/", wsdlLocation = "http://localhost:9090/pessoa?wsdl")
public class CadastroPessoaWSService
    extends Service
{

    private final static URL CADASTROPESSOAWSSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(br.com.generated.CadastroPessoaWSService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = br.com.generated.CadastroPessoaWSService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:9090/pessoa?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9090/pessoa?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        CADASTROPESSOAWSSERVICE_WSDL_LOCATION = url;
    }

    public CadastroPessoaWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CadastroPessoaWSService() {
        super(CADASTROPESSOAWSSERVICE_WSDL_LOCATION, new QName("http://server.com.br/", "CadastroPessoaWSService"));
    }

    /**
     * 
     * @return
     *     returns CadastroPessoaWS
     */
    @WebEndpoint(name = "CadastroPessoaWSPort")
    public CadastroPessoaWS getCadastroPessoaWSPort() {
        return super.getPort(new QName("http://server.com.br/", "CadastroPessoaWSPort"), CadastroPessoaWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CadastroPessoaWS
     */
    @WebEndpoint(name = "CadastroPessoaWSPort")
    public CadastroPessoaWS getCadastroPessoaWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://server.com.br/", "CadastroPessoaWSPort"), CadastroPessoaWS.class, features);
    }

}