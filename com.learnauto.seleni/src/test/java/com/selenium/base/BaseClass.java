package com.selenium.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class BaseClass {
	Properties prop;
	File f=null;
	InputStream fio = null;
	String xpath;
	ReadExcel ex=new ReadExcel("./src/test/data/LocatorData.xlsx");
	
	
	
	/*public String returnConfiguration(String str) throws Exception {
		f = new File("./src/test/data/Config.properties");     //path to property file configured.Create an object of File
		fio = new FileInputStream(f);                       //the data in file f is loaded into fio as input stream
		prop = new Properties();                            //object of properties class created
		prop.load(fio);
	    return prop.getProperty(str);
	}*/
   public String returnXpath(String pageName,String elementName) throws Exception{
	  int row=ex.getRowNum(0);
	  for(int x=1;x<=row;x++){                     //looping through the rows
  		  String page=ex.getData(0,x,0);   //will set each value in the first column in page variable 
          String element=ex.getData(0,x,1); //ws.getRow(x).getCell(1).getStringCellValue(); //similarly for second column in element variable
          if((pageName.equalsIgnoreCase(page))&&(elementName.equalsIgnoreCase(element))){
          	xpath=ex.getData(0,x,2);  
          	break;   //break loop when the right xpath is found
          	}
          }
	    ex.closeExcel(); 
	    return xpath;
   }
   
}
