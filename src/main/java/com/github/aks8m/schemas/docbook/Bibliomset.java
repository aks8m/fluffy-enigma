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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlMixed;
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
 *         &lt;element ref="{http://docbook.org/ns/docbook}inlinemediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}remark"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}superscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}subscript"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}xref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}link"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}olink"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}anchor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}biblioref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}alt"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}annotation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}indexterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}phrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}replaceable"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}abstract"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}address"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}artpagenums"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}author"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}authorgroup"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}authorinitials"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliocoverage"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}biblioid"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliosource"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}collab"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}confgroup"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}contractsponsor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}contractnum"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}copyright"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}cover"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}date"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}edition"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}editor"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}issuenum"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}keywordset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}legalnotice"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}mediaobject"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}org"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}orgname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}othercredit"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}pagenums"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}printhistory"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}pubdate"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}publisher"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}publishername"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}releaseinfo"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}revhistory"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}seriesvolnums"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}subjectset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}volumenum"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}extendedlink"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliomisc"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliomset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}bibliorelation"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}biblioset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}itermset"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}productnumber"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}abbrev"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}acronym"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}emphasis"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}footnoteref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}foreignphrase"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}quote"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}wordasword"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}firstterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}glossterm"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}coref"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citerefentry"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citetitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}citebiblioid"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}person"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}personblurb"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}personname"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}subtitle"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}title"/>
 *         &lt;element ref="{http://docbook.org/ns/docbook}titleabbrev"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.attributes"/>
 *       &lt;attGroup ref="{http://docbook.org/ns/docbook}db.common.linking.attributes"/>
 *       &lt;attribute name="role" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="relation" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "bibliomset")
public class Bibliomset {

    @XmlElementRefs({
        @XmlElementRef(name = "cover", namespace = "http://docbook.org/ns/docbook", type = Cover.class, required = false),
        @XmlElementRef(name = "pagenums", namespace = "http://docbook.org/ns/docbook", type = Pagenums.class, required = false),
        @XmlElementRef(name = "releaseinfo", namespace = "http://docbook.org/ns/docbook", type = Releaseinfo.class, required = false),
        @XmlElementRef(name = "olink", namespace = "http://docbook.org/ns/docbook", type = Olink.class, required = false),
        @XmlElementRef(name = "orgname", namespace = "http://docbook.org/ns/docbook", type = Orgname.class, required = false),
        @XmlElementRef(name = "edition", namespace = "http://docbook.org/ns/docbook", type = Edition.class, required = false),
        @XmlElementRef(name = "titleabbrev", namespace = "http://docbook.org/ns/docbook", type = Titleabbrev.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://docbook.org/ns/docbook", type = Address.class, required = false),
        @XmlElementRef(name = "contractsponsor", namespace = "http://docbook.org/ns/docbook", type = Contractsponsor.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://docbook.org/ns/docbook", type = Editor.class, required = false),
        @XmlElementRef(name = "extendedlink", namespace = "http://docbook.org/ns/docbook", type = Extendedlink.class, required = false),
        @XmlElementRef(name = "abbrev", namespace = "http://docbook.org/ns/docbook", type = Abbrev.class, required = false),
        @XmlElementRef(name = "phrase", namespace = "http://docbook.org/ns/docbook", type = Phrase.class, required = false),
        @XmlElementRef(name = "person", namespace = "http://docbook.org/ns/docbook", type = Person.class, required = false),
        @XmlElementRef(name = "printhistory", namespace = "http://docbook.org/ns/docbook", type = Printhistory.class, required = false),
        @XmlElementRef(name = "productname", namespace = "http://docbook.org/ns/docbook", type = Productname.class, required = false),
        @XmlElementRef(name = "personblurb", namespace = "http://docbook.org/ns/docbook", type = Personblurb.class, required = false),
        @XmlElementRef(name = "copyright", namespace = "http://docbook.org/ns/docbook", type = Copyright.class, required = false),
        @XmlElementRef(name = "acronym", namespace = "http://docbook.org/ns/docbook", type = Acronym.class, required = false),
        @XmlElementRef(name = "itermset", namespace = "http://docbook.org/ns/docbook", type = Itermset.class, required = false),
        @XmlElementRef(name = "bibliosource", namespace = "http://docbook.org/ns/docbook", type = Bibliosource.class, required = false),
        @XmlElementRef(name = "bibliorelation", namespace = "http://docbook.org/ns/docbook", type = Bibliorelation.class, required = false),
        @XmlElementRef(name = "date", namespace = "http://docbook.org/ns/docbook", type = Date.class, required = false),
        @XmlElementRef(name = "publisher", namespace = "http://docbook.org/ns/docbook", type = Publisher.class, required = false),
        @XmlElementRef(name = "replaceable", namespace = "http://docbook.org/ns/docbook", type = Replaceable.class, required = false),
        @XmlElementRef(name = "revhistory", namespace = "http://docbook.org/ns/docbook", type = Revhistory.class, required = false),
        @XmlElementRef(name = "othercredit", namespace = "http://docbook.org/ns/docbook", type = Othercredit.class, required = false),
        @XmlElementRef(name = "biblioref", namespace = "http://docbook.org/ns/docbook", type = Biblioref.class, required = false),
        @XmlElementRef(name = "collab", namespace = "http://docbook.org/ns/docbook", type = Collab.class, required = false),
        @XmlElementRef(name = "biblioset", namespace = "http://docbook.org/ns/docbook", type = Biblioset.class, required = false),
        @XmlElementRef(name = "inlinemediaobject", namespace = "http://docbook.org/ns/docbook", type = Inlinemediaobject.class, required = false),
        @XmlElementRef(name = "anchor", namespace = "http://docbook.org/ns/docbook", type = Anchor.class, required = false),
        @XmlElementRef(name = "bibliomset", namespace = "http://docbook.org/ns/docbook", type = Bibliomset.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://docbook.org/ns/docbook", type = Title.class, required = false),
        @XmlElementRef(name = "personname", namespace = "http://docbook.org/ns/docbook", type = Personname.class, required = false),
        @XmlElementRef(name = "firstterm", namespace = "http://docbook.org/ns/docbook", type = Firstterm.class, required = false),
        @XmlElementRef(name = "indexterm", namespace = "http://docbook.org/ns/docbook", type = Indexterm.class, required = false),
        @XmlElementRef(name = "subtitle", namespace = "http://docbook.org/ns/docbook", type = Subtitle.class, required = false),
        @XmlElementRef(name = "foreignphrase", namespace = "http://docbook.org/ns/docbook", type = Foreignphrase.class, required = false),
        @XmlElementRef(name = "coref", namespace = "http://docbook.org/ns/docbook", type = Coref.class, required = false),
        @XmlElementRef(name = "wordasword", namespace = "http://docbook.org/ns/docbook", type = Wordasword.class, required = false),
        @XmlElementRef(name = "keywordset", namespace = "http://docbook.org/ns/docbook", type = Keywordset.class, required = false),
        @XmlElementRef(name = "footnote", namespace = "http://docbook.org/ns/docbook", type = Footnote.class, required = false),
        @XmlElementRef(name = "remark", namespace = "http://docbook.org/ns/docbook", type = Remark.class, required = false),
        @XmlElementRef(name = "xref", namespace = "http://docbook.org/ns/docbook", type = Xref.class, required = false),
        @XmlElementRef(name = "subjectset", namespace = "http://docbook.org/ns/docbook", type = Subjectset.class, required = false),
        @XmlElementRef(name = "authorgroup", namespace = "http://docbook.org/ns/docbook", type = Authorgroup.class, required = false),
        @XmlElementRef(name = "citerefentry", namespace = "http://docbook.org/ns/docbook", type = Citerefentry.class, required = false),
        @XmlElementRef(name = "superscript", namespace = "http://docbook.org/ns/docbook", type = Superscript.class, required = false),
        @XmlElementRef(name = "subscript", namespace = "http://docbook.org/ns/docbook", type = Subscript.class, required = false),
        @XmlElementRef(name = "quote", namespace = "http://docbook.org/ns/docbook", type = Quote.class, required = false),
        @XmlElementRef(name = "citebiblioid", namespace = "http://docbook.org/ns/docbook", type = Citebiblioid.class, required = false),
        @XmlElementRef(name = "authorinitials", namespace = "http://docbook.org/ns/docbook", type = Authorinitials.class, required = false),
        @XmlElementRef(name = "emphasis", namespace = "http://docbook.org/ns/docbook", type = Emphasis.class, required = false),
        @XmlElementRef(name = "pubdate", namespace = "http://docbook.org/ns/docbook", type = Pubdate.class, required = false),
        @XmlElementRef(name = "artpagenums", namespace = "http://docbook.org/ns/docbook", type = Artpagenums.class, required = false),
        @XmlElementRef(name = "bibliocoverage", namespace = "http://docbook.org/ns/docbook", type = Bibliocoverage.class, required = false),
        @XmlElementRef(name = "publishername", namespace = "http://docbook.org/ns/docbook", type = Publishername.class, required = false),
        @XmlElementRef(name = "biblioid", namespace = "http://docbook.org/ns/docbook", type = Biblioid.class, required = false),
        @XmlElementRef(name = "confgroup", namespace = "http://docbook.org/ns/docbook", type = Confgroup.class, required = false),
        @XmlElementRef(name = "alt", namespace = "http://docbook.org/ns/docbook", type = Alt.class, required = false),
        @XmlElementRef(name = "issuenum", namespace = "http://docbook.org/ns/docbook", type = Issuenum.class, required = false),
        @XmlElementRef(name = "mediaobject", namespace = "http://docbook.org/ns/docbook", type = Mediaobject.class, required = false),
        @XmlElementRef(name = "seriesvolnums", namespace = "http://docbook.org/ns/docbook", type = Seriesvolnums.class, required = false),
        @XmlElementRef(name = "contractnum", namespace = "http://docbook.org/ns/docbook", type = Contractnum.class, required = false),
        @XmlElementRef(name = "link", namespace = "http://docbook.org/ns/docbook", type = Link.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://docbook.org/ns/docbook", type = Author.class, required = false),
        @XmlElementRef(name = "citetitle", namespace = "http://docbook.org/ns/docbook", type = Citetitle.class, required = false),
        @XmlElementRef(name = "productnumber", namespace = "http://docbook.org/ns/docbook", type = Productnumber.class, required = false),
        @XmlElementRef(name = "volumenum", namespace = "http://docbook.org/ns/docbook", type = Volumenum.class, required = false),
        @XmlElementRef(name = "abstract", namespace = "http://docbook.org/ns/docbook", type = Abstract.class, required = false),
        @XmlElementRef(name = "bibliomisc", namespace = "http://docbook.org/ns/docbook", type = Bibliomisc.class, required = false),
        @XmlElementRef(name = "glossterm", namespace = "http://docbook.org/ns/docbook", type = Glossterm.class, required = false),
        @XmlElementRef(name = "legalnotice", namespace = "http://docbook.org/ns/docbook", type = Legalnotice.class, required = false),
        @XmlElementRef(name = "org", namespace = "http://docbook.org/ns/docbook", type = Org.class, required = false),
        @XmlElementRef(name = "footnoteref", namespace = "http://docbook.org/ns/docbook", type = Footnoteref.class, required = false),
        @XmlElementRef(name = "annotation", namespace = "http://docbook.org/ns/docbook", type = Annotation.class, required = false)
    })
    @XmlMixed
    protected List<Object> content;
    @XmlAttribute(name = "role")
    @XmlSchemaType(name = "anySimpleType")
    protected String role;
    @XmlAttribute(name = "relation")
    @XmlSchemaType(name = "anySimpleType")
    protected String relation;
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
    @XmlAttribute(name = "linkend")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object linkend;
    @XmlAttribute(name = "href", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String href;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkType;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkRole;
    @XmlAttribute(name = "arcrole", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String arcrole;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    @XmlSchemaType(name = "anySimpleType")
    protected String xlinkTitle;
    @XmlAttribute(name = "show", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String show;
    @XmlAttribute(name = "actuate", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String actuate;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cover }
     * {@link Pagenums }
     * {@link Releaseinfo }
     * {@link Olink }
     * {@link Orgname }
     * {@link Edition }
     * {@link Titleabbrev }
     * {@link String }
     * {@link Address }
     * {@link Contractsponsor }
     * {@link Editor }
     * {@link Extendedlink }
     * {@link Abbrev }
     * {@link Phrase }
     * {@link Person }
     * {@link Printhistory }
     * {@link Productname }
     * {@link Personblurb }
     * {@link Copyright }
     * {@link Acronym }
     * {@link Itermset }
     * {@link Bibliosource }
     * {@link Bibliorelation }
     * {@link Date }
     * {@link Publisher }
     * {@link Replaceable }
     * {@link Revhistory }
     * {@link Othercredit }
     * {@link Biblioref }
     * {@link Collab }
     * {@link Biblioset }
     * {@link Inlinemediaobject }
     * {@link Anchor }
     * {@link Bibliomset }
     * {@link Title }
     * {@link Personname }
     * {@link Firstterm }
     * {@link Indexterm }
     * {@link Subtitle }
     * {@link Foreignphrase }
     * {@link Coref }
     * {@link Wordasword }
     * {@link Keywordset }
     * {@link Footnote }
     * {@link Remark }
     * {@link Xref }
     * {@link Subjectset }
     * {@link Authorgroup }
     * {@link Citerefentry }
     * {@link Superscript }
     * {@link Subscript }
     * {@link Quote }
     * {@link Citebiblioid }
     * {@link Authorinitials }
     * {@link Emphasis }
     * {@link Pubdate }
     * {@link Artpagenums }
     * {@link Bibliocoverage }
     * {@link Publishername }
     * {@link Biblioid }
     * {@link Confgroup }
     * {@link Alt }
     * {@link Issuenum }
     * {@link Mediaobject }
     * {@link Seriesvolnums }
     * {@link Contractnum }
     * {@link Link }
     * {@link Author }
     * {@link Citetitle }
     * {@link Productnumber }
     * {@link Volumenum }
     * {@link Abstract }
     * {@link Bibliomisc }
     * {@link Glossterm }
     * {@link Legalnotice }
     * {@link Org }
     * {@link Footnoteref }
     * {@link Annotation }
     * 
     * 
     */
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
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
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
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

    /**
     * Gets the value of the linkend property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLinkend() {
        return linkend;
    }

    /**
     * Sets the value of the linkend property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLinkend(Object value) {
        this.linkend = value;
    }

    /**
     * Gets the value of the href property.
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
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the xlinkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkType() {
        return xlinkType;
    }

    /**
     * Sets the value of the xlinkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkType(String value) {
        this.xlinkType = value;
    }

    /**
     * Gets the value of the xlinkRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkRole() {
        return xlinkRole;
    }

    /**
     * Sets the value of the xlinkRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkRole(String value) {
        this.xlinkRole = value;
    }

    /**
     * Gets the value of the arcrole property.
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
     * Sets the value of the arcrole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArcrole(String value) {
        this.arcrole = value;
    }

    /**
     * Gets the value of the xlinkTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXlinkTitle() {
        return xlinkTitle;
    }

    /**
     * Sets the value of the xlinkTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXlinkTitle(String value) {
        this.xlinkTitle = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShow() {
        return show;
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShow(String value) {
        this.show = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActuate() {
        return actuate;
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActuate(String value) {
        this.actuate = value;
    }

}
