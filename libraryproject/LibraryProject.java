/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.util.*;
public class LibraryProject {
   static  ArrayList<Student> std = new ArrayList<Student>();
   static  ArrayList<Teacher> tech = new ArrayList<Teacher>();
   static  ArrayList<Librarian> lib = new ArrayList<Librarian>();
    static  ArrayList<Customer> cust = new ArrayList<Customer>();
    static  ArrayList<Book> books = new ArrayList<Book>();
     static  ArrayList<Magazine> magaz = new ArrayList<Magazine>();
    static  ArrayList<LoanBook> lbooks = new ArrayList<LoanBook>();
  static  ArrayList<Item> items = new ArrayList<Item>();
    static  ArrayList<Transaction> trans = new ArrayList<Transaction>();
static  ArrayList<Bill> bi = new ArrayList<Bill>();
    public static void main(String[] args) {
       MainMenu();
    }
    public static void MainMenu()
    {
         Scanner s=new Scanner(System.in);
      try{   int x;
      System.out.println("*********Library Project***********");
      
       do { 
             System.out.println("****** to view Librarian Options press 1 ******");
             System.out.println("****** to view Customer Options press 2 ******");
             System.out.println("****** to view Teacher Options press 3 ******");
             System.out.println("****** to view Student Options press 4 ******");
             System.out.println("****** to view Book Options press 5 ******");
             System.out.println("****** to view Magazine Options press 6 ******");
             System.out.println("****** to view Loan Book Options press 7 ******");
             System.out.println("****** to Add Items  press 8 ******");
              System.out.println("****** to Make Tranaction  press 9 ******");
             System.out.println("to exit   press 0: ");
             x=Integer.parseInt(s.nextLine());
           switch(x)
           {
            case 0:{System.out.println("Thank you..");break;}   
            case 1:LibrarianMenu();break;
            case 2:CustomerMenu();break;
            case 3:TeacherMenu();break;
            case 4:StudentMenu();break;
            case 5:BookMenu();break;
            case 6:MagazinMenu();break;
            case 7:LoanMenu();break;
            case 8:ItemMenu();break;
            case 9:;break;
            
            
           }
       
       }
       while(x!=0);   
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
    }
    public static void LibrarianMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {System.out.println("*********Librarian Options***********");
        System.out.println("to insert Lirarian part press 1: ");
        System.out.println("to view All Lirarians press 2: ");
        System.out.println("to delete any Lirarian press 3: ");
        System.out.println("to get information any Lirarian press 4: ");
        System.out.println("to get Number Of Librarians 5: ");
        System.out.println("Back Main Menu press 0: ");
        y=Integer.parseInt(s.nextLine());
            switch(y)
        {
                case 0:{System.out.println("Main Menu..");break;}
                case 1:
            {
            
             Librarian lib1=new Librarian();
             lib.add(lib1); 
             break;
            }
            case 2:
            {
              Librarian.retrive(lib);break;
            }
            case 3:{
                System.out.println("Enter id of libraraian you want delete him:");
            int libid=s.nextInt();
            Librarian.delete(lib, libid);
            break;
            
            }
            case 4:
            {
               System.out.println("Enter id of libraraian you want view his informaion :");
            int libid=s.nextInt();
            Librarian l= Librarian.getLibrarianById(lib, libid);
            if(l==null)
                    System.out.println("No result");
            else
           l.print(); 
                break;
            }
            case 5:
            {
                System.out.println("Number Of Librarians:"+Librarian.getNumberOfLibrarians());
                break;
            }
            default:{System.out.println("Error Option");break;}
            }
        
       
        }while(y!=0);
    
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
    }
      public static void CustomerMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {
        System.out.println("*********Customer Options***********");
        System.out.println("to eneter Customer part press 1: ");
        System.out.println("to view All Customers press 2: ");
        System.out.println("to delete any Customer using ID press 3 : ");
        System.out.println("to delete any Customer using Full name press 4 : ");
        System.out.println("to Searching for Customer  By Full Name press 5: ");
        System.out.println("to get information any Customer press 6: ");
        System.out.println("to get Number Of Customers press 7: ");
        System.out.println("Back Main Menu press 0: ");
        y=Integer.parseInt(s.nextLine());
        switch(y)
        {
            case 0:{System.out.println("Main Menu..");break;}
        case 1:
            {         
             Customer c1=new Customer();
             cust.add(c1);
              break;
            }
            case 2:
            {
                Customer.retrive(cust);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of Customer you want delete him:");
            int custid=s.nextInt();
            Customer.delete(cust, custid);
            break;
            }
            case 4:{
                String fname,lname;
            System.out.println("Enter First Name of Customer you want delete him:");
             fname=s.nextLine();
            System.out.println("Enter Last Name of Customer you want delete him:");
             lname=s.nextLine();
            Customer.delete(cust, fname,lname);
            break;}
            case 5:
            {
                System.out.println("Enter first name:");
              String fname=s.nextLine();
              System.out.println("Enter last name:");
              String lname=s.nextLine();
              Customer.searchByFullName(cust, fname, lname);
              break;
            }
            case 6:
            {
            System.out.println("Enter id of Customer you want view his informaion :");
            int custid=s.nextInt();
            Customer c= Customer.getCustomerById(cust, custid);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            case 7:
            {
            System.out.println("Number Of Customer:"+Customer.getNumberOfCustomers());
                break;
            }
            default:{System.out.println("Error Option");break;}
            }
        
       
        }while(y!=0);
    
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
      
        
    }
     public static void TeacherMenu()
    {

        try{
    int y;
    Scanner s=new Scanner(System.in);
       do {
        System.out.println("*********Teacher Options***********");
        System.out.println("to eneter Teacher part press 1: ");
        System.out.println("to view All Teacher press 2: ");
        System.out.println("to delete any Teacher using ID press 3 : ");
        System.out.println("to delete any Teacher using Full name press 4 : ");
        System.out.println("to Searching for Teacher  using Full Name press 5: ");
        System.out.println("to Searching for Teacher  using school name press 6: ");
        System.out.println("to Searching for Teacher  using specialization press 7: ");
     
        System.out.println("to get information any Teacher press 8: ");
        System.out.println("to get Number Of Teachers press 9: ");
       System.out.println("Back Main Menu press 0: ");
        y= s.nextInt();
        switch(y)
        {
            case 0:{System.out.println("Main Menu..");break;}
        case 1:
            {         
             Teacher c1=new Teacher("Aya", "Husien", "Aldammam", "050415263", "Aya@gmail.com", "t1", new Date(2015, 5, 5), 10, "Math", "school1", 12);
             
             tech.add(c1);
             Teacher c2=new Teacher("Yasmin", "Yasmin", "Riyad", "050415263", "Yasmin@gmail.com", "t1", new Date(2020, 4, 5), 10, "Math", "school2", 5);
             
             tech.add(c2);
             Teacher c3=new Teacher("Areej", "Areej", "Alshaqyia", "050415263", "Areej@gmail.com", "t1", new Date(2015, 5, 5), 10, "Pysics", "school1", 10);
             
             tech.add(c3);
              break;
            }
            case 2:
            {
                Teacher.retriveTeachers(tech);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of Teacher you want delete him:");
            int custid=s.nextInt();
            Teacher.deleteTeacher(tech, custid);
            break;
            }
            case 4:{
                String fname,lname;
            System.out.println("Enter First Name of Teacher you want delete him:");
             fname=s.nextLine();
            System.out.println("Enter Last Name of Teacher you want delete him:");
             lname=s.nextLine();
            Teacher.deleteTeacher(tech, fname,lname);
            break;}
            case 5:
            {
                System.out.println("Enter first name:");
              String fname=s.nextLine();
              System.out.println("Enter last name:");
              String lname=s.nextLine();
              Teacher.searchTeachByName(tech, fname, lname);
              break;
            }
            case 6:
            {
                System.out.println("Enter school name:");
              String sc=s.nextLine();
              Teacher.searchBySchool(tech, sc);
              break;
            }
            case 7:
            {
                System.out.println("Enter specialization name:");
              String sp=s.nextLine();
              Teacher.searchBySpec(tech, sp);
              break;
            }
            case 8:
            {
            System.out.println("Enter id of Teacher you want view his informaion :");
            int custid=s.nextInt();
            Customer c= Customer.getCustomerById(cust, custid);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            case 9:
            {
            System.out.println("Number Of Teachers:"+Teacher.getNumberOfTeachers());
                break;
            }
            default:{System.out.println("Error Option");break;}
            }
        }while(y!=0);
    
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
      
        
    }
  
 public static void StudentMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
     
       do {
        System.out.println("*********Student Options***********");
        System.out.println("to eneter Student part press 1: ");
        System.out.println("to view All Student press 2: ");
        System.out.println("to delete any Student using ID press 3 : ");
        System.out.println("to delete any Student using Full name press 4 : ");
        System.out.println("to Searching for Student  using Full Name press 5: ");
        System.out.println("to Searching for Student  using University name press 6: ");
        System.out.println("to Searching for Teacher  using Faculty press 7: ");    
        System.out.println("to get information any Student press 8: ");
        System.out.println("to get Number Of Students press 9: ");
        System.out.println("Back Main Menu press 0: ");
        y=s.nextInt();
        switch(y)
        {
            case 0:
            {
                System.out.println("Main Menu..");
                break;
            }
          case 1:
            {         
             Student c1=new Student("Amal", "Husien", "Aldammam", "050415263", "Amal@gmail.com", "t1", new Date(2020, 7, 5), 10, "University1", "Faculty1", 2);           
        Student c2=new Student("Anas", "Anas", "Jadda", "050415263", "anas@gmail.com", "t1", new Date(2019, 7, 9), 10, "University2", "Faculty2", 4);           
        Student c3=new Student("Bana", "Bana", "Riyad", "050415263", "bana@gmail.com", "t1", new Date(2016, 8, 5), 10, "University3", "Faculty3", 1);           
             std.add(c1);
               std.add(c2);
                 std.add(c3);
                 System.out.println("The students have been added to the system");
              break;
            }
            case 2:
            {
                Student.retriveStudents(std);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of Student you want delete him:");
            int id=s.nextInt();
            Student.deleteStudent(std, id);
            break;
            }
            case 4:{
                String fname,lname;
            System.out.println("Enter First Name of Student you want delete him:");
             fname=s.nextLine();
            System.out.println("Enter Last Name of Student you want delete him:");
             lname=s.nextLine();
            Student.deleteStudent(std, fname,lname);
            break;}
            case 5:
            {
              System.out.println("Enter first name:");
              String fname=s.nextLine();
              System.out.println("Enter last name:");
              String lname=s.nextLine();
              Student.searchStdByName(std, fname, lname);
              break;
            }
            case 6:
            {
                System.out.println("Enter University name:");
              String sc=s.nextLine();
              Student.searchByUniversity(std, sc);
              break;
            }
            case 7:
            {
                System.out.println("Enter Faculty name:");
              String sp=s.nextLine();
              Student.searchByFaculty(std, sp);
              break;
            }
            case 8:
            {
            System.out.println("Enter id of Student you want view his informaion :");
            int id=s.nextInt();
            Student c= Student.getStudentById(std, id);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            case 9:
            {
            System.out.println("Number Of Students:"+Student.getNumberOfStudents());
                break;
            }
            default:{System.out.println("Error Option");break;}
            }
        }while(y!=0);
    
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
      
        
    }
            
  public static void BookMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {System.out.println("*********Books Options***********");
        System.out.println("to eneter Book part press 1: ");
        System.out.println("to view All Book press 2: ");
        System.out.println("to delete any Book using ID press 3 : ");
        System.out.println("to delete any Book using  name press 4 : ");
        System.out.println("to Searching for Book  using it's Name press 5: ");
        System.out.println("to Searching for Book  using Auther Name press 6: ");
        System.out.println("to Searching for Book  using Publisher name press 7: ");
        System.out.println("to Searching for Book  using type press 8: "); 
        System.out.println("to get information any Book press 9: ");
           System.out.println("to get Number Of Books press 10: ");
        
        System.out.println("to exite   press 0: ");
        y=Integer.parseInt(s.nextLine());
        switch(y)
        {
        case 1:
            {         
             Book c1=new Book("Book1", "Auther1", "English", "Pub1", new Date(2000,5,5), 5, "asd", 1000);
             Book c2=new Book("Book2", "Auther1", "Arabic", "Pub2", new Date(2010,5,5), 3, "awe", 1200);
             Book c3=new Book("Book3", "Auther2", "French", "Pub1", new Date(2000,7,5), 2, "xxx", 1500);
             
             books.add(c1);
             books.add(c2);
             books.add(c3);
              break;
            }
            case 2:
            {
                Book.retriveBooks(books);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of Book you want delete him:");
            int id=s.nextInt();
            Book.delete(books, id);
            break;
            }
            case 4:{
                String name;
            System.out.println("Enter  Name of Book you want delete him:");
             name=s.nextLine();
            Book.delete(books, name);
            break;}
            case 5:
            {
                System.out.println("Enter Book Name:");
              String name=s.nextLine();
              
              Book.getBooksByName(books, name);
              break;
            }
            case 6:
            {
                System.out.println("Enter Auther name:");
              String sc=s.nextLine();
              Book.getBooksAuther(books, sc);
              break;
            }
            case 7:
            {
                System.out.println("Enter Publisher name:");
              String sp=s.nextLine();
              Book.getBooksPublisher(books, sp);
              break;
            }
            case 8:
            {
                System.out.println("Enter Type :");
              String sp=s.nextLine();
              Book.getBooksByType(books, sp);
              break;
            }
            case 9:
            {
            System.out.println("Enter id of Book you want view its informaion :");
            int id=s.nextInt();
            Book c= Book.getBookById(books, id);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            case 10:
            {
            System.out.println("Number Of Books:"+books.size());
                break;
            }
            default:{System.out.println("Error Option");}
            }
        
       
        }while(y!=0);
    
    
    }
    catch(Exception a){System.out.println("Error in format Option");}
        
      
        
    }   
  
  public static void MagazinMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {System.out.println("*********Magazine Options***********");
        System.out.println("to eneter Magazine part press 1: ");
        System.out.println("to view All Magazine press 2: ");
        System.out.println("to delete any Magazine using ID press 3 : ");
        System.out.println("to delete any Magazine using  name press 4 : ");
        System.out.println("to Searching for Magazine  using it's Name press 5: ");
                System.out.println("to Searching for Magazine  using type press 6: "); 
        System.out.println("to get information any Magazine press 7: ");
           System.out.println("to get Number Of Magazine press 8: ");
        
        System.out.println("to exite   press 0: ");
        y=Integer.parseInt(s.nextLine());
        switch(y)
        {
        case 1:
            {         
           Magazine c1=new Magazine("M1",  "English", "Pub1", new Date(2000,5,5), 5, "asd", 1000);
             Magazine c2=new Magazine("M2",  "Arabic", "Pub2", new Date(2010,5,5), 3, "awe", 1200);
             Magazine c3=new Magazine("M3",  "French", "Pub1", new Date(2000,7,5), 2, "xxx", 1500);
           
             magaz.add(c1);
             magaz.add(c2);
             magaz.add(c3);
              break;
            }
            case 2:
            {
                Magazine.retriveMagazines(magaz);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of magazine you want delete him:");
            int id=s.nextInt();
            Magazine.delete(magaz, id);
            break;
            }
            case 4:{
                String name;
            System.out.println("Enter  Name of Magazine you want delete him:");
             name=s.nextLine();
            Magazine.delete(magaz, name);
            break;}
            case 5:
            {
                System.out.println("Enter Magazine Name:");
              String name=s.nextLine();
              
              Magazine.getMagazinsByName(magaz, name);
              break;
            }
            case 6:
            {
                System.out.println("Enter Type:");
              String sp=s.nextLine();
              Magazine.getMagazinesByType(magaz, sp);
              break;
            }
            case 7:
            {
            System.out.println("Enter id of Magazine you want view its informaion :");
            int id=s.nextInt();
            Magazine c= Magazine.getMagazineById(magaz, id);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            case 8:
            {
            System.out.println("Number Of Magazine:"+magaz.size());
                break;
            }
            default:{System.out.println("Error Option");}
            }
         }while(y!=0);
    }
    catch(Exception a){System.out.println("Error in format Option");}
    }  
  
   public static void ItemMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {System.out.println("*********Item Options***********");
        System.out.println("to eneter Item part press 1: ");
        System.out.println("to view All Items press 2: ");
         System.out.println("to delete  Item press 3: ");   
        System.out.println("to exite   press 0: ");
        y=Integer.parseInt(s.nextLine());
        switch(y)
        {
        case 1:
            {         
           Item c1=new Item("Book", 1);
           Item c2=new Item("Magazin",2);
           Item c3=new Item("Book", 1);
            Item c4=new Item("Book", 1);
           Item c5=new Item("Magazin",2);
           Item c6=new Item("Book", 1);
             items.add(c1);
             items.add(c2);
             items.add(c3);
             items.add(c4);
             items.add(c5);
             items.add(c6);
              break;
            }
            case 2:
            {
                Item.retrive(items);
                break;
            }
            case 3:
            {
            System.out.println("Enter id of item you want delete him:");
            int id=s.nextInt();
            Item.delete(items, id);
            break;
            }
            
            default:{System.out.println("Error Option");}
            }
         }while(y!=0);
    }
    catch(Exception a){System.out.println("Error in format Option");}
    }  
    public static void LoanMenu()
    {
       Scanner s=new Scanner(System.in); 
    try{
    int y;
       do {System.out.println("*********Loan Book Options***********");
        System.out.println("to eneter Loan Book part press 1: ");
        System.out.println("to view All Loan Books press 2: ");
        System.out.println("to get information any Loan Book press 3: ");
       
        System.out.println("to exite   press 0: ");
        y=Integer.parseInt(s.nextLine());
        switch(y)
        {
        case 1:
            {         
              LoanBook c1=new LoanBook("Book1", "Auther1", "English", "Pub1", new Date(2000,5,5), 5, "asd", 1000,200,10);
             LoanBook c2=new LoanBook("Book2", "Auther1", "Arabic", "Pub2", new Date(2010,5,5), 3, "awe", 1200,100,5);
             LoanBook c3=new LoanBook("Book3", "Auther2", "French", "Pub1", new Date(2000,7,5), 2, "xxx", 1500,150,10);
             lbooks.add(c1);
             lbooks.add(c2);
             lbooks.add(c3);
             break;
            }
            case 2:
            {
                LoanBook.retriveLoanBooks(lbooks);
                break;
            }
             case 3:
            {
            System.out.println("Enter id of Loan Book you want view its informaion :");
            int id=s.nextInt();
            LoanBook c= LoanBook.getLoanBookId(lbooks, id);
            if(c==null)
                    System.out.println("No result");
            else
           c.print(); 
                break;
            }
            default:{System.out.println("Error Option");}
            }
         }while(y!=0);
    }
    catch(Exception a){System.out.println("Error in format Option");}
    } 
    public static void MakeTrans()
    {
        ArrayList<Item> a=new ArrayList<Item>();
       Student s= Student.getStudentById(std, 2);
      boolean t= s.CheckLoan();
       if(t)
       {
        a.add(items.get(1));
        s.increaseNumOfLoanBook();
       }
         t= s.CheckLoan();
         if(t)
         {
        a.add(items.get(3));
        s.increaseNumOfLoanBook();
       }
        
       Transaction tr=new Transaction("Loan",new Date(2021, 12, 2),new Date(),a);
       trans.add(tr);
       float sum=0;
       for(int i=0;i<a.size();i++)
       {
    int  id1=  a.get(i).getItemLibId();
    sum+=  LoanBook.getLoanBookId(lbooks, id1).getCost();
 
       }
       
        Bill b=new Bill(trans, sum);
    b.print(); 
    s.discount(sum);
       }
    
    }
    
   

