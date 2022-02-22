import java.util.Scanner;
class Student{
	int erNo, marks;
	String name, gender;
	static int count = 1;
	Student(){
		count++;
	}
	Student(int erNo, int marks, String name, String gender){
		this();
		this.erNo = erNo;
		this.marks = marks;
		this.name = name;
		this.gender = gender;
	}
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Enrollment no.: " + erNo);
		System.out.println("Gender: " + gender);
		System.out.println("Marks: " + marks);
	}
}

class StudentInfo{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Student s1 = new Student(1, 98, "Pranav", "Male");
	//	Student s1 = new Student();
		s1.display();
		System.out.println("Counter: " + s1.count);
		Student s2 = new Student(2, 95, "Raj", "Male");
	//	Student s2 = new Student();
		s2.display();
		System.out.println("Counter: " + s1.count);

	}
}
