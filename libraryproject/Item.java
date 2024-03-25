/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.util.*;

public class Item {
    private int id;
    private static int i=0;
    private String type;
    private int libItemId;
    public Item()
    {
        System.out.println("To insert New Item press Enter :");
        this.add();
    }
    public Item(String type,int libItem)
    {
      i++;
      id=i;
      this.type=type;              
      this.libItemId=libItem;
    }
    public void add()
    {
    i++;
      id=i;
      Scanner s=new Scanner(System.in);
     
        System.out.println("Enter Type of Item Library:");
     type=s.next(); 
       System.out.println("Enter Id of Item Library:");
     libItemId=s.nextInt(); 
               
    
    }
    public int getItemLibId(){return libItemId;}
    public void print()
    {
     System.out.println("ID:"+id);
     System.out.println(" Type of Item Library:"+type);
     System.out.println(" Id of Item Library:"+libItemId);
     } 
    
    
    
public static void retrive(ArrayList<Item> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public static void delete(ArrayList<Item> lib, int i)
{
    lib.remove(i);
    System.out.println("The Item has deleted");
    
}
}