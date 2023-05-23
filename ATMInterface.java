package project;
import java.util.Scanner;

public class ATMInterface {
	
	  public static void main(String args[] )  
	    {  
	         
	        int balance = 0, withdraw, deposit;  
	        @SuppressWarnings("resource")
	       Scanner sc = new Scanner(System.in);  
	          
	        while(true)  
	        {  
	            System.out.println("**********ATM Machine********** \n");  
	            System.out.println("Select 1 for Deposit");  
	            System.out.println("Select 2 for Withdraw");  
	            System.out.println("Select 3 for Check Current Balance");  
	            System.out.println("Select 4 for Terminate\n");  
	            
	            System.out.print("Select the operation:"); 
	            int select = sc.nextInt();  
	            switch(select)  
	            {
	            case 1:  
                    
	    	        System.out.print("Enter Amount To Be Deposited:");  
	    	                      
	    	         deposit = sc.nextInt();  
	    	                      
	    	         
	    	        balance = balance + deposit;  
	    	        System.out.println("Your Valid Amount Has Been Successfully Deposited");  
	    	        System.out.println("");  
	    	        break; 

	              
	             case 2: 
	                	
	        	        System.out.print("Enter Amount To Withdraw Money : ");  
	        	                      
	        	        
	        	        withdraw = sc.nextInt();  
	        	                      
	        	        
	        	        if(balance >= withdraw)  
	        	        {  
	        	            balance = balance - withdraw;  
	        	            System.out.println("Kindely Collect Your Money");  
	        	        }  
	        	        else  
	        	        {  
	        	            
	        	            System.out.println("Insufficient Balance");  
	        	        }  
	        	        System.out.println("");  
	        	        break;  
	        	   
	   
	                case 3:  
	         
	        System.out.println("Current Balance : "+balance);  
	        System.out.println("");  
	        break;  
	   
	                case 4:  
	     
	        System.exit(0);  
	            }  
	        }  
	    }  
	} 


