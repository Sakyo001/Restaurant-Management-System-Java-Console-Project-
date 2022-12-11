package group8;
import java.util.*;

public class main {
	
	 public static String name = "";
	 public static String number = "";
	 public static String address = "";
	 public static Scanner sc = new Scanner(System.in);
	  public static int option = 0, quantity = 0, total = 0, option2 = 0, option3 = 0, option4 = 0;
	  public static int stock1 = 100, stock2 = 100, stock3 = 100, stock4 = 100, stock5 = 100, stock6 = 100, stock7 = 100, stock8 = 100, stock9 = 100, stock10 = 100, stock11 = 100, stock12 = 100, stock13 = 100;
	  
	  
	  public static String [] arr = {"none", "Chicken Fillet", "Chicken Sizzling","Chicken Curry", "Pasta", "Spaghetti", "Tacos",  "Lasagna", "Coke", "Water", "Flavored Milk", "Sprite", "Lemon Juice", "Caramel Latte Coffee"};
	    
	  static void order(){
	      System.out.print("*********************************************\n\t         "
	      		+ " Menu \n*********************************************\nDishes \t\t\t\t Prices \n\n[1]. Chicken Fillet \t\t 150.00php\n[2]. Chicken Sizzling \t\t 100.00php \n[3]. Chicken Curry \t\t 170.00php"
	      		+ "\n[4]. Pasta \t\t\t 80.00php \n[5]. Spaghetti \t\t\t 70.00php \n[6]. Tacos \t\t\t 80.00php \n[7]. Lasagna \t\t\t 120.00php \n[8]. Coke \t\t\t 20.00php \n[9]. Water \t\t\t 15.00php \n[10]. Flavored Milk \t\t 29.00php\n[11]. Sprite \t\t\t 29.00php"
	      		+ "\n[12]. Lemon Juice \t\t 29.00php \n[13]. Caramel Latte Coffee \t 39.00php \n*********************************************\n");
	  }
	  
	  static void again(){
	    System.out.print("do you want to order again?\npress 1 for Yes and 2 for No:");
	  }
	  
	  static void instruct1(){
	    System.out.print("Enter the number you want to order: ");
	  }
	  
	  
	  static void info() {
		  System.out.println("***********************************");
		  System.out.println("");
		  System.out.println("	Personal Information");
		  System.out.println("");
		  System.out.println("***********************************");
		  System.out.println("Enter Your Name: ");
		  name = sc.nextLine();	  
		  System.out.println("Enter Your Phone Number: ");
		  number = sc.nextLine();
		  System.out.println("Enter Your Address: ");
		  address = sc.nextLine();
		  System.out.println("");
		
		  
	  }
	  
	  static void ui(){
	  System.out.println("");
	  do {
	    order();
	    instruct1();
	    option = sc.nextInt();
	    if (option == 1){
	      youOrdered();     
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	        System.out.println("insufficient supply");
	      } else{
	      stock1 = stock1 - quantity;
	      System.out.println("stock/s left: " + stock1);
	      }      
	      total = total + (quantity * 155);
	      again();
	      option2 = sc.nextInt();
	      if (option2 == 1){
	        
	      } else{
	        receipt();
	      }
	    }  else if (option == 2) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }      
	      total = total + (quantity * 100);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 3) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 170);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 4) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 80);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 5) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 70);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 6) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 80);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 7) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 120);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 8) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 20);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 9) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 15);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 10) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 29);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 11) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 29);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 12) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 29);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } else if (option == 13) {
	     youOrdered();
	      System.out.print("how many " + arr[option] + "?");
	      quantity = sc.nextInt();
	      if (quantity > 100){
	          System.out.println("insufficient supply");
	        } else{
	        stock1 = stock1 - quantity;
	        System.out.println("stock/s left: " + stock1);
	        }    
	      total = total + (quantity * 29);
	      again();
	      option2 = sc.nextInt();
	       if (option2 == 1){
	      
	       }
	      else{
	        receipt();
	      }    
	   } 
	   


	     else {
	     System.out.println("Invalid syntax");
	   }  
	  } while (option2 == 1);
	 }
	 
	 
	  
	  static void youOrdered(){
	    System.out.println("you ordered: " + arr[option]);
	  }
	  
	  static void receipt(){
	    System.out.println("");  System.out.println("*********************************************");  
	    System.out.println("Hello, " + name);
	    System.out.println("The total of your order is: " + total);   System.out.println("*********************************************");
	  }
	  
	  static void display(){
	  System.out.println(""); System.out.println("**************************************************");
	  System.out.println("");
	  System.out.println("	1. Menu");
	  System.out.println("	2. Order"); 
	  System.out.println("");
	  System.out.println("**************************************************");
	    System.out.print("Enter 1 for Menu and 2 for Order: ");
	    option3 = sc.nextInt();
	    if (option3 == 1){
	      menu();
	    } else if(option3 == 2){
	      ui();
	    }
	     else{
	      System.out.println("Invalid Input Please Try Again");
	      display();
	    }
	    
	  }
	  
	  static void menu(){
	   System.out.println("");
	   order();
	   System.out.print("press 2 for back: ");
	   option4 = sc.nextInt();
	   if (option4 == 2){
	     display();
	   } else{
	   }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		info();
		display();
	}

}
