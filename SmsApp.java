package studentManagement;

import java.util.ArrayList; 
import java.util.Scanner;

public class SmsApp {
	public static void main(String[] args) { 
		// Step 2: Use ArrayList to store multiple Student objects 
		ArrayList<Student> studentList = new ArrayList<>(); 
		Scanner scanner = new Scanner(System.in); 
		// Initial data for testing 
		studentList.add(new Student("Alice", 101, 3.8)); 
		studentList.add(new Student("Bob", 102, 3.2)); 
		// Start the main menu loop 
		runMenu(studentList, scanner); 
		
		
	}
	// Helper method to hold the main loop logic (from Module 5: Methods) 
	public static void runMenu(ArrayList<Student> list, Scanner scan) { 
		while (true) { 
			System.out.println("\n--- SMS Menu ---"); 
			System.out.println("1. Add Student"); 
			System.out.println("2. View All Students"); 
			System.out.println("3. Update Student GPA"); 
			System.out.println("4. Exit"); 
			System.out.print("Enter choice: "); 
			int choice = scan.nextInt(); 
			switch (choice) { 
			case 1: 
			addStudent(list, scan); 
			break; 
			case 2: 
			viewStudents(list); 
			break; 
			case 3: 
			updateGpa(list, scan); 
			break; 
			case 4: 
			System.out.println("Exiting System. Goodbye!"); 
			scan.close(); // Close the scanner when done 
			return; // Exits the method and the program 
			default: 
			System.out.println("Invalid choice. Please try again."); 
			} 
			}
		

	}
	
	// Inside SmsApp class 
	public static void addStudent(ArrayList<Student> list, Scanner scan) { 
	System.out.print("Enter name: "); 
	String name = scan.next(); 
	System.out.print("Enter ID: "); 
	int id = scan.nextInt(); 
	System.out.print("Enter GPA: "); 
	double gpa = scan.nextDouble(); 
	Student newStudent = new Student(name, id, gpa); // OOP: create object 
	list.add(newStudent); // Collections: add to list 
	System.out.println("✅ Student added successfully!"); 
	}
	
	// Inside SmsApp class 
	public static void viewStudents(ArrayList<Student> list) { 
	if (list.isEmpty()) { 
	System.out.println("The system has no students."); 
	return; 
	} 
	System.out.println("\n--- All Students ---"); 
	// Enhanced For Loop (from Module 3) over the Collection (from Module 8) 
	for (Student student : list) { 
	System.out.println(student); // Calls the Student's toString() method 
	} 
	System.out.println("--------------------"); 
	} 
	
	
	
	public static void updateGpa(ArrayList<Student> list, Scanner scan) { 
		System.out.print("Enter ID of student to update: "); 
		int idToFind = scan.nextInt(); 
		boolean found = false; 
		for (Student student : list) { 
		if (student.getId() == idToFind) {       // Check the object's ID field 
		System.out.print("Enter new GPA: "); 
		double newGpa = scan.nextDouble(); 
		student.setGpa(newGpa); // OOP: use the Setter method 
		System.out.println("✅ GPA updated for " + student.getName()); 
		found = true; 
		break; 
		} 
		} 
		if (!found) { 
		System.out.println("❌ Student with ID " + idToFind + " not found."); 
		} 
		}
	
}
