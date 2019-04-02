package Student;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		File files;
		Students stuObj=new Students();//Creating object of Students class to call methods from the class.
		int userinput=1; //Setting up to put the menu in a do while loop so that it does not auto-close unless the exit number is inputed.
		//Creating some Students objects with the non-empty constructor,this is where the student info and grades would go.
		Students a=new Students("FirstName","LastName","1","A","A","A","A","A");
		Students bb=new Students("FirstName","LastName","2","A","A","A","A","A");
		Students c=new Students("FirstName","LastName","3","A","A","A","A","A");
		Students d=new Students("FirstName","LastName","4","A","A","A","A","A");
		Students e=new Students("FirstName","LastName","5","A","A","A","A","A");
	do {//Menu items.
		System.out.println("Press 1 to see Student Information.\n");
		System.out.println("Press 2 to see All Student Information.\n");
		System.out.println("Press 3 to update Student Information.\n");
		System.out.println("Press 4 to delete Student Information.\n");
		System.out.println("Press 5 to see the GPA of a student.\n");
		System.out.println("Press 6 to see the average GPA of all students.\n");
		System.out.println("Press 7 to exit the Menu.\n");
		//Scanner obj to store menu item input and to use in the switch statement.
		Scanner scanner=new Scanner(System.in);
		//The variable passed to the switch statement.
		int choice=scanner.nextInt();
		//Scanner obj scanner for user input from the keyboard like the id number of students.
		Scanner scan=new Scanner(System.in);
		//The variable that stores the id of students to pass to methods.
		String b;
		//switch statement start.
		switch(choice) {
		
		case 1://Prints user info by passing the string variable 'b' as student id.
			
			System.out.println("Enter Student ID: ");
			b=scan.nextLine();
			stuObj.openFile(b);
			stuObj.readFile();
	
			
			break;
			
		case 2://Prints all the student info from Students file.
		
			stuObj.openFile("Students");
			stuObj.readFile();
			break;
			
		case 3://Uses PrintWriter to update.
			
			System.out.println("Enter student ID\n");
			b=scan.nextLine();
			File file=new File(b);
			try {
				PrintWriter pw = new PrintWriter(file);
				String update;
				System.out.println("Enter info to update.");
				update=scan.nextLine();
				pw.println(update);
				pw.close();
			} catch (FileNotFoundException e1) {
			
				e1.printStackTrace();
			}
			
			
			
			
			break;
			
		case 4://Uses delete function from the File class to delete file,identifies the file by passing the 'b' variable as id for the file.
			
			System.out.println("Enter student ID to delete");
				b=scan.nextLine();
				file=new File(b);
				if(file.exists()) {
					file.delete();
				}
			
	
				break;
		case 5://Calculates the individual GPA of students,string variable 'b' is converted to signed decimal integer via parseInt method and is stored in 'dd'.
			
			System.out.println("Enter student ID");
			b=scan.nextLine();
			int dd=Integer.parseInt(b);
			if(dd==1)
				System.out.println(a.getGPA());
			else if(dd==2)
				System.out.println(bb.getGPA());
			else if(dd==3)
				System.out.println(c.getGPA());
			else if(dd==4)
				System.out.println(d.getGPA());
			else if(dd==5)
				System.out.println(e.getGPA());
			else
				System.out.println("A student with this id is not registered.");
			break;
			
		case 6://Calculates average GPA of all registered students.
			System.out.println(stuObj.getallGPA(a, bb, c, d, e));
			break;
			
		case 7://userinput is set to 0 to exit the while loop and close the menu,terminating the program.
			userinput=0;
			break;
			}
		
	}while(userinput!=0);
		}
		
		
	

	}


