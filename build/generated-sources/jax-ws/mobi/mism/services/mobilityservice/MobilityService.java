
package mobi.mism.services.mobilityservice;

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
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MobilityService", targetNamespace = "http://services.mism.mobi/MobilityService", wsdlLocation = "file:/D:/mobility_services/mobility_services/src/conf/xml-resources/web-services/MobilityService/wsdl/MobilityService.wsdl")
public class MobilityService
    extends Service
{

    private final static URL MOBILITYSERVICE_WSDL_LOCATION;
    private final static WebServiceException MOBILITYSERVICE_EXCEPTION;
    private final static QName MOBILITYSERVICE_QNAME = new QName("http://services.mism.mobi/MobilityService", "MobilityService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/mobility_services/mobility_services/src/conf/xml-resources/web-services/MobilityService/wsdl/MobilityService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MOBILITYSERVICE_WSDL_LOCATION = url;
        MOBILITYSERVICE_EXCEPTION = e;
    }

    public MobilityService() {
        super(__getWsdlLocation(), MOBILITYSERVICE_QNAME);
    }

    public MobilityService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MOBILITYSERVICE_QNAME, features);
    }

    public MobilityService(URL wsdlLocation) {
        super(wsdlLocation, MOBILITYSERVICE_QNAME);
    }

    public MobilityService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MOBILITYSERVICE_QNAME, features);
    }

    public MobilityService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MobilityService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MobilityServiceInterface
     */
    @WebEndpoint(name = "BasicHttpBinding_MobilityServiceInterface")
    public MobilityServiceInterface getBasicHttpBindingMobilityServiceInterface() {
        return super.getPort(new QName("http://services.mism.mobi/MobilityService", "BasicHttpBinding_MobilityServiceInterface"), MobilityServiceInterface.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MobilityServiceInterface
     */
    @WebEndpoint(name = "BasicHttpBinding_MobilityServiceInterface")
    public MobilityServiceInterface getBasicHttpBindingMobilityServiceInterface(WebServiceFeature... features) {
        return super.getPort(new QName("http://services.mism.mobi/MobilityService", "BasicHttpBinding_MobilityServiceInterface"), MobilityServiceInterface.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MOBILITYSERVICE_EXCEPTION!= null) {
            throw MOBILITYSERVICE_EXCEPTION;
        }
        return MOBILITYSERVICE_WSDL_LOCATION;
    }

}
