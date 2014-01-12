package highLevelLanguage.utils;

import java.io.ByteArrayInputStream;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

public class XmlFormatter {
    Node document;
    boolean keepDeclaration;

    public XmlFormatter(String xml) {
	try {
	    this.document = DocumentBuilderFactory.newInstance()
		    .newDocumentBuilder()
		    .parse(new ByteArrayInputStream(xml.getBytes()))
		    .getDocumentElement();
	    this.keepDeclaration = xml.startsWith("<?xml");
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    public String getXML() {
	try {
	    DOMImplementationRegistry registry = DOMImplementationRegistry
		    .newInstance();
	    DOMImplementationLS impl = (DOMImplementationLS) registry
		    .getDOMImplementation("LS");
	    LSSerializer writer = impl.createLSSerializer();

	    writer.getDomConfig().setParameter("format-pretty-print", true); // Set
									     // this
									     // to
									     // true
									     // if
									     // the
									     // output
									     // needs
									     // to
									     // be
									     // beautified.
	    writer.getDomConfig().setParameter("xml-declaration",
		    keepDeclaration); // Set this to true if the declaration is
				      // needed to be outputted.

	    return writer.writeToString(document);
	} catch (Exception e) {
	    e.printStackTrace();
	    return null;
	}
    }

    // public static void main(String[] args) {
    // String xml =
    // "<shiporder orderid=\"889923\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:noNamespaceSchemaLocation=\"shiporder.xsd\"><orderperson>John Smith</orderperson><shipto><name>Ola Nordmann</name><address>Langgt 23</address><city>4000 Stavanger</city><country>Norway</country></shipto><item><title>Empire Burlesque</title><note>Special Edition</note><quantity>1</quantity><price>10.90</price></item><item><title>Hide your heart</title><quantity>1</quantity><price>9.90</price></item></shiporder>";
    //
    // System.out.println(new XmlFormatter(xml).getXML());
    // }
}
