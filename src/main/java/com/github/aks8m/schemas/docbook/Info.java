//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.25 at 06:26:25 PM EST 
//


package com.github.aks8m.schemas.docbook;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docbook.org/ns/docbook}title"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}titleabbrev"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}subtitle"/>
 *         &lt;/choice>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://docbook.org/ns/docbook}abstract"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}artpagenums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}author"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}authorgroup"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}authorinitials"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliocoverage"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}biblioid"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliosource"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}collab"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}confgroup"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}contractsponsor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}contractnum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}copyright"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}cover"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}date"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}edition"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}editor"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}issuenum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}keywordset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}legalnotice"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}org"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}orgname"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}othercredit"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}pagenums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}printhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}pubdate"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}publisher"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}publishername"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}releaseinfo"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}seriesvolnums"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}subjectset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}volumenum"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}extendedlink"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliomisc"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliomset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}bibliorelation"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}biblioset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}itermset"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productname"/>
 *           &lt;element ref="{http://docbook.org/ns/docbook}productnumber"/>
 *         &lt;/choice>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "titlesAndTitleabbrevsAndSubtitles"
})
@XmlRootElement(name = "info")
public class Info {

    @XmlElements({
        @XmlElement(name = "title", type = Title.class),
        @XmlElement(name = "titleabbrev", type = Titleabbrev.class),
        @XmlElement(name = "subtitle", type = Subtitle.class),
        @XmlElement(name = "abstract", type = Abstract.class),
        @XmlElement(name = "address", type = Address.class),
        @XmlElement(name = "artpagenums", type = Artpagenums.class),
        @XmlElement(name = "author", type = Author.class),
        @XmlElement(name = "authorgroup", type = Authorgroup.class),
        @XmlElement(name = "authorinitials", type = Authorinitials.class),
        @XmlElement(name = "bibliocoverage", type = Bibliocoverage.class),
        @XmlElement(name = "biblioid", type = Biblioid.class),
        @XmlElement(name = "bibliosource", type = Bibliosource.class),
        @XmlElement(name = "collab", type = Collab.class),
        @XmlElement(name = "confgroup", type = Confgroup.class),
        @XmlElement(name = "contractsponsor", type = Contractsponsor.class),
        @XmlElement(name = "contractnum", type = Contractnum.class),
        @XmlElement(name = "copyright", type = Copyright.class),
        @XmlElement(name = "cover", type = Cover.class),
        @XmlElement(name = "date", type = Date.class),
        @XmlElement(name = "edition", type = Edition.class),
        @XmlElement(name = "editor", type = Editor.class),
        @XmlElement(name = "issuenum", type = Issuenum.class),
        @XmlElement(name = "keywordset", type = Keywordset.class),
        @XmlElement(name = "legalnotice", type = Legalnotice.class),
        @XmlElement(name = "mediaobject", type = Mediaobject.class),
        @XmlElement(name = "org", type = Org.class),
        @XmlElement(name = "orgname", type = Orgname.class),
        @XmlElement(name = "othercredit", type = Othercredit.class),
        @XmlElement(name = "pagenums", type = Pagenums.class),
        @XmlElement(name = "printhistory", type = Printhistory.class),
        @XmlElement(name = "pubdate", type = Pubdate.class),
        @XmlElement(name = "publisher", type = Publisher.class),
        @XmlElement(name = "publishername", type = Publishername.class),
        @XmlElement(name = "releaseinfo", type = Releaseinfo.class),
        @XmlElement(name = "revhistory", type = Revhistory.class),
        @XmlElement(name = "seriesvolnums", type = Seriesvolnums.class),
        @XmlElement(name = "subjectset", type = Subjectset.class),
        @XmlElement(name = "volumenum", type = Volumenum.class),
        @XmlElement(name = "annotation", type = Annotation.class),
        @XmlElement(name = "extendedlink", type = Extendedlink.class),
        @XmlElement(name = "bibliomisc", type = Bibliomisc.class),
        @XmlElement(name = "bibliomset", type = Bibliomset.class),
        @XmlElement(name = "bibliorelation", type = Bibliorelation.class),
        @XmlElement(name = "biblioset", type = Biblioset.class),
        @XmlElement(name = "itermset", type = Itermset.class),
        @XmlElement(name = "productname", type = Productname.class),
        @XmlElement(name = "productnumber", type = Productnumber.class)
    })
    protected List<Object> titlesAndTitleabbrevsAndSubtitles;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "id", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonVersion;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String xmlLang;
    @XmlAttribute(name = "base", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlSchemaType(name = "anySimpleType")
    protected String base;
    @XmlAttribute(name = "remap")
    @XmlSchemaType(name = "anySimpleType")
    protected String remap;
    @XmlAttribute(name = "xreflabel")
    @XmlSchemaType(name = "anySimpleType")
    protected String xreflabel;
    @XmlAttribute(name = "revisionflag")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String revisionflag;
    @XmlAttribute(name = "dir")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dir;
    @XmlAttribute(name = "arch")
    @XmlSchemaType(name = "anySimpleType")
    protected String arch;
    @XmlAttribute(name = "audience")
    @XmlSchemaType(name = "anySimpleType")
    protected String audience;
    @XmlAttribute(name = "condition")
    @XmlSchemaType(name = "anySimpleType")
    protected String condition;
    @XmlAttribute(name = "conformance")
    @XmlSchemaType(name = "anySimpleType")
    protected String conformance;
    @XmlAttribute(name = "os")
    @XmlSchemaType(name = "anySimpleType")
    protected String os;
    @XmlAttribute(name = "revision")
    @XmlSchemaType(name = "anySimpleType")
    protected String commonRevision;
    @XmlAttribute(name = "security")
    @XmlSchemaType(name = "anySimpleType")
    protected String security;
    @XmlAttribute(name = "userlevel")
    @XmlSchemaType(name = "anySimpleType")
    protected String userlevel;
    @XmlAttribute(name = "vendor")
    @XmlSchemaType(name = "anySimpleType")
    protected String vendor;
    @XmlAttribute(name = "wordsize")
    @XmlSchemaType(name = "anySimpleType")
    protected String wordsize;
    @XmlAttribute(name = "annotations")
    @XmlSchemaType(name = "anySimpleType")
    protected String annotations;

    /**
     * Gets the value of the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the titlesAndTitleabbrevsAndSubtitles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitlesAndTitleabbrevsAndSubtitles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Title }
     * {@link Titleabbrev }
     * {@link Subtitle }
     * {@link Abstract }
     * {@link Address }
     * {@link Artpagenums }
     * {@link Author }
     * {@link Authorgroup }
     * {@link Authorinitials }
     * {@link Bibliocoverage }
     * {@link Biblioid }
     * {@link Bibliosource }
     * {@link Collab }
     * {@link Confgroup }
     * {@link Contractsponsor }
     * {@link Contractnum }
     * {@link Copyright }
     * {@link Cover }
     * {@link Date }
     * {@link Edition }
     * {@link Editor }
     * {@link Issuenum }
     * {@link Keywordset }
     * {@link Legalnotice }
     * {@link Mediaobject }
     * {@link Org }
     * {@link Orgname }
     * {@link Othercredit }
     * {@link Pagenums }
     * {@link Printhistory }
     * {@link Pubdate }
     * {@link Publisher }
     * {@link Publishername }
     * {@link Releaseinfo }
     * {@link Revhistory }
     * {@link Seriesvolnums }
     * {@link Subjectset }
     * {@link Volumenum }
     * {@link Annotation }
     * {@link Extendedlink }
     * {@link Bibliomisc }
     * {@link Bibliomset }
     * {@link Bibliorelation }
     * {@link Biblioset }
     * {@link Itermset }
     * {@link Productname }
     * {@link Productnumber }
     * 
     * 
     */
    public List<Object> getTitlesAndTitleabbrevsAndSubtitles() {
        if (titlesAndTitleabbrevsAndSubtitles == null) {
            titlesAndTitleabbrevsAndSubtitles = new ArrayList<Object>();
        }
        return this.titlesAndTitleabbrevsAndSubtitles;
    }

    /**
     * Gets the value of the role property.
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
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the commonVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonVersion() {
        return commonVersion;
    }

    /**
     * Sets the value of the commonVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonVersion(String value) {
        this.commonVersion = value;
    }

    /**
     * Gets the value of the xmlLang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlLang() {
        return xmlLang;
    }

    /**
     * Sets the value of the xmlLang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlLang(String value) {
        this.xmlLang = value;
    }

    /**
     * Gets the value of the base property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * Sets the value of the base property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Gets the value of the remap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemap() {
        return remap;
    }

    /**
     * Sets the value of the remap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemap(String value) {
        this.remap = value;
    }

    /**
     * Gets the value of the xreflabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXreflabel() {
        return xreflabel;
    }

    /**
     * Sets the value of the xreflabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXreflabel(String value) {
        this.xreflabel = value;
    }

    /**
     * Gets the value of the revisionflag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionflag() {
        return revisionflag;
    }

    /**
     * Sets the value of the revisionflag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionflag(String value) {
        this.revisionflag = value;
    }

    /**
     * Gets the value of the dir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDir() {
        return dir;
    }

    /**
     * Sets the value of the dir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDir(String value) {
        this.dir = value;
    }

    /**
     * Gets the value of the arch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArch() {
        return arch;
    }

    /**
     * Sets the value of the arch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArch(String value) {
        this.arch = value;
    }

    /**
     * Gets the value of the audience property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAudience() {
        return audience;
    }

    /**
     * Sets the value of the audience property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAudience(String value) {
        this.audience = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the conformance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConformance() {
        return conformance;
    }

    /**
     * Sets the value of the conformance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConformance(String value) {
        this.conformance = value;
    }

    /**
     * Gets the value of the os property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOs() {
        return os;
    }

    /**
     * Sets the value of the os property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOs(String value) {
        this.os = value;
    }

    /**
     * Gets the value of the commonRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonRevision() {
        return commonRevision;
    }

    /**
     * Sets the value of the commonRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonRevision(String value) {
        this.commonRevision = value;
    }

    /**
     * Gets the value of the security property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * Sets the value of the security property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

    /**
     * Gets the value of the userlevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserlevel() {
        return userlevel;
    }

    /**
     * Sets the value of the userlevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserlevel(String value) {
        this.userlevel = value;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the value of the vendor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendor(String value) {
        this.vendor = value;
    }

    /**
     * Gets the value of the wordsize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWordsize() {
        return wordsize;
    }

    /**
     * Sets the value of the wordsize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWordsize(String value) {
        this.wordsize = value;
    }

    /**
     * Gets the value of the annotations property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnnotations() {
        return annotations;
    }

    /**
     * Sets the value of the annotations property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnnotations(String value) {
        this.annotations = value;
    }

}
