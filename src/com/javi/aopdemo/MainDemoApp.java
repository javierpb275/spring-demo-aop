package com.javi.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.javi.aopdemo.dao.AccountDAO;
import com.javi.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {
		
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		
		// get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);
		
		//Get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAO", MembershipDAO.class);
		
		
		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);//will only match on addAccount for this param type
		
		// call the membership business method
		theMembershipDAO.addSillyMember();//will not match
		
		
		// close the context
		context.close();

		
	}

}
