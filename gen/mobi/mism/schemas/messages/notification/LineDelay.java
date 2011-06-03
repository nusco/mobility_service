
package mobi.mism.schemas.messages.notification;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import mobi.mism.schemas.messages.mobility.Delay;
import mobi.mism.schemas.messages.mobility.Line;


/**
 * <p>Java class for LineDelay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LineDelay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="line" type="{http://schemas.mism.mobi/Messages/Mobility}Line"/>
 *         &lt;element name="delay" type="{http://schemas.mism.mobi/Messages/Mobility}Delay"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineDelay", propOrder = {
    "line",
    "delay"
})
public class LineDelay {

    @XmlElement(required = true)
    protected Line line;
    @XmlElement(required = true)
    protected Delay delay;

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link Line }
     *     
     */
    public Line getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link Line }
     *     
     */
    public void setLine(Line value) {
        this.line = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link Delay }
     *     
     */
    public Delay getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Delay }
     *     
     */
    public void setDelay(Delay value) {
        this.delay = value;
    }

}
