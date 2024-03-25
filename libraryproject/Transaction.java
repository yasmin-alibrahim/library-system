/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.text.SimpleDateFormat;
import java.util.*;
public class Transaction {
  private int id;
  static int i=0;
  private Date transDate;
  private Date returnDate;
  private String transType;
    ArrayList<Item> items;
    public Transaction(ArrayList<Item> items)
    {
        System.out.println("To insert New Transaction press enter");
         this.add();
    }
   
    public Transaction(String transType,Date transDate,ArrayList<Item> items)
    {
      i++;
      id=i;
      this.transDate=transDate;              
      this.transType=transType;
      this.items=items;
    }
    public Transaction(String transType,Date transDate,Date returnDate,ArrayList<Item> items)
    {
      
     this(transType,transDate,items);i++;
      id=i;
      this.returnDate=returnDate;
    }
    public void add()
    {
    i++;
      id=i;
      Scanner s=new Scanner(System.in);
     if(s.hasNextLine()){
        System.out.println("Enter Type of Item Tranaction:");
     transType=s.next(); 
       System.out.println("Enter Transaction Date (dd/mm/yyyy):");
    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
       String sd=s.nextLine();
       System.out.println("Enter Return Date (dd/mm/yyyy):");
    SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
       String sd1=s.nextLine();
     if(null!=sd && sd.trim().length()>0)       
     try {
         transDate=format.parse(sd);
         returnDate=format1.parse(sd);
} catch (Exception ex) {
         System.out.println("Error in Date Format");
} 
     }           
    
    }
    public void print()
    {
     System.out.println("ID:"+id);
     System.out.println(" Type of Transaction:"+transType);
     System.out.println(" Date of Transaction:"+transDate);
      System.out.println(" Date of Return:"+returnDate);
     Item.retrive(items);
     }             
    
    
public static void retrive(ArrayList<Transaction> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public static void searchEndReturnDate(ArrayList<Transaction> p)
    {
       
    Date date = new Date();  
   for (int i = 0; i < p.size(); i++) 
          if(p.get(i).returnDate.compareTo(date)==0)
             p.get(i).print();
    }
  
    
}
