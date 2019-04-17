package com.xworkz.xmlproject;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Student {
	
	public void marshall(){ //convert object into xml
		
		try {
			
			StudentInfo info=new StudentInfo(1,"omsir","oms@gmail.com");
			JAXBContext context=JAXBContext.newInstance(StudentInfo.class);
			Marshaller ms= context.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ms.marshal(info,System.out);
			ms.marshal(info, new File("D:/Arvind/student1.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public  void  unMarshall() {
		
		try {
			
			File file=new File("D:/Arvind/student1.xml");
			JAXBContext context =JAXBContext.newInstance(StudentInfo.class);
			Unmarshaller um=context.createUnmarshaller();
			StudentInfo info= (StudentInfo) um.unmarshal(file);
			System.out.println("Student information");
			System.out.println(info.getId()+" "+info.getEmail()+" "+info.getName());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
