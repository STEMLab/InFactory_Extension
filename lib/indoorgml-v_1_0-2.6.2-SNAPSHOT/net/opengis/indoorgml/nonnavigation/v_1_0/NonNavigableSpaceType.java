//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2019.03.15 시간 02:32:57 PM KST 
//


package net.opengis.indoorgml.nonnavigation.v_1_0;

import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import net.opengis.gml.v_3_2.CodeType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceBoundaryPropertyType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceGeometryType;
import net.opengis.indoorgml.core.v_1_0.CellSpaceType;
import net.opengis.indoorgml.core.v_1_0.ExternalReferenceType;
import net.opengis.indoorgml.core.v_1_0.StatePropertyType;
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
 * <p>NonNavigableSpaceType complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="NonNavigableSpaceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.opengis.net/indoorgml/1.0/core}CellSpaceType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObstacleType" type="{http://www.opengis.net/gml/3.2}CodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonNavigableSpaceType", propOrder = {
    "obstacleType"
})
public class NonNavigableSpaceType
    extends CellSpaceType
    implements Cloneable, CopyTo2, Equals2, HashCode2, MergeFrom2, ToString2
{

    @XmlElement(name = "ObstacleType", required = true)
    protected CodeType obstacleType;

    /**
     * obstacleType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getObstacleType() {
        return obstacleType;
    }

    /**
     * obstacleType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setObstacleType(CodeType value) {
        this.obstacleType = value;
    }

    public boolean isSetObstacleType() {
        return (this.obstacleType!= null);
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
            CodeType theObstacleType;
            theObstacleType = this.getObstacleType();
            strategy.appendField(locator, this, "obstacleType", buffer, theObstacleType, this.isSetObstacleType());
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
        final NonNavigableSpaceType that = ((NonNavigableSpaceType) object);
        {
            CodeType lhsObstacleType;
            lhsObstacleType = this.getObstacleType();
            CodeType rhsObstacleType;
            rhsObstacleType = that.getObstacleType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "obstacleType", lhsObstacleType), LocatorUtils.property(thatLocator, "obstacleType", rhsObstacleType), lhsObstacleType, rhsObstacleType, this.isSetObstacleType(), that.isSetObstacleType())) {
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
            CodeType theObstacleType;
            theObstacleType = this.getObstacleType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "obstacleType", theObstacleType), currentHashCode, theObstacleType, this.isSetObstacleType());
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
        if (draftCopy instanceof NonNavigableSpaceType) {
            final NonNavigableSpaceType copy = ((NonNavigableSpaceType) draftCopy);
            {
                Boolean obstacleTypeShouldBeCopiedAndSet = strategy.shouldBeCopiedAndSet(locator, this.isSetObstacleType());
                if (obstacleTypeShouldBeCopiedAndSet == Boolean.TRUE) {
                    CodeType sourceObstacleType;
                    sourceObstacleType = this.getObstacleType();
                    CodeType copyObstacleType = ((CodeType) strategy.copy(LocatorUtils.property(locator, "obstacleType", sourceObstacleType), sourceObstacleType, this.isSetObstacleType()));
                    copy.setObstacleType(copyObstacleType);
                } else {
                    if (obstacleTypeShouldBeCopiedAndSet == Boolean.FALSE) {
                        copy.obstacleType = null;
                    }
                }
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new NonNavigableSpaceType();
    }

    public void mergeFrom(Object left, Object right) {
        final MergeStrategy2 strategy = JAXBMergeStrategy.INSTANCE;
        mergeFrom(null, null, left, right, strategy);
    }

    public void mergeFrom(ObjectLocator leftLocator, ObjectLocator rightLocator, Object left, Object right, MergeStrategy2 strategy) {
        super.mergeFrom(leftLocator, rightLocator, left, right, strategy);
        if (right instanceof NonNavigableSpaceType) {
            final NonNavigableSpaceType target = this;
            final NonNavigableSpaceType leftObject = ((NonNavigableSpaceType) left);
            final NonNavigableSpaceType rightObject = ((NonNavigableSpaceType) right);
            {
                Boolean obstacleTypeShouldBeMergedAndSet = strategy.shouldBeMergedAndSet(leftLocator, rightLocator, leftObject.isSetObstacleType(), rightObject.isSetObstacleType());
                if (obstacleTypeShouldBeMergedAndSet == Boolean.TRUE) {
                    CodeType lhsObstacleType;
                    lhsObstacleType = leftObject.getObstacleType();
                    CodeType rhsObstacleType;
                    rhsObstacleType = rightObject.getObstacleType();
                    CodeType mergedObstacleType = ((CodeType) strategy.merge(LocatorUtils.property(leftLocator, "obstacleType", lhsObstacleType), LocatorUtils.property(rightLocator, "obstacleType", rhsObstacleType), lhsObstacleType, rhsObstacleType, leftObject.isSetObstacleType(), rightObject.isSetObstacleType()));
                    target.setObstacleType(mergedObstacleType);
                } else {
                    if (obstacleTypeShouldBeMergedAndSet == Boolean.FALSE) {
                        target.obstacleType = null;
                    }
                }
            }
        }
    }

    public NonNavigableSpaceType withObstacleType(CodeType value) {
        setObstacleType(value);
        return this;
    }

    @Override
    public NonNavigableSpaceType withCellSpaceGeometry(CellSpaceGeometryType value) {
        setCellSpaceGeometry(value);
        return this;
    }

    @Override
    public NonNavigableSpaceType withDuality(StatePropertyType value) {
        setDuality(value);
        return this;
    }

    @Override
    public NonNavigableSpaceType withExternalReference(ExternalReferenceType... values) {
        if (values!= null) {
            for (ExternalReferenceType value: values) {
                getExternalReference().add(value);
            }
        }
        return this;
    }

    @Override
    public NonNavigableSpaceType withExternalReference(Collection<ExternalReferenceType> values) {
        if (values!= null) {
            getExternalReference().addAll(values);
        }
        return this;
    }

    @Override
    public NonNavigableSpaceType withPartialboundedBy(CellSpaceBoundaryPropertyType... values) {
        if (values!= null) {
            for (CellSpaceBoundaryPropertyType value: values) {
                getPartialboundedBy().add(value);
            }
        }
        return this;
    }

    @Override
    public NonNavigableSpaceType withPartialboundedBy(Collection<CellSpaceBoundaryPropertyType> values) {
        if (values!= null) {
            getPartialboundedBy().addAll(values);
        }
        return this;
    }

    @Override
    public NonNavigableSpaceType withExternalReference(List<ExternalReferenceType> value) {
        setExternalReference(value);
        return this;
    }

    @Override
    public NonNavigableSpaceType withPartialboundedBy(List<CellSpaceBoundaryPropertyType> value) {
        setPartialboundedBy(value);
        return this;
    }

}
