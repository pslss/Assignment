package Student;
import java.util.Formatter;
import java.util.*;
import java.io.*;


public class Students extends main{
	private String name,surname,id;//Private variables with their set methods below.
	
	double c1=4.0;
	double c2=4.0;
	double c3=4.0;
	double c4=4.0;
	double c5=4.0;
	String cg1;
	String cg2;
	String cg3;
	String cg4;
	String cg5;
	double tpts=0;
	double gpv=0;
	private Scanner scanner;
	File file;

	
		//Empty constructor to create constructor obj just to call methods,so that we don't have to fill the arg of the other constructor.
	
	public Students() {
		
	}
	//Constructor for student objects.
	public Students(String n,String s,String ids,String a,String b,String c,String d,String e) {
		
		setName(n);
		setSurname(s);
		setId(ids);
		cg1=a;
		cg2=b;
		cg3=c;
		cg4=d;
		cg5=e;
		getC1pts();
		getC2pts();
		getC3pts();
		getC4pts();
		getC5pts();
		openFile(ids);
		
		
		
		
		
	}
	
	public void setName(String names) {
		
		name=names;
		
	}
	
public void setSurname(String snames) {
		
		surname=snames;
		
	}

public void setId(String ids) {
	
	id=ids;
	
}
//Deletes the file using delete() method.
public void deleteFile(String vars) {
	
	try {
		
		File file=new File(vars);
		if (file.delete()) {
		System.out.println("File deleted.");}
		else System.out.println("Failure");
	}
	catch(Exception e) {
		
		System.out.println("File did not get deleted."); 
	}
}
//Opens the file.
public void openFile(String var) {
	
	try {
		File file= new File(var);
		
		scanner=new Scanner(file);
	
	
		
	}
	catch(Exception e) {
		
		System.out.println("Error opening File");
	}
}



	//Prints the contents of student's files.
public void readFile() {
	while(scanner.hasNextLine()) {
		System.out.println(scanner.nextLine());
	}
	
}
//Equations needed for GPA calculations of individuals.Everyone got A for simplicity's sake.

public void getC1pts() {
	if (cg1.equals("A"))
		gpv=4.0;
	else if(cg1.equals("B"))
		gpv=3.0;
	else if(cg1.equals("C"))
		gpv=2.0;
	else if(cg1.equals("D"))
		gpv=1.0;
	else if (cg1.equals("F"))
		gpv=0.0;
	tpts+=gpv*4.0;
	
}
public void getC2pts() {
	if (cg2.equals("A"))
		gpv=4.0;
	else if(cg2.equals("B"))
		gpv=3.0;
	else if(cg2.equals("C"))
		gpv=2.0;
	else if(cg2.equals("D"))
		gpv=1.0;
	else if (cg2.equals("F"))
		gpv=0.0;
	tpts+=gpv*4.0;
	
}
public void getC3pts() {
	if (cg3.equals("A"))
		gpv=4.0;
	else if(cg3.equals("B"))
		gpv=3.0;
	else if(cg3.equals("C"))
		gpv=2.0;
	else if(cg3.equals("D"))
		gpv=1.0;
	else if (cg3.equals("F"))
		gpv=0.0;
	tpts+=gpv*4.0;
	
}
public void getC4pts() {
	if (cg4.equals("A"))
		gpv=4.0;
	else if(cg4.equals("B"))
		gpv=3.0;
	else if(cg4.equals("C"))
		gpv=2.0;
	else if(cg4.equals("D"))
		gpv=1.0;
	else if (cg4.equals("F"))
		gpv=0.0;
	tpts+=gpv*4.0;
	
}
public void getC5pts() {
	if (cg5.equals("A"))
		gpv=4.0;
	else if(cg5.equals("B"))
		gpv=3.0;
	else if(cg5.equals("C"))
		gpv=2.0;
	else if(cg5.equals("D"))
		gpv=1.0;
	else if (cg5.equals("F"))
		gpv=0.0;
	tpts+=gpv*4.0;
	
}
public double getGPA() {

	return tpts/20;
	
}

public double getallGPA(Students a,Students b,Students c,Students d,Students e) {
	
	double gpa=0;
	gpa+=a.getGPA();
	gpa+=b.getGPA();
	gpa+=c.getGPA();
	gpa+=d.getGPA();
	gpa+=e.getGPA();
	double tgpa=gpa/5;
	return tgpa;
}

}



