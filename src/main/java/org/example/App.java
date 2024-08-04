package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Dev obj= (Dev) context.getBean("dev");//this is just referring to the object from the IOC container.
        //System.out.println(obj.getDevAge());
        obj.code();

    }
}
