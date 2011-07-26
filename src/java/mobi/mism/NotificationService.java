package mobi.mism;

import javax.jws.WebService;

@WebService(serviceName = "NotificationService", portName = "BasicHttpBinding_NotificationServiceInterface", endpointInterface = "mobi.mism.services.notificationservice.NotificationServiceInterface", targetNamespace = "http://services.mism.mobi/NotificationService", wsdlLocation = "WEB-INF/wsdl/NotificationService/NotificationService.wsdl")
public class NotificationService {

    public void notifyDelayRequest(mobi.mism.schemas.messages.mobility.Line line, mobi.mism.schemas.messages.mobility.Delay delay) {
        System.out.println("Insertion performed successfully.");
    }
}
