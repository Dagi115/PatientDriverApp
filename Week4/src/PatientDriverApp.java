/*
 * Class: CMSC203 
 * Instructor: Ashique Tanveer
 * Description: Write a class named Patient that has fields for the following data: First
name, middle name, and last name, Address, city, state, and ZIP code, Phone number, Name and 
phone number of emergency contact.
 * Due: 05/27/23
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Dagmawi Kebede
*/
public class PatientDriverApp {

public static void main(String args[]) {

// Initialization of patient instance with data
Patient peter = new Patient();
peter.setDetails("James","Blake","Elijiah","104 Manakee Ave","Rockville","MD","208879",
"301-884-7895","Ben","240-777-8888");


// Initialization of procedure instance with sample data
Procedure procedure1 = new Procedure();
procedure1.setProcedure("Surgery","13 April 2023","Dr. Danny",250.00);

Procedure procedure2 = new Procedure();
procedure2.setProcedure("MRI","13 April 2023","Dr. Danielle",500.00);

Procedure procedure3 = new Procedure();
procedure3.setProcedure("Blood test","13 April 2023","Dr. Darne",200.00);

//print statements
System.out.println("<----------PATIENT DETAILS----------->");
System.out.println("FULL NAME : "+peter.getFname()+" "+peter.getMname()
+" "+peter.getLname());
System.out.println("ADDRESS : "+ peter.getAddress());
System.out.println("CITY : "+peter.getCity());
System.out.println("STATE : "+peter.getState());
System.out.println("ZIPCODE : "+peter.getZip());
System.out.println("PHONE NUMBER : "+peter.getphone());
System.out.println("Emegency Person's NAME : "+peter.getEname());
System.out.println("Emergency Person's Contact Number : "+ peter.getEphone());
System.out.println("\n\n");


System.out.println("---> PROCEDURE 1:");
System.out.println("Procedure Name : " +procedure1.getPname());
System.out.println("Procedure Date : "+ procedure1.getPdate());
System.out.println("Practicioner : "+ procedure1.getPpract());
System.out.println("Charge : " + procedure1.getPcharge());
System.out.println("\n");


System.out.println("---> PROCEDURE 2 :");
System.out.println("Procedure Name : " +procedure2.getPname());
System.out.println("Procedure Date : "+ procedure2.getPdate());
System.out.println("Practicioner : "+ procedure2.getPpract());
System.out.println("Charge : " + procedure2.getPcharge());
System.out.println("\n");

System.out.println("---> PROCEDURE 3 :");
System.out.println("Procedure Name : " +procedure3.getPname());
System.out.println("Procedure Date : "+ procedure3.getPdate());
System.out.println("Practicioner : "+ procedure3.getPpract());
System.out.println("Charge : " + procedure3.getPcharge());
System.out.println("\n\n");

double Total = procedure1.getPcharge() + procedure2.getPcharge() + procedure3.getPcharge();
System.out.println("<<<<<<<<<<<-----------TOTAL CHARGE : " + Total +
"------------->>>>>>>>");

System.out.println("Student name: Dagmawi Kebede");
System.out.println("Student MC M#: M21136615");
System.out.println("Due Date: 05/27/23");

}


}