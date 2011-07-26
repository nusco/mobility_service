package mobi.mism;

import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import mobi.mism.schemas.messages.mobility.Delay;
import mobi.mism.schemas.messages.mobility.Time;

@WebService(serviceName = "MobilityService", portName = "BasicHttpBinding_MobilityServiceInterface", endpointInterface = "mobi.mism.services.mobilityservice.MobilityServiceInterface", targetNamespace = "http://services.mism.mobi/MobilityService", wsdlLocation = "WEB-INF/wsdl/MobilityService/MobilityService.wsdl")
public class MobilityService {

    public mobi.mism.schemas.messages.mobility.Time getScheduledTime(mobi.mism.schemas.messages.mobility.LineStop parameters) {
        Time timeResponse = new Time();
        GregorianCalendar gc = new GregorianCalendar();

        try {
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar(gc);
            timeResponse.setValue(xgc);
        } catch (DatatypeConfigurationException e) {
        }

        return timeResponse;
    }

    public mobi.mism.schemas.messages.mobility.Time getExpectedTime(mobi.mism.schemas.messages.mobility.LineStop parameters) {
        Time timeResponse = new Time();
        GregorianCalendar gc = new GregorianCalendar();

        try {
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar(gc);
            timeResponse.setValue(xgc);
        } catch (DatatypeConfigurationException e) {
        }

        return timeResponse;
    }

    public mobi.mism.schemas.messages.mobility.Delay getLineDelay(mobi.mism.schemas.messages.mobility.Line parameters) {
        Delay delayResponse = new Delay();
        delayResponse.setMinutes((int) (Math.random() * 15));
        return delayResponse;
    }
}
