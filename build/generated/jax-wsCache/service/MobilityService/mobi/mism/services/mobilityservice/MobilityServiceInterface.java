
package mobi.mism.services.mobilityservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import mobi.mism.schemas.messages.mobility.Delay;
import mobi.mism.schemas.messages.mobility.Line;
import mobi.mism.schemas.messages.mobility.LineStop;
import mobi.mism.schemas.messages.mobility.ObjectFactory;
import mobi.mism.schemas.messages.mobility.Time;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2-hudson-752-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MobilityServiceInterface", targetNamespace = "http://services.mism.mobi/MobilityService")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MobilityServiceInterface {


    /**
     * 
     * @param parameters
     * @return
     *     returns mobi.mism.schemas.messages.mobility.Time
     */
    @WebMethod(operationName = "GetScheduledTime", action = "http://services.mism.mobi/MobilityService:getScheduledTimeIn")
    @WebResult(name = "GetScheduledTimeResponse", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
    public Time getScheduledTime(
        @WebParam(name = "GetScheduledTimeRequest", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
        LineStop parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns mobi.mism.schemas.messages.mobility.Time
     */
    @WebMethod(operationName = "GetExpectedTime", action = "http://services.mism.mobi/MobilityService:getExpectedTimeIn")
    @WebResult(name = "GetExpectedTimeResponse", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
    public Time getExpectedTime(
        @WebParam(name = "GetExpectedTimeRequest", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
        LineStop parameters);

    /**
     * 
     * @param parameters
     * @return
     *     returns mobi.mism.schemas.messages.mobility.Delay
     */
    @WebMethod(operationName = "GetLineDelay", action = "http://services.mism.mobi/MobilityService:getLineDelayIn")
    @WebResult(name = "GetLineDelayResponse", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
    public Delay getLineDelay(
        @WebParam(name = "GetLineDelayRequest", targetNamespace = "http://schemas.mism.mobi/Messages/Mobility", partName = "parameters")
        Line parameters);

}
