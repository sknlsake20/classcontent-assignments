package com.src;
import java.util.*;
import java.util.Scanner;

class Account
{
    String name,acc_type;
    int setpin;
    int Acc_num,Acc_Balance;
    Account(){
      
    }
        Account(String n,int p,int acc_num,int b,String a_t){
            name=n;
            setpin=p;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
        }
} 

class create_account extends Account
{
    create_account(String n,int p,int acc_num,int b,String a_t)
    { 
            name=n;
            setpin=p;
            Acc_num=acc_num;
            Acc_Balance=b;
            acc_type=a_t;
    }
    create_account()
    {
        super();
    }
        
    void insert(String n,int p,int acc_num,String a_t)
    {
        name=n;
        setpin=p;
        acc_type=a_t;
        Acc_num=acc_num; 
        Acc_Balance=0;
    }
    
    void display_details(){
        System.out.println("Depositor Name :" +name);
        System.out.println("Account Number : "+Acc_num);
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Account Type : "+acc_type);
        
    }
 
        void deposite(int acc_num,int money)
        {                 
                Acc_Balance=money;    
        }
        
        int withdraw(int withd){
                Acc_Balance=Acc_Balance-withd;
                return Acc_Balance;
        }
        
        
       void Update_Name(int no1) {
        	if(no1==Acc_num)
        	{
        		System.out.println("Enter The Name To Be Update : ");
        		Scanner sc=new Scanner(System.in);
        		String upname=sc.next();
        		
        		name=upname;
        		System.out.println("Account Updated Successfully!");
        	}
        	else
        	{
        		System.out.println("Enter The Account Number Correctly : ");
        		Scanner sc=new Scanner(System.in);
        		no1=sc.nextInt();
        		Update_Name(no1);
        		
        	}
        	
       }


         void Update_Pin(int no1)
         {
        	if(no1==Acc_num)
        	{
        		System.out.println("Enter The Pin To Be Update : ");
        		Scanner in=new Scanner(System.in);
        		int uppin=in.nextInt();
        		
        	    setpin = uppin;
        		System.out.println("Account Updated Successfully!");
        	}
        	else
        	{
        		System.out.println("Enter The Account Number Correctly : ");
        		Scanner in=new Scanner(System.in);
        		no1=in.nextInt();
        		Update_Name(no1);
        		
        	}
        	
        }
  
}       
public class Bank {
    public static void main(String args[]){
        String user_name=null,type;
        type = null;
        int balance=0,tmp=0;
        int withd=0,cb=0; 
        int pin;
        int aNumber = 0; 
aNumber = (int)((Math.random() * 900000)+1000000); 

        create_account user = new create_account("user",0,0,0,"savings"); 
    
            Scanner in = new Scanner(System.in);
            Scanner strng=new Scanner(System.in);
            int userChoice;
            boolean quit = false;

            do {
                  System.out.println("1. Create Account");
                  System.out.println("2. Deposit money");
                  System.out.println("3. Withdraw money");
                  System.out.println("4. Check balance");
                  System.out.println("5. Display Account Details");
                  System.out.println("6. update Account Details");
                  System.out.println("0. to quit: \n");
                  System.out.print("Enter Your Choice : ");
                  userChoice = in.nextInt();
                  switch (userChoice) {
                      
                  case 1:
                        System.out.print("Enter your Name : ");
                        user_name=strng.nextLine(); 
                        System.out.print("Enter Accout Type(savings/salary) : ");
                        type=in.next();
                        System.out.print("Enter the 4-digit pin : ");
                        pin=in.nextInt();
                        user.insert(user_name,pin, aNumber, type);  
                        System.out.println("\n\tYour Account Details\n\tDont Forget Account Number\n");
                        System.out.println("**********");                       
                        user.display_details();
                        break;
                      
                case 2: 
                    System.out.print("Enter your account Number : ");
                    tmp=in.nextInt();
                    if(tmp==user.Acc_num)
                    {
                       System.out.print("Enter Amount Of Money : ");
                       balance=in.nextInt();
                       user.Acc_Balance=balance;
                       System.out.println("\t Successfully Deposited.");
                    }                
                   else
                       System.out.println("Sorry,invalid Account Number.please check!!!");          
                   break;
                    
                 case 3:                     
                     System.out.print("Enter your account Number : ");
                      tmp=in.nextInt();
                      
                          if(tmp==user.Acc_num)
                          {                         
                             if(user.Acc_Balance==0)
                             System.out.print("Your Account is Empty.");
                             
                             else
                             {
                                 System.out.print("Enter Amout Of Money : ");   
                                 withd=in.nextInt();  
                             
                                 if(withd>user.Acc_Balance)
                                 {
                                	System.out.print("There is no sufficient money in your account ");
                                    System.out.print("Enter Valid Amout of Money : ");
                                    withd=in.nextInt();
                                 }
                                 else
                                    cb= user.withdraw(withd);
                                    System.out.println("Your Current Balance : "+cb);   
                                 }
                             }
                          else
                             System.out.println("Sorry,invalid Account Number.Please check!!!");  
                        break;
     
                  case 4:

                      System.out.print("Enter your Account Number : ");
                      tmp=in.nextInt();
                      
                             if(tmp==user.Acc_num)
                             {
                                System.out.println("Your Current Balance : "+user.Acc_Balance);
                             }
                             else
                                System.out.println("Sorry,invalid Accoount Number.Please check!!!");                         
                      break;
                      
                  case 5: 
                          
                      System.out.print("Enter your Account Number :");
                      tmp=in.nextInt();                     
                             if(tmp==user.Acc_num)
                             {                               
                               user.display_details();                             
                             }
                             else
                                System.out.println("Sorry,invalid Account Number.Please check!!!");
                             
                      break;
                      
                  case 6:
                	  
                	  int ch=0;
          			  do
          			  {
          			   System.out.println("Select The Option You Want to Update  :");
          			   System.out.println("1. Name");
          			   System.out.println("2. Pin");
          			   System.out.println("3. Exit");
          			   ch=in.nextInt();
          			   int no1;

          			   switch(ch)
          			   {
          			    case 1:
          			    	
          				    System.out.println("Enter the Account Number You Want To Update Name : ");
          				    no1=in.nextInt();
          				    user.Update_Name(no1);
          				    break;
          				    
          			    case 2:
          			    	
          				    System.out.println("Enter the Account Number You Want To Update Pin : ");
          				    no1=in.nextInt();
          				    user.Update_Pin(no1);
          				    break;
          			   }
          			  }while(ch<3);
          			
          			break;
          			
                  case 0:
                        quit = true;
                        break;
                  default:
                        System.out.println("Wrong Choice.");
                        break;
                  }
                  System.out.println("\n");
            } while (!quit);
            System.out.println("Thanks for visiting our Bank !");
             
     }
}

	