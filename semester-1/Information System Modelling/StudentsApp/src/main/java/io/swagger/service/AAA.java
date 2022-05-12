package io.swagger.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.swagger.model.Student;
import io.swagger.model.Students;

public class AAA {

	//Initialize the employees list
	static Students sts = new Students();
	static
	{   Student st1 = new Student();
	    st1.setName("Jan");
	    st1.setSurname("Kowalski");
	    st1.setRollNo(1L);
	    Student st2 = new Student();
	    st2.setName("Adam");
	    st2.setSurname("Nowak");
	    st2.setRollNo(2L);
	    sts.add(st1);
	    sts.add(st2);
	}
	private static void marshalingExample() throws JAXBException, JsonProcessingException
	{
		
		
		
	    JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	     
	    //Marshal the employees list in console
	    jaxbMarshaller.marshal(sts, System.out);
	     
		
/*        JacksonXmlModule xmlModule = new JacksonXmlModule();
        xmlModule.setDefaultUseWrapper(false);
        ObjectMapper objectMapper = new XmlMapper(xmlModule);

        // Indentation
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

        // JAXB annotations
        objectMapper.registerModule(new JaxbAnnotationModule());

        System.out.println(objectMapper.writeValueAsString(sts));
	*/	
	}
	
	public static void main(String[] args) throws JAXBException, JsonProcessingException {
		marshalingExample();
	}

}
