package lesson16;

import jdk.internal.org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XSDExample {
    public static void main(String[] args) {
        boolean answer = validateXMLSchema("src/main/java/lesson16/comp.xsd", "src/main/java/lesson16/comp.xml");
        System.out.println("Result:" + answer);
    }

    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (IOException | org.xml.sax.SAXException e) {
            System.out.println("Exception: " + e.getMessage());
            return false;
        }
        return true;
    }
}
