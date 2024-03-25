/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
 */
package libraryproject;

import java.util.*;
public class Bill {
    private int id;
    private int i=0;
    private float amount;
    private static float sum=0;
    ArrayList<Transaction> trans;
    public Bill(ArrayList<Transaction> trans)
    {
        System.out.println("To insert New Bill press enter");
        this.trans=trans;
         this.add();
    }
   
    public Bill(ArrayList<Transaction> trans,float amount)
    {
      i++;
      id=i;
      this.amount=amount; 
      this.trans=trans;
    }
    public void add()
    {
    i++;
      id=i;
      Scanner s=new Scanner(System.in);
     if(s.hasNextLine()){
        System.out.println("Enter Amount:");
     amount=s.nextFloat(); 
            }           
    
    }
    public void print()
    {
     System.out.println("ID:"+id);
     System.out.println(" Amount:"+amount);
     Transaction.retrive(trans);
     }             
    
    
public static void retrive(ArrayList<Transaction> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
  
    
    
}
