
package blueharvest.geocaching.webservices.user;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UserService", targetNamespace = "http://blueharvestgeo.com/webservices/", wsdlLocation = "http://localhost:24246/WebServices/UserService.asmx?WSDL")
public class UserService
    extends Service
{

    private final static URL USERSERVICE_WSDL_LOCATION;
    private final static WebServiceException USERSERVICE_EXCEPTION;
    private final static QName USERSERVICE_QNAME = new QName("http://blueharvestgeo.com/webservices/", "UserService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:24246/WebServices/UserService.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERSERVICE_WSDL_LOCATION = url;
        USERSERVICE_EXCEPTION = e;
    }

    public UserService() {
        super(__getWsdlLocation(), USERSERVICE_QNAME);
    }

    public UserService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERSERVICE_QNAME, features);
    }

    public UserService(URL wsdlLocation) {
        super(wsdlLocation, USERSERVICE_QNAME);
    }

    public UserService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERSERVICE_QNAME, features);
    }

    public UserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoap")
    public UserServiceSoap getUserServiceSoap() {
        return super.getPort(new QName("http://blueharvestgeo.com/webservices/", "UserServiceSoap"), UserServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoap")
    public UserServiceSoap getUserServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://blueharvestgeo.com/webservices/", "UserServiceSoap"), UserServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoap12")
    public UserServiceSoap getUserServiceSoap12() {
        return super.getPort(new QName("http://blueharvestgeo.com/webservices/", "UserServiceSoap12"), UserServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserServiceSoap
     */
    @WebEndpoint(name = "UserServiceSoap12")
    public UserServiceSoap getUserServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://blueharvestgeo.com/webservices/", "UserServiceSoap12"), UserServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERSERVICE_EXCEPTION!= null) {
            throw USERSERVICE_EXCEPTION;
        }
        return USERSERVICE_WSDL_LOCATION;
    }

}
