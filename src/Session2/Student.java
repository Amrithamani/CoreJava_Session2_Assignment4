package Session2;

import java.util.Scanner;

public class Student {

	// method declared in class to check grades passing marks and age as arguments
	
	public void gradeChecking(int marks, int age){
		
		//conditions to check marks and age
		
		if( marks > 70 || (marks > 60 && age < 15)){
			System.out.println("A");//print the given grade
		}
		
		else if((marks >= 61 && marks <= 70) || (marks >= 45 && marks <= 60 && age < 15) ){
			System.out.println("B");//print the given grade
		}
		
		else if(marks < 61 || (marks < 45 && age < 15)){
			System.out.println("C");//print the given grade
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();//creating object for the class Student
		
		// initialize variable to get input using Scanner
				Scanner input = new Scanner(System.in);

				System.out.println("Enter the marks");// print the given statement
				
				int marks = input.nextInt();// getting the marks of Student
				
				System.out.println("Enter the age");// print the given statement
				
				int age = input.nextInt();//getting the age of Student
				
				obj.gradeChecking(marks,age);//object calling the method in class Student
				// which accepts the marks and age as argument


	}

}
