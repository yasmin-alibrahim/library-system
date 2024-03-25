/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.util.*;
import java.text.SimpleDateFormat;

/*********************************************************************************/
/******************************LibraryItems Class*********************************/
/*********************************************************************************/
public abstract class LibraryItems {
    
    
protected int id;
    static int i=0;
   
    protected String name;
    protected String publisher;
    protected Date publishDate;
    protected int numOfCopies;
    protected String isbn;
    protected float price;
    public int getId(){return id;}
    public void setName(String name)
    {this.name=name;}
    public String getName(){return name;}
    public void setPublisher(String publisher)
    {this.publisher=publisher;}
    public String getPublisher(){return publisher;}
    public void setPublishDate(Date publishDate)
    {this.publishDate=publishDate;}
    public Date getPublishDate(){return publishDate;}
    public void setNumOfCopies(int numOfCopies)
    {this.numOfCopies=numOfCopies;}
    public void decreaseCopies()
    {this.numOfCopies--;}
      public void increaseCopies()
    {this.numOfCopies++;}
    public int getNumOfCopies(){return numOfCopies;}
    public void setIsbn(String isbn)
    {this.isbn=isbn;}
    public String getIsbn(){return isbn;}
    public void setPrice(float price)
    {this.price=price;}
    public float getPrice(){return price;}
    public  void print( )
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Publisher:"+publisher);
        System.out.println("Publish Date:"+publishDate);
        System.out.println("Number Of Copies:"+numOfCopies);
        System.out.println("Price:"+price);
        System.out.println("ISBN:"+isbn);
    }
    public abstract void add();
    
}
/*********************************************************************************/
/******************************Book Class*****************************************/
/*********************************************************************************/
class Book extends LibraryItems
{
protected String auther,type;
static int numBook=0;
public Book()
{
System.out.println("To insert New Book press Enter:");
        this.add();
        numBook++;
}
public Book (String name,String auther,String type,String publisher,Date publishDate,int numOfCopies,String isbn,float price)
{
  this.name=name;
  this.auther=auther;
  this.type=type;
  this.price=price;
  this.publishDate=publishDate;
  this.publisher=publisher;
  this.isbn=isbn;
  this.numOfCopies=numOfCopies;
  numBook++;
  i++;
  id=i;

}
public void setAuther(String auther)
    {this.auther=auther;}
    public String getAuther(){return auther;}
    public void setType(String type)
    {this.type=type;}
    public String getType(){return type;}

@Override
public void print(){
super.print();
System.out.println("Auther:"+auther);
System.out.println("Type:"+type);
}
@Override
public void add()
{
     i++;
     id=i;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Name:");
     name=s.nextLine();
     System.out.println("Enter Publisher:");
     publisher=s.nextLine();
     
  boolean x=false;
do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Publish Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     publishDate=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);
     System.out.println("Enter Number Of Copies:");
     numOfCopies=s.nextInt();
     System.out.println("Price:");
     price=s.nextFloat();
     System.out.println("Enter ISBN:");
     isbn=s.nextLine();
     System.out.println("Enter Auther Name:");
     auther=s.nextLine();
     System.out.println("Enter Type Of Book:");
     type=s.nextLine();
      LibraryProject.books.add( new Book(name,auther,type,publisher,publishDate,numOfCopies,isbn,price));
     s.close();
}
public static void retriveBooks(ArrayList<Book> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public static void getBooksAuther(ArrayList<Book> t,String auther)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).auther.equals(auther))
             t.get(j).print();
  
     }
public static void getBooksPublisher(ArrayList<Book> t,String publisher)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).publisher.equals(publisher))
             t.get(j).print();
  
     }
public static void getBooksByName(ArrayList<Book> t,String name)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).name.equals(name))
             t.get(j).print();
  
     }
public static void getBooksByType(ArrayList<Book> t,String type)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).type.equals(type))
             t.get(j).print();
  
     }
public static Book getBookById(ArrayList<Book> bo ,int id)
     {
         Book b=null;
     for( int j=0;j<bo.size();j++)
         if( bo.get(j).id==id)
         {  b=bo.get(j);
            break;
         }
     return b;
  
     }

public static void delete(ArrayList<Book> bo, String name)
{
    for (int j = 0; j < bo.size(); j++) 
            if( bo.get(j).name.equals(name) )
            { 
                bo.remove(bo.get(j)); 
                
                System.out.println("The Book has deleted");
                break;          
            }      
}
public static void delete(ArrayList<Book> bo, int id)
{
    for (int j = 0; j < bo.size(); j++) 
            if( bo.get(j).id==id )
            { 
                bo.remove(bo.get(j)); 
                
                System.out.println("The Book has deleted");
                break;          
            }      
}
}
/*********************************************************************************/
/******************************Magazine Class*************************************/
/*********************************************************************************/
final class Magazine extends LibraryItems
{
private String type;
public Magazine()
{
System.out.println("To insert New Magazine press Enter:");
        this.add();
}
public Magazine (String name,String type,String publisher,Date publishDate,int numOfCopies,String isbn,float price)
{
  this.name=name;
  this.type=type;
  this.price=price;
  this.publishDate=publishDate;
  this.publisher=publisher;
  this.isbn=isbn;
  this.numOfCopies=numOfCopies;
   i++;
  id=i;

}
public void setType(String type)
    {this.type=type;}
    public String getType(){return type;}
    
@Override
public void print(){
super.print();
System.out.println("Type:"+type);

}
@Override
public void add()
{
i++;
     id=i;
     
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Name:");
     name=s.nextLine();
     System.out.println("Enter Publisher:");
     publisher=s.nextLine();
     boolean x=false;
do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Publish Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     publishDate=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);
     System.out.println("Enter Number Of Copies:");
     numOfCopies=s.nextInt();
     System.out.println("Price:");
     price=s.nextFloat();
     System.out.println("Enter ISBN:");
     isbn=s.nextLine();
   
System.out.println("Enter Type:");
     type=s.nextLine();

     LibraryProject.magaz.add(new Magazine(name,type,publisher,publishDate,numOfCopies,isbn,price));
     
     s.close();
}

public static void retriveMagazines(ArrayList<Magazine> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public static Magazine getMagazineById(ArrayList<Magazine> ma ,int id)
     {
         Magazine m=null;
     for( int j=0;j<ma.size();j++)
         if( ma.get(j).id==id)
           
         {
             m=ma.get(j);
             break;
         }
     return m;
  
     }


public static void getMagazinsByName(ArrayList<Magazine> t,String name)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).name.equals(name))
             t.get(j).print();
  
     }
public static void getMagazinesByType(ArrayList<Magazine> t,String type)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).type.equals(type))
             t.get(j).print();
  
     }
public static void delete(ArrayList<Magazine> bo, String name)
{
    for (int j = 0; j < bo.size(); j++) 
            if( bo.get(j).name.equals(name) )
            { 
                bo.remove(bo.get(j)); 
                
                System.out.println("The Magazine has deleted");
                break;          
            }      
}
public static void delete(ArrayList<Magazine> bo, int id)
{
    for (int j = 0; j < bo.size(); j++) 
            if( bo.get(j).id==id )
            { 
                bo.remove(bo.get(j)); 
                
                System.out.println("The Magazine has deleted");
                break;          
            }      
}
}

/*********************************************************************************/
/******************************Loan Book Class************************************/
/*********************************************************************************/
final class LoanBook extends Book
{
 private float loanCost;
 private int endDate;
 public LoanBook()
 {
  super();
 }
 public LoanBook (String name,String auther,String type,String publisher,Date publishDate,int numOfCopies,String isbn,float price,float loanCost,int endDate)
{
    super(name, auther, type, publisher, publishDate, numOfCopies, isbn, price);
    this.loanCost=loanCost;
  this.endDate=endDate;
           i++;
  id=i;

}
 public void setCost(float cost)
    {this.loanCost=cost;}
    public float getCost(){return loanCost;}
     public void setEndDate(int endDate)
    {this.endDate=endDate;}
    public int getEndDate(){return endDate;}
    
 @Override
public void print(){
super.print();
System.out.println("Loan Cost:"+loanCost);
System.out.println("End Loan Date :"+endDate);
}
@Override
public void add()
{
i++;
     id=i;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter Name:");
     name=s.nextLine();
     System.out.println("Enter Publisher:");
     publisher=s.nextLine();
boolean x=false;
do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Publish Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     publishDate=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);
     System.out.println("Enter Number Of Copies:");
     numOfCopies=s.nextInt();
     System.out.println("Price:");
     price=s.nextFloat();
     System.out.println("Enter ISBN:");
     isbn=s.nextLine();
     System.out.println("Enter Auther Name:");
     auther=s.nextLine();
     System.out.println("Enter Type Of Book:");
     type=s.nextLine();

 System.out.println("Loan Cost:");
     loanCost=s.nextFloat();
System.out.println("End Loan Date :");
     endDate=s.nextInt(); 
          
     s.close();
}
 public static void retriveLoanBooks(ArrayList<LoanBook> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
 public static LoanBook getLoanBookId(ArrayList<LoanBook> lb ,int id)
     {
         LoanBook b=null;
     for( int j=0;j<lb.size();j++)
         if( lb.get(j).id==id)
         {  b=lb.get(j);
         break;
         }
     return b;
  
     }



}


