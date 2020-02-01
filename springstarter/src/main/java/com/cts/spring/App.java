package com.cts.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    	Teacher teach = context.getBean("theTeacher",Teacher.class);

    	      teach.work();
    	    }
    	

    }

