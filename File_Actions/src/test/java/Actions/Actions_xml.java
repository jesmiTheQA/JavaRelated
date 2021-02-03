package Actions;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Actions_xml {
	
	public static final String xmlFilePath = "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/xmlfile.xml";
	DocumentBuilderFactory documentFactory ;
	DocumentBuilder documentBuilder;
	Document document;
	Element root;
	Element employee;
	
	@BeforeMethod
	public void common(){
		try{
			

		}
		catch(Exception e){
			System.out.println("Issue is from main() method "+e.toString());
		}
	}

	@Test(enabled = true)
	private void create_xml(){

		try{
			
			documentFactory = DocumentBuilderFactory.newInstance();

			documentBuilder = documentFactory.newDocumentBuilder();

			document = documentBuilder.newDocument();

			// root element
			root = document.createElement("company");
			document.appendChild(root);
			create_sub();

//			// employee element
//			employee = document.createElement("employee");
//			root.appendChild(employee);
//
//			// set an attribute to staff element
//			Attr attr = document.createAttribute("id");
//			attr.setValue("10");
//			employee.setAttributeNode(attr);
//
//			//you can also use staff.setAttribute("id", "1") for this
//
//			// firstname element
//			Element firstName = document.createElement("firstname");
//			firstName.appendChild(document.createTextNode("James"));
//			employee.appendChild(firstName);
//
//			// lastname element
//			Element lastname = document.createElement("lastname");
//			lastname.appendChild(document.createTextNode("Harley"));
//			employee.appendChild(lastname);
//
//			// email element
//			Element email = document.createElement("email");
//			email.appendChild(document.createTextNode("james@example.org"));
//			employee.appendChild(email);
//
//			// department elements
//			Element department = document.createElement("department");
//			department.appendChild(document.createTextNode("Human Resources"));
//			employee.appendChild(department);

			
			// create the xml file
			//transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(xmlFilePath));

			// If you use
			// StreamResult result = new StreamResult(System.out);
			// the output will be pushed to the standard output ...
			// You can use that for debugging 

			transformer.transform(domSource, streamResult);

			System.out.println("Done creating XML File");
		}
		catch (Exception e) {
			System.out.println("Issue is from create_xml() method "+e.toString());
		}
		
	}
	
	private void create_sub(){
		Element employee = document.createElement("employee");
		root.appendChild(employee);

		// set an attribute to staff element
		Attr attr = document.createAttribute("id");
		attr.setValue("10");
		employee.setAttributeNode(attr);

		//you can also use staff.setAttribute("id", "1") for this

		// firstname element
		Element firstName = document.createElement("firstname");
		firstName.appendChild(document.createTextNode("James"));
		employee.appendChild(firstName);

		// lastname element
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("Harley"));
		employee.appendChild(lastname);

		// email element
		Element email = document.createElement("email");
		email.appendChild(document.createTextNode("james@example.org"));
		employee.appendChild(email);

		// department elements
		Element department = document.createElement("department");
		department.appendChild(document.createTextNode("Human Resources"));
		employee.appendChild(department);
	}
	
	
	@Test(enabled = false)
	private void update_xml(){
		try{
			
			
		}
		catch(Exception e){
			
			System.out.println("Issue is from update_xml() method "+e.toString());
		}
	}
	
}


    
