
package mobi.mism.schemas.messages.mobility;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mobi.mism.schemas.messages.mobility package. 
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

    private final static QName _GetExpectedTimeResponse_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetExpectedTimeResponse");
    private final static QName _GetLineDelayResponse_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetLineDelayResponse");
    private final static QName _GetScheduledTimeResponse_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetScheduledTimeResponse");
    private final static QName _GetExpectedTimeRequest_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetExpectedTimeRequest");
    private final static QName _GetScheduledTimeRequest_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetScheduledTimeRequest");
    private final static QName _GetLineDelayRequest_QNAME = new QName("http://schemas.mism.mobi/Messages/Mobility", "GetLineDelayRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mobi.mism.schemas.messages.mobility
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delay }
     * 
     */
    public Delay createDelay() {
        return new Delay();
    }

    /**
     * Create an instance of {@link Line }
     * 
     */
    public Line createLine() {
        return new Line();
    }

    /**
     * Create an instance of {@link LineStop }
     * 
     */
    public LineStop createLineStop() {
        return new LineStop();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetExpectedTimeResponse")
    public JAXBElement<Time> createGetExpectedTimeResponse(Time value) {
        return new JAXBElement<Time>(_GetExpectedTimeResponse_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetLineDelayResponse")
    public JAXBElement<Delay> createGetLineDelayResponse(Delay value) {
        return new JAXBElement<Delay>(_GetLineDelayResponse_QNAME, Delay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetScheduledTimeResponse")
    public JAXBElement<Time> createGetScheduledTimeResponse(Time value) {
        return new JAXBElement<Time>(_GetScheduledTimeResponse_QNAME, Time.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetExpectedTimeRequest")
    public JAXBElement<LineStop> createGetExpectedTimeRequest(LineStop value) {
        return new JAXBElement<LineStop>(_GetExpectedTimeRequest_QNAME, LineStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LineStop }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetScheduledTimeRequest")
    public JAXBElement<LineStop> createGetScheduledTimeRequest(LineStop value) {
        return new JAXBElement<LineStop>(_GetScheduledTimeRequest_QNAME, LineStop.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Line }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.mism.mobi/Messages/Mobility", name = "GetLineDelayRequest")
    public JAXBElement<Line> createGetLineDelayRequest(Line value) {
        return new JAXBElement<Line>(_GetLineDelayRequest_QNAME, Line.class, null, value);
    }

}
