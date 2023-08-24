package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.commons.collections4.functors.CatchAndRethrowClosure;

public class PropertiesUtility {
	
	private Properties property;
	
	public void propertiesInit(String filepath) {
		FileInputStream fis=null;
		try {
	 fis=new FileInputStream(filepath);
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}
		property=new Properties();
		try {
			property.load(fis);
		}
	
	
	
	
	

}
