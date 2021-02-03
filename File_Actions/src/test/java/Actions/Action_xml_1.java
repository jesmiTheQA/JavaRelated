package Actions;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Action_xml_1 {

	
	public static final String xmlFilePath = "D:\\U42020\\Non-Project\\Space for Eclipse\\Selef Learn/File_Actions_Help/xmlfile.xml";
	DocumentBuilderFactory documentFactory ;
	DocumentBuilder documentBuilder;
	Document document;
	Element root;
	Element employee;
	
	
	public static void main(String[] args) {
       try{
			

    	   Action_xml_1 obj=new Action_xml_1();
//    	   obj.create_xml();
//    	   obj.addNewNode_xml("Salary",0,"50000");
//    	   obj.addNewNode_xml("Salary",1,"60000");
//    	   obj.updateExixtingNodeValue_xml(0, "Salary", "100000");
//    	   obj.updateExixtingNodeValue_xml(1, "Salary", "15000");
    	   obj.deleateExistingNnode(0,"Salary");
    	   obj.deleateExistingNnode(1,"Salary");
//    	   obj.update_xml();
		}
		catch(Exception e){
			System.out.println("Issue is from main() method "+e.toString());
		}

	}
	
	
	
	/* To create a new xml file . It is working fine   */
	private void create_xml(){

		try{
			
			documentFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentFactory.newDocumentBuilder();
			document = documentBuilder.newDocument();

			// root element
			root = document.createElement("company");
			document.appendChild(root);
			create_sub("100","James","Harley","james@example.org","Human Resources");
			create_sub("101","Thomsa","M","thomsa@example.org","Human Resources");

			
			// create the xml file
			//transform the DOM Object to an XML File
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			StreamResult streamResult = new StreamResult(new File(xmlFilePath));
			transformer.transform(domSource, streamResult);

			System.out.println("Done creating XML File");
		}
		catch (Exception e) {
			System.out.println("Issue is from create_xml() method "+e.toString());
		}
		
	}
	
	/* To add a new node to existing xml file. It is working fine */
	private void addNewNode_xml(String nodeName,int intex,String e_salary){
		try{
			
			documentFactory = DocumentBuilderFactory.newInstance(); 
	        documentBuilder = documentFactory.newDocumentBuilder();
	        document = documentBuilder.parse(xmlFilePath);
	        
	        // Get employee by tag name
            //use item(0) to get the first node with tage name "employee"
            Node employee = document.getElementsByTagName("employee").item(intex);
            
            // append a new node to the first employee
            Element salary = document.createElement(nodeName);
            salary.appendChild(document.createTextNode(e_salary));
            employee.appendChild(salary);
            
            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
            
            System.out.println("New node added");
		}
		catch(Exception e){
			System.out.println("Issue is from addNewNode_xml() method "+e.toString());
		}
	}
	
	/* To update existing node value in xml file.It is working fine  */
	private void updateExixtingNodeValue_xml(int intex,String nodeName,String values){
		try{
			
			documentFactory = DocumentBuilderFactory.newInstance(); 
	        documentBuilder = documentFactory.newDocumentBuilder();
	        document = documentBuilder.parse(xmlFilePath);
	        
	        // Get employee by tag name
            //use item(0) to get the first node with tage name "employee"
            Node employee = document.getElementsByTagName("employee").item(intex);
            
            
            NodeList nodes = employee.getChildNodes();
            
            for (int i = 0; i < nodes.getLength(); i++) {
            	 
                Node element = nodes.item(i);
 
                if (nodeName.equals(element.getNodeName())) {
                    element.setTextContent(values);
                }
            }
 
            

 

            
            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
 
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
 
            System.out.println("Existing node value updated in XML File.");
            
            
		}
		catch(Exception e){
			System.out.println("Issue is from updateExixtingNodeValue_xml() method "+e.toString());
		}
	}
	
	private void deleateExistingNnode(int intex,String nodeName){
		try{
			
			documentFactory = DocumentBuilderFactory.newInstance(); 
	        documentBuilder = documentFactory.newDocumentBuilder();
	        document = documentBuilder.parse(xmlFilePath);
	        
	        
	        // Get employee by tag name
            //use item(0) to get the first node with tage name "employee"
            Node employee = document.getElementsByTagName("employee").item(intex);
            
            
            NodeList nodes = employee.getChildNodes();
            
            for (int i = 0; i < nodes.getLength(); i++) {
            	 
                Node element = nodes.item(i);
 
                if (nodeName.equals(element.getNodeName())) {
                  employee.removeChild(element);
              }
            }
 
            
            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
 
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
 
            System.out.println("Specvfied node is removed from existing XML File.");
            
            
		}
		catch(Exception e){
			System.out.println("Issue is from deleateExistingNnode() method "+e.toString());
		}
	}
	private void update_xml(){
		try{
			
			documentFactory = DocumentBuilderFactory.newInstance(); 
	        documentBuilder = documentFactory.newDocumentBuilder();
	        document = documentBuilder.parse(xmlFilePath);
	        
	     // Get employee by tag name
            //use item(0) to get the first node with tage name "employee"
            Node employee = document.getElementsByTagName("employee").item(0);
 
            // update employee , set the id to 10
            NamedNodeMap attribute = employee.getAttributes();
            Node nodeAttr = attribute.getNamedItem("id");
            nodeAttr.setTextContent("100");
 
            // append a new node to the first employee
            Element fname = document.createElement("firstname");
            fname.appendChild(document.createTextNode("34 Stanley St."));
            employee.appendChild(fname);
 
            // loop the employee node and update salary value, and delete a node
//            NodeList nodes = employee.getChildNodes();
// 
//            for (int i = 0; i < nodes.getLength(); i++) {
// 
//                Node element = nodes.item(i);
// 
//                if ("salary".equals(element.getNodeName())) {
//                    element.setTextContent("2000000");
//                }
// 
//                // remove firstname
//                if ("firstname".equals(element.getNodeName())) {
//                    employee.removeChild(element);
//                }
// 
//            }
            
            // write the DOM object to the file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
 
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);
 
            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);
 
            System.out.println("The XML File was ");
	 
		}
		catch(Exception e){
			
			System.out.println("Issue is from update_xml() method "+e.toString());
		}
	}
	
	private void create_sub(String e_id,String e_fname,String e_lastname,String e_email,String e_department){
		Element employee = document.createElement("employee");
		root.appendChild(employee);

		// set an attribute to staff element
		Attr attr = document.createAttribute("id");
		attr.setValue(e_id);
		employee.setAttributeNode(attr);

		//you can also use staff.setAttribute("id", "1") for this

		// firstname element
		Element firstName = document.createElement("firstname");
		firstName.appendChild(document.createTextNode(e_fname));
		employee.appendChild(firstName);

		// lastname element
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode(e_lastname));
		employee.appendChild(lastname);

		// email element
		Element email = document.createElement("email");
		email.appendChild(document.createTextNode(e_email));
		employee.appendChild(email);

		// department elements
		Element department = document.createElement("department");
		department.appendChild(document.createTextNode(e_department));
		employee.appendChild(department);
	}
	

}
