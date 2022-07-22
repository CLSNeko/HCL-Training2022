public class Student{
	
	String name;

	String Input(String name){
		this.name = name;
		return name;
	}
	String Input(){
		return name;
	}
	boolean Average(double exam1, double exam2, double exam3){	
		double average = (exam1+exam2+exam3)/3;
		if (average > 50){
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args){
		Student testStudent = new Student();
		System.out.println("Student: Hey! My name is " + testStudent.Input("Jerry") + "!");
		System.out.println("Teacher: Good Morning, " + testStudent.Input() + ".");
		System.out.println(testStudent.Input() + ": Am I Passing Right Now?");
		double exam1 = 67.0;
		double exam2 = 16.0;
		double exam3 = 30.0;
		if (testStudent.Average(exam1, exam2, exam3)){
			System.out.println("Teacher: Yes, You Are Passing My Class.");
		} else {
			System.out.println("Teacher: No, You Are Not Passing My Class.");
		}
	}
}
