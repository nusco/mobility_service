/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobi.mism.ws.notification;

import javax.jws.WebService;
import mobi.mism.schemas.messages.mobility.Line;
import mobi.mism.schemas.messages.mobility.Delay;


@WebService(serviceName = "NotificationService", portName = "BasicHttpBinding_NotificationServiceInterface", endpointInterface = "mobi.mism.services.notificationservice.NotificationServiceInterface", targetNamespace = "http://services.mism.mobi/NotificationService", wsdlLocation = "contracts/NotificationService.wsdl")
public class NotificationWS {

    public void notifyDelayRequest(Line line, Delay delay) {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        System.out.println("Insertion performed successfully.");
    }
    
}
