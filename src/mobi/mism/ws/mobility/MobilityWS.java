/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mobi.mism.ws.mobility;

import java.util.GregorianCalendar;
import javax.jws.WebService;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import mobi.mism.schemas.messages.mobility.Time;
import mobi.mism.schemas.messages.mobility.Delay;
import mobi.mism.schemas.messages.mobility.LineStop;
import mobi.mism.schemas.messages.mobility.Line;



@WebService(serviceName = "MobilityService", portName = "BasicHttpBinding_MobilityServiceInterface", endpointInterface = "mobi.mism.services.mobilityservice.MobilityServiceInterface", targetNamespace = "http://services.mism.mobi/MobilityService", wsdlLocation = "contracts/MobilityService.wsdl")
public class MobilityWS {

    public Time getScheduledTime(LineStop parameters) {
        //TODO implement this method
       // throw new UnsupportedOperationException("Not implemented yet.");
       Time timeResponse = new Time();
        
        GregorianCalendar gc = new GregorianCalendar();
       
        try{
        DatatypeFactory dtf = DatatypeFactory.newInstance();
        XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar(gc);
        timeResponse.setValue(xgc); 
        
        
        }catch(DatatypeConfigurationException e){
           
        }
         
        
        return timeResponse;
       
       
    }

    public Time getExpectedTime(LineStop parameters) {
        //TODO implement this method
      
        //throw new UnsupportedOperationException("Not implemented yet.");
        Time timeResponse = new Time();
        
        GregorianCalendar gc = new GregorianCalendar();
        
        
        try{
            
            DatatypeFactory dtf = DatatypeFactory.newInstance();
            XMLGregorianCalendar xgc = dtf.newXMLGregorianCalendar(gc);
            timeResponse.setValue(xgc);
       
        }catch(DatatypeConfigurationException e){
        }
        
         
        
        return timeResponse;
        
      
    }

    public Delay getLineDelay(Line parameters) {
        //TODO implement this method
    
       Delay delayResponse = new Delay();
       delayResponse.setMinutes((int)(Math.random() * 15));
       return delayResponse;
    }
    
}
