package com.text;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test
{  
		public static void main(String[] args) {  
		    Resource resource=new ClassPathResource("roopa.xml");  
		    BeanFactory factory=new XmlBeanFactory(resource);  
		      
		    teachers st=(teachers)factory.getBean("teachers");  
		    st.display();  
		}  
		 
}
