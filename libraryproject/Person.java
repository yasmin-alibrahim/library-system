/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;
import java.util.*;
import java.text.SimpleDateFormat;

/*********************************************************************************/
/******************************Person Class***************************************/
/*********************************************************************************/
public abstract class Person {
    protected String fname;
    protected String lname;
    protected String address;
    protected String mobile;
    protected String email;
    public abstract int getId();
    public void setFname(String fname)
    {this.fname=fname;}
    public String getFname(){return fname;}
    public void setLname(String lname)
    {this.lname=lname;}
    public String getLname(){return lname;}
    public void setAddress(String address)
    {this.address=address;}
    public String getAddress(){return address;}
    public void setMobile(String mobile)
    {this.mobile=mobile;}
    public String getMobile(){return mobile;}
    public void setEmail(String email)
    {this.email=email;}
    public String getEmail(){return email;}
    public  void print( )
    {
        System.out.println("Name:"+fname+" "+lname);
        System.out.println("Address:"+address);
        System.out.println("Mobile:"+mobile);
        System.out.println("Email:"+email);
    }
    public abstract void add();    
}
/*********************************************************************************/
/******************************Librarian Class***************************************/
/*********************************************************************************/
final class Librarian extends Person
{
      private int id;
      private static int i=0;
      private String userName,password;

public Librarian() 
    {
        System.out.println("To insert New Librarian press Enter:");
        this.add();
    }
    public Librarian(String fname,String lname,String address,String mobile,String email,String username,String password )
    {
    i++;
     this.id=i;              
     this.fname=fname;
     this.lname=lname;
     this.address=address;
     this.mobile=mobile;
     this.email=email;
     this.userName=username;
           
    }
    @Override 
    public int getId(){return id;}
    public void setUserName(String userName)
    {this.userName=userName;}
    public String getUserName(){return userName;}
    public void setPassword(String password)
    {this.password=password;}
    public String getPassword(){return password;}
    public static int getNumberOfLibrarians(){return i;}

@Override
public void print(){
System.out.println("ID:"+id);
super.print();
System.out.println("UserName:"+userName);
System.out.println("Password:"+password);
}
@Override
public void add()
{
    i++;
    id=i;
Scanner s=new Scanner(System.in);
              
     System.out.println("Enter First Name:");
     fname=s.nextLine();
     System.out.println("Enter Last Name:");
     lname=s.nextLine();
     System.out.println("Enter Address:");
     address=s.nextLine();
     System.out.println("Enter Mobile:");
     mobile=s.nextLine();
     System.out.println("Enter Email:");
     email=s.nextLine();
     System.out.println("Enter UserName:");
     userName=s.nextLine();
     System.out.println("Enter PassWord:");
     password=s.nextLine();  
     
                }

public  static void delete(ArrayList<Librarian> lib, int id)
{
    for (int i = 0; i < lib.size(); i++) 
            if(lib.get(i).id==id)
            { 
                lib.remove(lib.get(i)); 
                i--;
                System.out.println("The Librarian has deleted");
                break;          
            }   
}
 public static void retrive(ArrayList<Librarian> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
    public static int getNumberOfLibrarian() {
        return i;
    }
    public static Librarian getLibrarianById(ArrayList<Librarian> lib ,int id)
     {
         Librarian c=null;
     for( int j=0;j<lib.size();j++)
         if( lib.get(j).id==id)
         { 
             c=lib.get(j);
           break;
         }
     return c;
  
     }
}

/*********************************************************************************/
/******************************Customer  Class************************************/
/*********************************************************************************/
class  Customer extends Person
{
 protected int id;
 protected static int i=0;
protected String type;
protected Date dateOfMember;
protected  int numOfLoanBook=0;
protected int maxOfLoanBook;

    public Customer() {
        //System.out.println(" To insert New Customer press Enter: ");
        this.add();
    }
    public Customer(String fname,String lname,String address,String mobile,String email,String type,Date dateOfMember,int maxLoanBook )
    {
        i++;
        this.id=i;
     this.fname=fname;
     this.lname=lname;
     this.address=address;
     this.mobile=mobile;
     this.email=email;
     this.type=type;
     this.dateOfMember=dateOfMember;
     this.maxOfLoanBook=maxLoanBook;
            
    }
  @Override 
    public int getId(){return id;}
    public void setType(String type)
    {this.type=type;}
    public String getType(){return type;}
    public void setMaxOfLoanBook(int maxOfLoanBook)
    {this.maxOfLoanBook=maxOfLoanBook;}
    public int getMaxOfLoanBook(){return maxOfLoanBook;}
    public void increaseNumOfLoanBook()
    {numOfLoanBook++;}
     public void decreaseNumOfLoanBook()
    {numOfLoanBook--;}
     public  int getNumOfLoanBook(){return numOfLoanBook;}
     public  int getNumberBook(){return  maxOfLoanBook-numOfLoanBook;}
     public static int getMaxNumberOfCustomers(){return i;}
     public static void searchByFullName(ArrayList<Customer> cust,String fname,String lname)
     {
     for( int j=0;j<cust.size();j++)
         if( cust.get(j).fname.equals(fname) && cust.get(j).lname.equals(lname))
             cust.get(j).print();
       else
             System.out.println("No Result");
  
     }
     public static Customer getCustomerById(ArrayList<Customer> cust ,int id)
     {
         Customer c=null;
     for( int j=0;j<cust.size();j++)
         if( cust.get(j).id==id)
         { 
             c=cust.get(j);
           break;
         }
     return c;
  
     }
@Override
public void print(){
    System.out.println("ID:"+id);
super.print();

System.out.println("Type:"+type);
System.out.println("Regiseration Date :"+dateOfMember);
System.out.println("Max Number Of Loan Book:"+maxOfLoanBook);
System.out.println("Number Of Loan Book :"+numOfLoanBook);

}
@Override
public void add()
{

i++;
    id=i;
     Scanner s = new Scanner(System.in) ;
             System.out.println("Enter First Name:");
             fname=s.nextLine();
             System.out.println("Enter Last Name:");
             lname=s.nextLine();
             System.out.println("Enter Address:");
             address=s.nextLine();
             System.out.println("Enter Mobile:");
             mobile=s.nextLine();
             System.out.println("Enter Email:");
             email=s.nextLine();
             System.out.println("Enter Type:");
             type=s.nextLine();
             boolean x=false;
             do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Regisration Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     dateOfMember=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);       
        
    
             System.out.println("Enter Max Loan Book:");
             maxOfLoanBook=s.nextInt();
         
     
}
public boolean CheckLoan()
{   
  if(numOfLoanBook<maxOfLoanBook)
        return true;   
                else
      return false;
      }
public static void retrive(ArrayList<Customer> p)
    {
   for (int j = 0; j < p.size(); j++) 
             p.get(j).print();
    }
public static void delete(ArrayList<Customer> cu, int id)
{
    for (int j = 0; j < cu.size(); j++) 
            if(cu.get(j).id==id)
            { 
                i--;
                cu.remove(cu.get(j)); 
                System.out.println("The Customer has deleted");
                break;          
            }      
}
public static void delete(ArrayList<Customer> cu, String fname,String lname)
{
    for (int j = 0; j < cu.size(); j++) 
            if( cu.get(j).fname.equals(fname) && cu.get(j).lname.equals(lname))
            { 
                cu.remove(cu.get(j)); 
                i--;
                System.out.println("The Customer has deleted");
                break;          
            }      
}
 public void discount(float price,float dis)
 {
     System.out.println("Old Price:"+price);
     System.out.print("New Price:"+(price-dis));
 
 }
 public static int getNumberOfCustomers() {
        return i;
    }
 

}

/*********************************************************************************/
/******************************Student Class**************************************/
/*********************************************************************************/
final class Student extends Customer
{
 private String faculty,university;
 private int year;
 private static int numOfStudents=0;
 public Student()
 {
    // System.out.println(" To insert New Student press Enter:");
     //this.add();
 }
 public Student(String fname,String lname,String address,String mobile,String email,String type,Date dateOfMember,int maxLoanBook,String university,String faculty,int year )
    {
        super( fname, lname, address, mobile, email, type, dateOfMember, maxLoanBook);
        numOfStudents++;
        this.university=university;
        this.faculty=faculty;
        this.year=year;                             
    }
 public void setFaculty(String faculty)
    {this.faculty=faculty;}
    public String getFaculty(){return faculty;}
     public void setUniversity(String university)
    {this.university=university;}
    public String getUniversity(){return university;}
         public void setYear(int year)
    {this.year=year;}
    public int getYear(){return year;}
    
 @Override
public void print(){
super.print();
System.out.println("University:"+university);
System.out.println("Faculty :"+faculty);
System.out.println("Year:"+year);
}
@Override
public void add()
{
    numOfStudents++;
i++;
    id=i;
Scanner s=new Scanner(System.in);
             
     System.out.println("Enter First Name:");
     fname=s.next();
     System.out.println("Enter Last Name:");
     lname=s.next();
     System.out.println("Enter Address:");
     address=s.next();
     System.out.println("Enter Mobile:");
     mobile=s.next();
     System.out.println("Enter Email:");
     email=s.next();
System.out.println("Enter Type:");
     type=s.nextLine();
     boolean x=false;
             do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Regisration Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     dateOfMember=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);
 System.out.println("Enter Max Loan Book:");
     maxOfLoanBook=Integer.parseInt(s.nextLine());    
     
 System.out.println("Enter University:");
     university=s.nextLine();
System.out.println("Enter Faculty:");
     faculty=s.nextLine();
 System.out.print("Enter Year:");
     year=Integer.parseInt(s.next()); 
     
     s.close();
}
 
public static int getNumberOfStudents(){return numOfStudents;}
public static void retriveStudents(ArrayList<Student> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public  static void deleteStudent(ArrayList<Student> S, int id)
{
    for (int j = 0; j < S.size(); j++) 
            if( S.get(j).id==id)
            { numOfStudents--;
                S.remove(S.get(j)); 
                System.out.println("The Student has deleted");
                break;          
            }   
    
}
public static void deleteStudent(ArrayList<Student> Su, String fname,String lname)
{
    for (int j = 0; j <Su.size(); j++) 
            if( Su.get(j).fname.equals(fname) && Su.get(j).lname.equals(lname))
            { numOfStudents--;
                Su.remove(Su.get(j)); 
                System.out.println("The Student has deleted");
                break;          
            }      
}

public void discount(float price)
{
  
  float dis;
  switch(year)
  {
    case 1:dis =price*10/100;break;
  case 2:dis =price*15/100;break;
  case 3:dis =price*20/100;break;
  default:dis =price*25/100;break;
  }
  float newprice=price-dis;
   System.out.println("Old Price:"+price);
   System.out.print("New Price:"+newprice);
  
}
public static void searchByUniversity(ArrayList<Student> t,String univ)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).university.equals(univ))
             t.get(j).print();
  
     }
public static void searchByFaculty(ArrayList<Student> t,String faculty)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).faculty.equals(faculty))
             t.get(j).print();
  
     }
public static Student getStudentById(ArrayList<Student> std ,int id)
     {
         Student c=null;
     for( int j=0;j<std.size();j++)
         if( std.get(j).id==id)
         { 
             c=std.get(j);
             break;
         }
     return c;
  
     }
public static void searchStdByName(ArrayList<Student> t,String fname,String lname)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).fname.equals(fname) && t.get(j).lname.equals(lname))
             t.get(j).print();
     else
             System.out.println("No Result");
  
     }
 
}

/*********************************************************************************/
/******************************Teacher Class**************************************/
/*********************************************************************************/
final class Teacher extends Customer
{
 private String specefied,school;
 private int serviceYear;
 private static int numOfTeachers=0;
 
 public Teacher()
 {
     System.out.println("To insert New Teacher press Enter:");
     this.add();
 }
 public Teacher(String fname,String lname,String address,String mobile,String email,String type,Date dateOfMember,int maxLoanBook,String specefied,String school,int serviceYear )
    {
        super( fname, lname, address, mobile, email, type, dateOfMember, maxLoanBook);
        numOfTeachers++;
        this.specefied=specefied;
        this.school=school;
        this.serviceYear=serviceYear;                             
    }
 public void setSpecefied(String specefied)
    {this.specefied=specefied;}
    public String getSpecefied(){return specefied;}
     public void setSchool(String school)
    {this.school=school;}
    public String getSchool(){return school;}
         public void setServiceYear(int serviceYear)
    {this.serviceYear=serviceYear;}
    public int getServiceYear(){return serviceYear;}
    
 @Override
public void print(){
super.print();
System.out.println("Specefied:"+specefied);
System.out.println("School :"+school);
System.out.println("Service Years:"+serviceYear);
}
@Override
public void add()
{
i++;
    id=i;
Scanner s=new Scanner(System.in);
               
     System.out.println("Enter First Name:");
     fname=s.nextLine();
     System.out.println("Enter Last Name:");
     lname=s.nextLine();
     System.out.println("Enter Address:");
     address=s.nextLine();
     System.out.println("Enter Mobile:");
     mobile=s.nextLine();
     System.out.println("Enter Email:");
     email=s.nextLine();
System.out.println("Enter Type:");
     type=s.nextLine();
      boolean x=false;
do{
                 
             SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
             System.out.println("Enter Regisration Date (dd/mm/yyyy):");
             String sd=s.nextLine();
             if(null!=sd && sd.trim().length()>0)
                 try
                 {
                     dateOfMember=format.parse(sd);
                 }
                 catch (Exception ex) {
                     x=true;
                     System.out.println("Error in Date Format");
                 }
             }while (x==true);
 System.out.println("Enter Max Loan Book:");
     maxOfLoanBook=Integer.parseInt(s.nextLine());    
     

System.out.println("Enter School Name:");
     school=s.nextLine();
 System.out.println("Enter Service Years:");
     serviceYear=Integer.parseInt(s.nextLine());
    System.out.println("Enter Specefied:");
     specefied=s.nextLine();  
     s.close();
}
 
public static int getNumberOfTeachers(){return numOfTeachers;}
public static void retriveTeachers(ArrayList<Teacher> p)
    {
   for (int i = 0; i < p.size(); i++) 
             p.get(i).print();
    }
public  static void deleteTeacher(ArrayList<Teacher> S, int id)
{
    for (int j = 0; j < S.size(); j++) 
            if( S.get(j).id==id)
            { 
                numOfTeachers--;
                S.remove(S.get(j)); 
                System.out.println("The Teacher has deleted");
                break;          
            }   
    
}
public static void deleteTeacher(ArrayList<Teacher> Su, String fname,String lname)
{
    for (int j = 0; j <Su.size(); j++) 
            if( Su.get(j).fname.equals(fname) && Su.get(j).lname.equals(lname))
            { 
                numOfTeachers--;
                Su.remove(Su.get(j)); 
                System.out.println("The Student has deleted");
                break;          
            }      
}
public void discount(float price)
{
  
  float dis=0;
  if(serviceYear<5)
  
   dis= price*10/100;
  else  if(serviceYear<=10)
 dis=price*15/100;
  else if(serviceYear<=15)
  dis =price*20/100;
  else
  dis =price*25/100;
  
  float newprice=price-dis;
   System.out.println("Old Price:"+price);
   System.out.print("New Price:"+newprice);
  
}
public static void searchBySchool(ArrayList<Teacher> t,String school)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).school.equals(school))
             t.get(j).print();
  
     }
public static void searchBySpec(ArrayList<Teacher> t,String spec)
     {
     for( int j=0;j<t.size();j++)
         if( t.get(j).specefied.equals(spec))
             t.get(j).print();
  
     }
public static Teacher getTeacherById(ArrayList<Teacher> t ,int id)
     {
         Teacher c=null;
     for( int j=0;j<t.size();j++)
         if( t.get(j).id==id)
         {
             c=t.get(j);
             break;
         }
     return c;
  
     }
public static void searchTeachByName(ArrayList<Teacher> cust,String fname,String lname)
     {
     for( int j=0;j<cust.size();j++)
         if( cust.get(j).fname.equals(fname) && cust.get(j).lname.equals(lname))
             cust.get(j).print();
       else
             System.out.println("No Result");
  
     }
}

