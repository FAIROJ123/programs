package com.bridgeit.objectorientedprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ReggularExpression
{
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	   
	    String fullName=null,fName=null,phoneNumber=null,message=null;
	  
	    String s="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
       
        System.out.println("enter the name:");
        String str1=sc.nextLine();
        String msg1="<<name>>";
       
        System.out.println("enter the full name:");
        String str2=sc.nextLine();
        String msg2="<<full name>>";
       
        System.out.println("enter the mobilenumber:");
        String str3=sc.nextLine();
        String msg3="91-xxxxxxxxxx";
       
        System.out.println("enter the date:");
        String str4=sc.nextLine();
        String msg4="01/01/2016";
        String msg=null;
        msg=s.replace(msg1, str1);
        System.out.println("The modified message is:"+msg);
        msg=s.replace(msg2, str2);
        System.out.println("The modified message is:"+msg);
        msg=s.replace(msg3, str3);
        System.out.println("The modified message is:"+msg);
        msg=s.replace(msg4, str4);
        System.out.println("The modified message is:"+msg);
        
     
        		
        		{
        	
        		}
	}


}
