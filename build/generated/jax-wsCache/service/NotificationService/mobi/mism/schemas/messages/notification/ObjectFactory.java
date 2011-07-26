
package mobi.mism.schemas.messages.notification;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mobi.mism.schemas.messages.notification package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NotifyDelayRequest_QNAME = new QName("http://schemas.mism.mobi/Messages/Notification", "NotifyDelayRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mobi.mism.schemas.messages.notification
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LineDelay }
     * 
     */
    public LineDelay createLineDelay() {
        return new LineDelay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineDelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Notification", name = "NotifyDelayRequest")
    public JAXBElement<LineDelay> createNotifyDelayRequest(LineDelay value) {
        return new JAXBElement<LineDelay>(_NotifyDelayRequest_QNAME, LineDelay.class, null, value);
    }

}
