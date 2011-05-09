
package mobi.mism.services.notificationservice;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import mobi.mism.schemas.messages.mobility.Delay;
import mobi.mism.schemas.messages.mobility.Line;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.3-b01-
 * Generated source version: 2.2
 * 
 */
@WebService(name = "NotificationServiceInterface", targetNamespace = "http://services.mism.mobi/NotificationService")
@XmlSeeAlso({
    mobi.mism.schemas.messages.mobility.ObjectFactory.class,
    mobi.mism.schemas.messages.notification.ObjectFactory.class
})
public interface NotificationServiceInterface {


    /**
     * 
     * @param line
     * @param delay
     */
    @WebMethod(operationName = "NotifyDelayRequest", action = "http://services.mism.mobi/NotificationService:notifyDelayRequestIn")
    @Oneway
    @RequestWrapper(localName = "NotifyDelayRequest", targetNamespace = "http://schemas.mism.mobi/Messages/Notification", className = "mobi.mism.schemas.messages.notification.LineDelay")
    public void notifyDelayRequest(
        @WebParam(name = "line", targetNamespace = "http://schemas.mism.mobi/Messages/Notification")
        Line line,
        @WebParam(name = "delay", targetNamespace = "http://schemas.mism.mobi/Messages/Notification")
        Delay delay);

}