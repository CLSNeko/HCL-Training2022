import java.util.Collections;
import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;

public class Employee {
		int id;
		String name;
		int age;
		String gender;
		String dept;
		int yearOfJoining;
		int salary;
		static int employeeTotal = 0;

		public Employee(){
				id = employeeTotal;
				employeeTotal++;
		}
		public Employee(int id, String name, int age, String gender, String dept, int yearOfJoining, int salary){
				this.id = id;
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.dept = dept;
				this.yearOfJoining = yearOfJoining;
				this.salary = salary;
				employeeTotal++;
		}

		public int getId(){
				return id;
		}
		public String getName(){
				return name;
		}
		public int getAge(){
				return age;
		}
		public String getGender(){
				return gender;
		}
		public String getDept(){
				return dept;
		}
		public int getYearOfJoining(){
				return yearOfJoining;
		}
		public int getSalary(){
				return salary;
		}

		public void setId(int id){
				this.id = id;
		}
		public void setName(String name){
				this.name = name;
		}
		public void setAge(int age){
				this.age = age;
		}
		public void setGender(String gender){
				this.gender = gender;
		}
		public void setDept(String dept){
				this.dept = dept;
		}
		public void setYearOfJoining(int yearOfJoining){
				this.yearOfJoining = yearOfJoining;
		}
		public void setSalary(int salary){
				this.salary = salary;
		}
		public String toString(){
				return "\nEmployeeID: " + id + "\nName: " + name + "\nAge: " + age + "\nGender: " + gender + "\nDepartment: " + dept + "\nSalary: " + salary + "\nYear Joined: " + yearOfJoining;
		}

		public static void main(String[] args){
				ArrayList<Employee> employees = new ArrayList<Employee>();
				employees.add(new Employee(0, "David Emmerson", 23, "Male", "Development", 2021, 61000));
				employees.add(new Employee(1, "Niko White", 26, "Male", "Development", 2019, 58000));
				employees.add(new Employee(2, "Annabelle Hammond", 26, "Female", "Human Resources", 2022, 65000));
				employees.add(new Employee(3, "Aspen Garcia", 36, "Female", "Human Resources", 2011, 67000));
				employees.add(new Employee(4, "Dylan Martin", 25, "Male", "Development", 2021, 60000));
				employees.add(new Employee(5, "Gavin Taylor", 24, "Male", "Maintenance", 2022, 60000));
				employees.add(new Employee(6, "Ariel Lewis", 26, "Female", "Development", 2021, 62000));
				employees.add(new Employee(7, "Garrett Collins", 39, "Male", "Maintenance", 2015, 56000));
				employees.add(new Employee(8, "Kaiden Hughes", 22, "Male", "Development", 2022, 55000));
				employees.add(new Employee(9, "Holden Davis", 32, "Male", "Human Resources", 2021, 62000));

				// 1) How many male and female employees are there in this organization?
				question1(employees);

				// 2) Find out Average age of male and female emps?
				question2(employees);

				// 3) Find the highest paid employee in this org?
				question3(employees);

				// 4) List all the names of employee who has joined after 2015?
				question4(employees);

				// 5) Find out the senior most employee in this org?

				// 6) Count the number of emps in each department?
				
				// 7) Find male and female employees are in Maintenance department?
				
				// 8) Find the average salary of male and female employees?
				
				// 9) Differentiate the employees who are younger or equal to 30 yrs from those employees who are older than 25 years
				
				// 10) List down the names of all employees in each department?
		}
		public static void question1(ArrayList<Employee> employees){
				Map<String, Long> mfEmployees = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
				System.out.println("Number Of Male and Female Employees: " + mfEmployees);
		}
		public static void question2(ArrayList<Employee> employees){
				Map<String, Double> avgAgeByGender = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
				System.out.println("Average Age by Male and Female: " + avgAgeByGender);
		}
		public static void question3(ArrayList<Employee> employees){
				Optional<Employee> largestSalary = employees.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary)));
				Employee largestSalaryEmp = largestSalary.get();
				System.out.println("Employee with the highest salary: " + largestSalaryEmp);
		}
		public static void question4(ArrayList<Employee> employees){
		}
}
