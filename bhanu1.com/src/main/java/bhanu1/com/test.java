package bhanu1.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{   
public static void main(String[] args)
{  
     ApplicationContext ctx = new ClassPathXmlApplicationContext("Applicationcontext.xml");
		EmpDao e=(EmpDao) ctx.getBean("edao");
	    Employee emp =new Employee();
	    emp.setId(1);
	    emp.setName("roopa");
	    emp.setCmp("dell");
	    e.save(emp);
	    //e.update(emp);
	    System.out.println("done");
}
}