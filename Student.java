package studentManagement;

public class Student {
	private String name; 
	private int id; 
	private double gpa; // Use private for Encapsulation
	
	public Student(String name, int id, double gpa) { 
		this.name = name; 
		this.id = id; 
		this.gpa = gpa; 
		}
	
	// Example Getter. 
	public String getName() { 
	return name; 
	}
	// Example Getter 
		public int getId() {  
		 return id;
		}
	
	// Example Setter 
	public void setGpa(double gpa) { 
	this.gpa = gpa; 
	} 
	
	// You should add getters/setters for all fields!
	
	@Override 
	public String toString() { 
	return "ID: " + id + ", Name: " + name + ", GPA: " + gpa; 
	} 

	
	public static void main(String[] args) {
		

	}

}
