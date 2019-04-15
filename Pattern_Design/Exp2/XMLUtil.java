import javax.xml.parsers.*;
import org.w3c.dom.*;
import of.xml.sax.SAXException;
import java.io.*;
public class XMLUtil{
	public static Object getBean(){
	try{
		DocumentBuilderFactory dFactroy = DocumentBuilderFactory.newInstance();
		DocummentBuilder builder = dFactory.newDocumentBuilder();
		Document doc;
		doc = builder.parse(new file("config.xml"));
		
		NodeList nl = doc.getElementsByTagName("className");
		Node classNode = nl.item(0).getFirstChild();
		String cName = classNode.getNodeValue();
		
		Class c = Class.forName(cName);
		Object obj  = c.newInstance();
		return obj;
		}
	catch(Execption e){
		e.printStackTrace();
		return null;
		}
	}
}


		
