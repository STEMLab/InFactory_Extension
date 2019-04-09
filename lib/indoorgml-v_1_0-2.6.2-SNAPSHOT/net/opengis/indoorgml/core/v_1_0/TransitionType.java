//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.03.15 시간 02:32:57 PM KST 
//


package net.opengis.indoorgml.core.v_1_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.AbstractFeatureType;
import net.opengis.gml.v_3_2.CurvePropertyType;
import org.hisrc.w3c.xlink.v_1_0.ActuateType;
import org.hisrc.w3c.xlink.v_1_0.ShowType;
import org.hisrc.w3c.xlink.v_1_0.TypeType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy2;
import org.jvnet.jaxb2_commons.lang.CopyTo2;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBMergeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.MergeFrom2;
import org.jvnet.jaxb2_commons.lang.MergeStrategy2;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>TransitionType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="TransitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/gml/3.2}AbstractFeatureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="connects" type="{http://www.opengis.net/indoorgml/1.0/core}StatePropertyType" maxOccurs="2" minOccurs="2"/&gt;
 *         &lt;element name="duality" type="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceBoundaryPropertyType" minOccurs="0"/&gt;
 *         &lt;element name="geometry" type="{http://www.opengis.net/gml/3.2}CurvePropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opengis.net/gml/3.2}AssociationAttributeGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransitionType", propOrder = {
    "weight",
    "connects",
    "duality",
    "geometry"
})
public class TransitionType
    extends AbstractFeatureType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    protected Double weight;
    @XmlElement(required = true)
    protected List<StatePropertyType> connects;
    protected CellSpaceBoundaryPropertyType duality;
    protected CurvePropertyType geometry;
    @XmlAttribute(name = "nilReason")
    protected List<String> nilReason;
    @XmlAttribute(name = "remoteSchema", namespace = "http://www.opengis.net/gml/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String remoteSchema;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    protected TypeType type;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    protected String href;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String title;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    protected ShowType show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    protected ActuateType actuate;

    /**
     * weight 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * weight 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setWeight(Double value) {
        this.weight = value;
    }

    public boolean isSetWeight() {
        return (this.weight!= null);
    }

    /**
     * Gets the value of the connects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatePropertyType }
     * 
     * 
     */
    public List<StatePropertyType> getConnects() {
        if (connects == null) {
            connects = new ArrayList<StatePropertyType>();
        }
        return this.connects;
    }

    public boolean isSetConnects() {
        return ((this.connects!= null)&&(!this.connects.isEmpty()));
    }

    public void unsetConnects() {
        this.connects = null;
    }

    /**
     * duality 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CellSpaceBoundaryPropertyType }
     *     
     */
    public CellSpaceBoundaryPropertyType getDuality() {
        return duality;
    }

    /**
     * duality 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CellSpaceBoundaryPropertyType }
     *     
     */
    public void setDuality(CellSpaceBoundaryPropertyType value) {
        this.duality = value;
    }

    public boolean isSetDuality() {
        return (this.duality!= null);
    }

    /**
     * geometry 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CurvePropertyType }
     *     
     */
    public CurvePropertyType getGeometry() {
        return geometry;
    }

    /**
     * geometry 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CurvePropertyType }
     *     
     */
    public void setGeometry(CurvePropertyType value) {
        this.geometry = value;
    }

    public boolean isSetGeometry() {
        return (this.geometry!= null);
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

    public boolean isSetNilReason() {
        return ((this.nilReason!= null)&&(!this.nilReason.isEmpty()));
    }

    public void unsetNilReason() {
        this.nilReason = null;
    }

    /**
     * remoteSchema 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteSchema() {
        return remoteSchema;
    }

    /**
     * remoteSchema 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteSchema(String value) {
        this.remoteSchema = value;
    }

    public boolean isSetRemoteSchema() {
        return (this.remoteSchema!= null);
    }

    /**
     * type 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    public TypeType getTYPE() {
        return type;
    }

    /**
     * type 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setTYPE(TypeType value) {
        this.type = value;
    }

    public boolean isSetTYPE() {
        return (this.type!= null);
    }

    /**
     * href 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * href 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    public boolean isSetHref() {
        return (this.href!= null);
    }

    /**
     * role 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * role 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    public boolean isSetRole() {
        return (this.role!= null);
    }

    /**
     * arcrole 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArcrole() {
        return arcrole;
    }

    /**
     * arcrole 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    public boolean isSetArcrole() {
        return (this.arcrole!= null);
    }

    /**
     * title 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * title 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    public boolean isSetTitle() {
        return (this.title!= null);
    }

    /**
     * show 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        return show;
    }

    /**
     * show 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    public boolean isSetShow() {
        return (this.show!= null);
    }

    /**
     * actuate 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        return actuate;
    }

    /**
     * actuate 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    public boolean isSetActuate() {
        return (this.actuate!= null);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Double theWeight;
            theWeight = this.getWeight();
            strategy.appendField(locator, this, "weight", buffer, theWeight, this.isSetWeight());
        }
        {
            List<StatePropertyType> theConnects;
            theConnects = (this.isSetConnects()?this.getConnects():null);
            strategy.appendField(locator, this, "connects", buffer, theConnects, this.isSetConnects());
        }
        {
            CellSpaceBoundaryPropertyType theDuality;
            theDuality = this.getDuality();
            strategy.appendField(locator, this, "duality", buffer, theDuality, this.isSetDuality());
        }
        {
            CurvePropertyType theGeometry;
            theGeometry = this.getGeometry();
            strategy.appendField(locator, this, "geometry", buffer, theGeometry, this.isSetGeometry());
        }
        {
            List<String> theNilReason;
            theNilReason = (this.isSetNilReason()?this.getNilReason():null);
            strategy.appendField(locator, this, "nilReason", buffer, theNilReason, this.isSetNilReason());
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            strategy.appendField(locator, this, "remoteSchema", buffer, theRemoteSchema, this.isSetRemoteSchema());
        }
        {
            TypeType theTYPE;
            theTYPE = this.getTYPE();
            strategy.appendField(locator, this, "type", buffer, theTYPE, this.isSetTYPE());
        }
        {
            String theHref;
            theHref = this.getHref();
            strategy.appendField(locator, this, "href", buffer, theHref, this.isSetHref());
        }
        {
            String theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole, this.isSetRole());
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            strategy.appendField(locator, this, "arcrole", buffer, theArcrole, this.isSetArcrole());
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle, this.isSetTitle());
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            strategy.appendField(locator, this, "show", buffer, theShow, this.isSetShow());
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            strategy.appendField(locator, this, "actuate", buffer, theActuate, this.isSetActuate());
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TransitionType that = ((TransitionType) object);
        {
            Double lhsWeight;
            lhsWeight = this.getWeight();
            Double rhsWeight;
            rhsWeight = that.getWeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "weight", lhsWeight), LocatorUtils.property(thatLocator, "weight", rhsWeight), lhsWeight, rhsWeight, this.isSetWeight(), that.isSetWeight())) {
                return false;
            }
        }
        {
            List<StatePropertyType> lhsConnects;
            lhsConnects = (this.isSetConnects()?this.getConnects():null);
            List<StatePropertyType> rhsConnects;
            rhsConnects = (that.isSetConnects()?that.getConnects():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connects", lhsConnects), LocatorUtils.property(thatLocator, "connects", rhsConnects), lhsConnects, rhsConnects, this.isSetConnects(), that.isSetConnects())) {
                return false;
            }
        }
        {
            CellSpaceBoundaryPropertyType lhsDuality;
            lhsDuality = this.getDuality();
            CellSpaceBoundaryPropertyType rhsDuality;
            rhsDuality = that.getDuality();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duality", lhsDuality), LocatorUtils.property(thatLocator, "duality", rhsDuality), lhsDuality, rhsDuality, this.isSetDuality(), that.isSetDuality())) {
                return false;
            }
        }
        {
            CurvePropertyType lhsGeometry;
            lhsGeometry = this.getGeometry();
            CurvePropertyType rhsGeometry;
            rhsGeometry = that.getGeometry();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "geometry", lhsGeometry), LocatorUtils.property(thatLocator, "geometry", rhsGeometry), lhsGeometry, rhsGeometry, this.isSetGeometry(), that.isSetGeometry())) {
                return false;
            }
        }
        {
            List<String> lhsNilReason;
            lhsNilReason = (this.isSetNilReason()?this.getNilReason():null);
            List<String> rhsNilReason;
            rhsNilReason = (that.isSetNilReason()?that.getNilReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nilReason", lhsNilReason), LocatorUtils.property(thatLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason, this.isSetNilReason(), that.isSetNilReason())) {
                return false;
            }
        }
        {
            String lhsRemoteSchema;
            lhsRemoteSchema = this.getRemoteSchema();
            String rhsRemoteSchema;
            rhsRemoteSchema = that.getRemoteSchema();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(thatLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema, this.isSetRemoteSchema(), that.isSetRemoteSchema())) {
                return false;
            }
        }
        {
            TypeType lhsTYPE;
            lhsTYPE = this.getTYPE();
            TypeType rhsTYPE;
            rhsTYPE = that.getTYPE();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsTYPE), LocatorUtils.property(thatLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, this.isSetTYPE(), that.isSetTYPE())) {
                return false;
            }
        }
        {
            String lhsHref;
            lhsHref = this.getHref();
            String rhsHref;
            rhsHref = that.getHref();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "href", lhsHref), LocatorUtils.property(thatLocator, "href", rhsHref), lhsHref, rhsHref, this.isSetHref(), that.isSetHref())) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole, this.isSetRole(), that.isSetRole())) {
                return false;
            }
        }
        {
            String lhsArcrole;
            lhsArcrole = this.getArcrole();
            String rhsArcrole;
            rhsArcrole = that.getArcrole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "arcrole", lhsArcrole), LocatorUtils.property(thatLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole, this.isSetArcrole(), that.isSetArcrole())) {
                return false;
            }
        }
        {
            String lhsTitle;
            lhsTitle = this.getTitle();
            String rhsTitle;
            rhsTitle = that.getTitle();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "title", lhsTitle), LocatorUtils.property(thatLocator, "title", rhsTitle), lhsTitle, rhsTitle, this.isSetTitle(), that.isSetTitle())) {
                return false;
            }
        }
        {
            ShowType lhsShow;
            lhsShow = this.getShow();
            ShowType rhsShow;
            rhsShow = that.getShow();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "show", lhsShow), LocatorUtils.property(thatLocator, "show", rhsShow), lhsShow, rhsShow, this.isSetShow(), that.isSetShow())) {
                return false;
            }
        }
        {
            ActuateType lhsActuate;
            lhsActuate = this.getActuate();
            ActuateType rhsActuate;
            rhsActuate = that.getActuate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actuate", lhsActuate), LocatorUtils.property(thatLocator, "actuate", rhsActuate), lhsActuate, rhsActuate, this.isSetActuate(), that.isSetActuate())) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Double theWeight;
            theWeight = this.getWeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "weight", theWeight), currentHashCode, theWeight, this.isSetWeight());
        }
        {
            List<StatePropertyType> theConnects;
            theConnects = (this.isSetConnects()?this.getConnects():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connects", theConnects), currentHashCode, theConnects, this.isSetConnects());
        }
        {
            CellSpaceBoundaryPropertyType theDuality;
            theDuality = this.getDuality();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duality", theDuality), currentHashCode, theDuality, this.isSetDuality());
        }
        {
            CurvePropertyType theGeometry;
            theGeometry = this.getGeometry();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "geometry", theGeometry), currentHashCode, theGeometry, this.isSetGeometry());
        }
        {
            List<String> theNilReason;
            theNilReason = (this.isSetNilReason()?this.getNilReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nilReason", theNilReason), currentHashCode, theNilReason, this.isSetNilReason());
        }
        {
            String theRemoteSchema;
            theRemoteSchema = this.getRemoteSchema();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "remoteSchema", theRemoteSchema), currentHashCode, theRemoteSchema, this.isSetRemoteSchema());
        }
        {
            TypeType theTYPE;
            theTYPE = this.getTYPE();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theTYPE), currentHashCode, theTYPE, this.isSetTYPE());
        }
        {
            String theHref;
            theHref = this.getHref();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "href", theHref), currentHashCode, theHref, this.isSetHref());
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole, this.isSetRole());
        }
        {
            String theArcrole;
            theArcrole = this.getArcrole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "arcrole", theArcrole), currentHashCode, theArcrole, this.isSetArcrole());
        }
        {
            String theTitle;
            theTitle = this.getTitle();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "title", theTitle), currentHashCode, theTitle, this.isSetTitle());
        }
        {
            ShowType theShow;
            theShow = this.getShow();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "show", theShow), currentHashCode, theShow, this.isSetShow());
        }
        {
            ActuateType theActuate;
            theActuate = this.getActuate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actuate", theActuate), currentHashCode, theActuate, this.isSetActuate());
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy2 strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy2 strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        super.copyTo(locator, draftCopy, strategy);
        if (draftCopy instanceof TransitionType) {
            final TransitionType copy = ((TransitionType) draftCopy);
            {
                Boolean weightShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetWeight());
                if (weightShouldBeCopiedAndSet == Boolean.TRUE) {
                    Double sourceWeight;
                    sourceWeight = this.getWeight();
                    Double copyWeight = ((Double) strategy.copy(LocatorUtils.property(locator, "weight", sourceWeight), sourceWeight, this.isSetWeight()));
                    copy.setWeight(copyWeight);
                } else {
                    if (weightShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.weight = null;
                    }
                }
            }
            {
                Boolean connectsShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetConnects());
                if (connectsShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<StatePropertyType> sourceConnects;
                    sourceConnects = (this.isSetConnects()?this.getConnects():null);
                    @SuppressWarnings("unchecked")
                    List<StatePropertyType> copyConnects = ((List<StatePropertyType> ) strategy.copy(LocatorUtils.property(locator, "connects", sourceConnects), sourceConnects, this.isSetConnects()));
                    copy.unsetConnects();
                    if (copyConnects!= null) {
                        List<StatePropertyType> uniqueConnectsl = copy.getConnects();
                        uniqueConnectsl.addAll(copyConnects);
                    }
                } else {
                    if (connectsShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetConnects();
                    }
                }
            }
            {
                Boolean dualityShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetDuality());
                if (dualityShouldBeCopiedAndSet == Boolean.TRUE) {
                    CellSpaceBoundaryPropertyType sourceDuality;
                    sourceDuality = this.getDuality();
                    CellSpaceBoundaryPropertyType copyDuality = ((CellSpaceBoundaryPropertyType) strategy.copy(LocatorUtils.property(locator, "duality", sourceDuality), sourceDuality, this.isSetDuality()));
                    copy.setDuality(copyDuality);
                } else {
                    if (dualityShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.duality = null;
                    }
                }
            }
            {
                Boolean geometryShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetGeometry());
                if (geometryShouldBeCopiedAndSet == Boolean.TRUE) {
                    CurvePropertyType sourceGeometry;
                    sourceGeometry = this.getGeometry();
                    CurvePropertyType copyGeometry = ((CurvePropertyType) strategy.copy(LocatorUtils.property(locator, "geometry", sourceGeometry), sourceGeometry, this.isSetGeometry()));
                    copy.setGeometry(copyGeometry);
                } else {
                    if (geometryShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.geometry = null;
                    }
                }
            }
            {
                Boolean nilReasonShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetNilReason());
                if (nilReasonShouldBeCopiedAndSet == Boolean.TRUE) {
                    List<String> sourceNilReason;
                    sourceNilReason = (this.isSetNilReason()?this.getNilReason():null);
                    @SuppressWarnings("unchecked")
                    List<String> copyNilReason = ((List<String> ) strategy.copy(LocatorUtils.property(locator, "nilReason", sourceNilReason), sourceNilReason, this.isSetNilReason()));
                    copy.unsetNilReason();
                    if (copyNilReason!= null) {
                        List<String> uniqueNilReasonl = copy.getNilReason();
                        uniqueNilReasonl.addAll(copyNilReason);
                    }
                } else {
                    if (nilReasonShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.unsetNilReason();
                    }
                }
            }
            {
                Boolean remoteSchemaShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRemoteSchema());
                if (remoteSchemaShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRemoteSchema;
                    sourceRemoteSchema = this.getRemoteSchema();
                    String copyRemoteSchema = ((String) strategy.copy(LocatorUtils.property(locator, "remoteSchema", sourceRemoteSchema), sourceRemoteSchema, this.isSetRemoteSchema()));
                    copy.setRemoteSchema(copyRemoteSchema);
                } else {
                    if (remoteSchemaShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.remoteSchema = null;
                    }
                }
            }
            {
                Boolean typeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTYPE());
                if (typeShouldBeCopiedAndSet == Boolean.TRUE) {
                    TypeType sourceTYPE;
                    sourceTYPE = this.getTYPE();
                    TypeType copyTYPE = ((TypeType) strategy.copy(LocatorUtils.property(locator, "type", sourceTYPE), sourceTYPE, this.isSetTYPE()));
                    copy.setTYPE(copyTYPE);
                } else {
                    if (typeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.type = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetHref());
                if (hrefShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceHref;
                    sourceHref = this.getHref();
                    String copyHref = ((String) strategy.copy(LocatorUtils.property(locator, "href", sourceHref), sourceHref, this.isSetHref()));
                    copy.setHref(copyHref);
                } else {
                    if (hrefShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.href = null;
                    }
                }
            }
            {
                Boolean roleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetRole());
                if (roleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceRole;
                    sourceRole = this.getRole();
                    String copyRole = ((String) strategy.copy(LocatorUtils.property(locator, "role", sourceRole), sourceRole, this.isSetRole()));
                    copy.setRole(copyRole);
                } else {
                    if (roleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.role = null;
                    }
                }
            }
            {
                Boolean arcroleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetArcrole());
                if (arcroleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceArcrole;
                    sourceArcrole = this.getArcrole();
                    String copyArcrole = ((String) strategy.copy(LocatorUtils.property(locator, "arcrole", sourceArcrole), sourceArcrole, this.isSetArcrole()));
                    copy.setArcrole(copyArcrole);
                } else {
                    if (arcroleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.arcrole = null;
                    }
                }
            }
            {
                Boolean titleShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetTitle());
                if (titleShouldBeCopiedAndSet == Boolean.TRUE) {
                    String sourceTitle;
                    sourceTitle = this.getTitle();
                    String copyTitle = ((String) strategy.copy(LocatorUtils.property(locator, "title", sourceTitle), sourceTitle, this.isSetTitle()));
                    copy.setTitle(copyTitle);
                } else {
                    if (titleShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.title = null;
                    }
                }
            }
            {
                Boolean showShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetShow());
                if (showShouldBeCopiedAndSet == Boolean.TRUE) {
                    ShowType sourceShow;
                    sourceShow = this.getShow();
                    ShowType copyShow = ((ShowType) strategy.copy(LocatorUtils.property(locator, "show", sourceShow), sourceShow, this.isSetShow()));
                    copy.setShow(copyShow);
                } else {
                    if (showShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.show = null;
                    }
                }
            }
            {
                Boolean actuateShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetActuate());
                if (actuateShouldBeCopiedAndSet == Boolean.TRUE) {
                    ActuateType sourceActuate;
                    sourceActuate = this.getActuate();
                    ActuateType copyActuate = ((ActuateType) strategy.copy(LocatorUtils.property(locator, "actuate", sourceActuate), sourceActuate, this.isSetActuate()));
                    copy.setActuate(copyActuate);
                } else {
                    if (actuateShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.actuate = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new TransitionType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof TransitionType) {
            final TransitionType target = this;
            final TransitionType leftObject = ((TransitionType) left);
            final TransitionType rightObject = ((TransitionType) right);
            {
                Boolean weightShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetWeight(), rightObject.isSetWeight());
                if (weightShouldBeMergedAndSet == Boolean.TRUE) {
                    Double lhsWeight;
                    lhsWeight = leftObject.getWeight();
                    Double rhsWeight;
                    rhsWeight = rightObject.getWeight();
                    Double mergedWeight = ((Double) strategy.merge(LocatorUtils.property(leftLocator, "weight", lhsWeight), LocatorUtils.property(rightLocator, "weight", rhsWeight), lhsWeight, rhsWeight, leftObject.isSetWeight(), rightObject.isSetWeight()));
                    target.setWeight(mergedWeight);
                } else {
                    if (weightShouldBeMergedAndSet == Boolean.FALSE) {
                        target.weight = null;
                    }
                }
            }
            {
                Boolean connectsShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetConnects(), rightObject.isSetConnects());
                if (connectsShouldBeMergedAndSet == Boolean.TRUE) {
                    List<StatePropertyType> lhsConnects;
                    lhsConnects = (leftObject.isSetConnects()?leftObject.getConnects():null);
                    List<StatePropertyType> rhsConnects;
                    rhsConnects = (rightObject.isSetConnects()?rightObject.getConnects():null);
                    List<StatePropertyType> mergedConnects = ((List<StatePropertyType> ) strategy.merge(LocatorUtils.property(leftLocator, "connects", lhsConnects), LocatorUtils.property(rightLocator, "connects", rhsConnects), lhsConnects, rhsConnects, leftObject.isSetConnects(), rightObject.isSetConnects()));
                    target.unsetConnects();
                    if (mergedConnects!= null) {
                        List<StatePropertyType> uniqueConnectsl = target.getConnects();
                        uniqueConnectsl.addAll(mergedConnects);
                    }
                } else {
                    if (connectsShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetConnects();
                    }
                }
            }
            {
                Boolean dualityShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetDuality(), rightObject.isSetDuality());
                if (dualityShouldBeMergedAndSet == Boolean.TRUE) {
                    CellSpaceBoundaryPropertyType lhsDuality;
                    lhsDuality = leftObject.getDuality();
                    CellSpaceBoundaryPropertyType rhsDuality;
                    rhsDuality = rightObject.getDuality();
                    CellSpaceBoundaryPropertyType mergedDuality = ((CellSpaceBoundaryPropertyType) strategy.merge(LocatorUtils.property(leftLocator, "duality", lhsDuality), LocatorUtils.property(rightLocator, "duality", rhsDuality), lhsDuality, rhsDuality, leftObject.isSetDuality(), rightObject.isSetDuality()));
                    target.setDuality(mergedDuality);
                } else {
                    if (dualityShouldBeMergedAndSet == Boolean.FALSE) {
                        target.duality = null;
                    }
                }
            }
            {
                Boolean geometryShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetGeometry(), rightObject.isSetGeometry());
                if (geometryShouldBeMergedAndSet == Boolean.TRUE) {
                    CurvePropertyType lhsGeometry;
                    lhsGeometry = leftObject.getGeometry();
                    CurvePropertyType rhsGeometry;
                    rhsGeometry = rightObject.getGeometry();
                    CurvePropertyType mergedGeometry = ((CurvePropertyType) strategy.merge(LocatorUtils.property(leftLocator, "geometry", lhsGeometry), LocatorUtils.property(rightLocator, "geometry", rhsGeometry), lhsGeometry, rhsGeometry, leftObject.isSetGeometry(), rightObject.isSetGeometry()));
                    target.setGeometry(mergedGeometry);
                } else {
                    if (geometryShouldBeMergedAndSet == Boolean.FALSE) {
                        target.geometry = null;
                    }
                }
            }
            {
                Boolean nilReasonShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetNilReason(), rightObject.isSetNilReason());
                if (nilReasonShouldBeMergedAndSet == Boolean.TRUE) {
                    List<String> lhsNilReason;
                    lhsNilReason = (leftObject.isSetNilReason()?leftObject.getNilReason():null);
                    List<String> rhsNilReason;
                    rhsNilReason = (rightObject.isSetNilReason()?rightObject.getNilReason():null);
                    List<String> mergedNilReason = ((List<String> ) strategy.merge(LocatorUtils.property(leftLocator, "nilReason", lhsNilReason), LocatorUtils.property(rightLocator, "nilReason", rhsNilReason), lhsNilReason, rhsNilReason, leftObject.isSetNilReason(), rightObject.isSetNilReason()));
                    target.unsetNilReason();
                    if (mergedNilReason!= null) {
                        List<String> uniqueNilReasonl = target.getNilReason();
                        uniqueNilReasonl.addAll(mergedNilReason);
                    }
                } else {
                    if (nilReasonShouldBeMergedAndSet == Boolean.FALSE) {
                        target.unsetNilReason();
                    }
                }
            }
            {
                Boolean remoteSchemaShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetRemoteSchema(), rightObject.isSetRemoteSchema());
                if (remoteSchemaShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsRemoteSchema;
                    lhsRemoteSchema = leftObject.getRemoteSchema();
                    String rhsRemoteSchema;
                    rhsRemoteSchema = rightObject.getRemoteSchema();
                    String mergedRemoteSchema = ((String) strategy.merge(LocatorUtils.property(leftLocator, "remoteSchema", lhsRemoteSchema), LocatorUtils.property(rightLocator, "remoteSchema", rhsRemoteSchema), lhsRemoteSchema, rhsRemoteSchema, leftObject.isSetRemoteSchema(), rightObject.isSetRemoteSchema()));
                    target.setRemoteSchema(mergedRemoteSchema);
                } else {
                    if (remoteSchemaShouldBeMergedAndSet == Boolean.FALSE) {
                        target.remoteSchema = null;
                    }
                }
            }
            {
                Boolean typeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetTYPE(), rightObject.isSetTYPE());
                if (typeShouldBeMergedAndSet == Boolean.TRUE) {
                    TypeType lhsTYPE;
                    lhsTYPE = leftObject.getTYPE();
                    TypeType rhsTYPE;
                    rhsTYPE = rightObject.getTYPE();
                    TypeType mergedTYPE = ((TypeType) strategy.merge(LocatorUtils.property(leftLocator, "type", lhsTYPE), LocatorUtils.property(rightLocator, "type", rhsTYPE), lhsTYPE, rhsTYPE, leftObject.isSetTYPE(), rightObject.isSetTYPE()));
                    target.setTYPE(mergedTYPE);
                } else {
                    if (typeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.type = null;
                    }
                }
            }
            {
                Boolean hrefShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetHref(), rightObject.isSetHref());
                if (hrefShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsHref;
                    lhsHref = leftObject.getHref();
                    String rhsHref;
                    rhsHref = rightObject.getHref();
                    String mergedHref = ((String) strategy.merge(LocatorUtils.property(leftLocator, "href", lhsHref), LocatorUtils.property(rightLocator, "href", rhsHref), lhsHref, rhsHref, leftObject.isSetHref(), rightObject.isSetHref()));
                    target.setHref(mergedHref);
                } else {
                    if (hrefShouldBeMergedAndSet == Boolean.FALSE) {
                        target.href = null;
                    }
                }
            }
            {
                Boolean roleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetRole(), rightObject.isSetRole());
                if (roleShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsRole;
                    lhsRole = leftObject.getRole();
                    String rhsRole;
                    rhsRole = rightObject.getRole();
                    String mergedRole = ((String) strategy.merge(LocatorUtils.property(leftLocator, "role", lhsRole), LocatorUtils.property(rightLocator, "role", rhsRole), lhsRole, rhsRole, leftObject.isSetRole(), rightObject.isSetRole()));
                    target.setRole(mergedRole);
                } else {
                    if (roleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.role = null;
                    }
                }
            }
            {
                Boolean arcroleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetArcrole(), rightObject.isSetArcrole());
                if (arcroleShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsArcrole;
                    lhsArcrole = leftObject.getArcrole();
                    String rhsArcrole;
                    rhsArcrole = rightObject.getArcrole();
                    String mergedArcrole = ((String) strategy.merge(LocatorUtils.property(leftLocator, "arcrole", lhsArcrole), LocatorUtils.property(rightLocator, "arcrole", rhsArcrole), lhsArcrole, rhsArcrole, leftObject.isSetArcrole(), rightObject.isSetArcrole()));
                    target.setArcrole(mergedArcrole);
                } else {
                    if (arcroleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.arcrole = null;
                    }
                }
            }
            {
                Boolean titleShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetTitle(), rightObject.isSetTitle());
                if (titleShouldBeMergedAndSet == Boolean.TRUE) {
                    String lhsTitle;
                    lhsTitle = leftObject.getTitle();
                    String rhsTitle;
                    rhsTitle = rightObject.getTitle();
                    String mergedTitle = ((String) strategy.merge(LocatorUtils.property(leftLocator, "title", lhsTitle), LocatorUtils.property(rightLocator, "title", rhsTitle), lhsTitle, rhsTitle, leftObject.isSetTitle(), rightObject.isSetTitle()));
                    target.setTitle(mergedTitle);
                } else {
                    if (titleShouldBeMergedAndSet == Boolean.FALSE) {
                        target.title = null;
                    }
                }
            }
            {
                Boolean showShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetShow(), rightObject.isSetShow());
                if (showShouldBeMergedAndSet == Boolean.TRUE) {
                    ShowType lhsShow;
                    lhsShow = leftObject.getShow();
                    ShowType rhsShow;
                    rhsShow = rightObject.getShow();
                    ShowType mergedShow = ((ShowType) strategy.merge(LocatorUtils.property(leftLocator, "show", lhsShow), LocatorUtils.property(rightLocator, "show", rhsShow), lhsShow, rhsShow, leftObject.isSetShow(), rightObject.isSetShow()));
                    target.setShow(mergedShow);
                } else {
                    if (showShouldBeMergedAndSet == Boolean.FALSE) {
                        target.show = null;
                    }
                }
            }
            {
                Boolean actuateShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetActuate(), rightObject.isSetActuate());
                if (actuateShouldBeMergedAndSet == Boolean.TRUE) {
                    ActuateType lhsActuate;
                    lhsActuate = leftObject.getActuate();
                    ActuateType rhsActuate;
                    rhsActuate = rightObject.getActuate();
                    ActuateType mergedActuate = ((ActuateType) strategy.merge(LocatorUtils.property(leftLocator, "actuate", lhsActuate), LocatorUtils.property(rightLocator, "actuate", rhsActuate), lhsActuate, rhsActuate, leftObject.isSetActuate(), rightObject.isSetActuate()));
                    target.setActuate(mergedActuate);
                } else {
                    if (actuateShouldBeMergedAndSet == Boolean.FALSE) {
                        target.actuate = null;
                    }
                }
            }
        }
    }

    public void setConnects(List<StatePropertyType> value) {
        this.connects = null;
        if (value!= null) {
            List<StatePropertyType> draftl = this.getConnects();
            draftl.addAll(value);
        }
    }

    public void setNilReason(List<String> value) {
        this.nilReason = null;
        if (value!= null) {
            List<String> draftl = this.getNilReason();
            draftl.addAll(value);
        }
    }

    public TransitionType withWeight(Double value) {
        setWeight(value);
        return this;
    }

    public TransitionType withConnects(StatePropertyType... values) {
        if (values!= null) {
            for (StatePropertyType value: values) {
                getConnects().add(value);
            }
        }
        return this;
    }

    public TransitionType withConnects(Collection<StatePropertyType> values) {
        if (values!= null) {
            getConnects().addAll(values);
        }
        return this;
    }

    public TransitionType withDuality(CellSpaceBoundaryPropertyType value) {
        setDuality(value);
        return this;
    }

    public TransitionType withGeometry(CurvePropertyType value) {
        setGeometry(value);
        return this;
    }

    public TransitionType withNilReason(String... values) {
        if (values!= null) {
            for (String value: values) {
                getNilReason().add(value);
            }
        }
        return this;
    }

    public TransitionType withNilReason(Collection<String> values) {
        if (values!= null) {
            getNilReason().addAll(values);
        }
        return this;
    }

    public TransitionType withRemoteSchema(String value) {
        setRemoteSchema(value);
        return this;
    }

    public TransitionType withTYPE(TypeType value) {
        setTYPE(value);
        return this;
    }

    public TransitionType withHref(String value) {
        setHref(value);
        return this;
    }

    public TransitionType withRole(String value) {
        setRole(value);
        return this;
    }

    public TransitionType withArcrole(String value) {
        setArcrole(value);
        return this;
    }

    public TransitionType withTitle(String value) {
        setTitle(value);
        return this;
    }

    public TransitionType withShow(ShowType value) {
        setShow(value);
        return this;
    }

    public TransitionType withActuate(ActuateType value) {
        setActuate(value);
        return this;
    }

    public TransitionType withConnects(List<StatePropertyType> value) {
        setConnects(value);
        return this;
    }

    public TransitionType withNilReason(List<String> value) {
        setNilReason(value);
        return this;
    }

}
