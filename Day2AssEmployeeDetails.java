package week1.day2;

public class Day2AssEmployeeDetails {

	String empName = "Prema Devi K";
	int empId = 9;
	String empAddress = "Madambakkam";
	double empSalary = 937299.7675;
	long mobNum = 123456765L;
	
	public static void main(String[] args) {
		Day2AssEmployeeDetails obj = new Day2AssEmployeeDetails();
		obj.printEmployeeName();
		obj.getEmpAddress();
		obj.printEmployeeSalary();
		obj.printEmpMobileNum();
	}
	
	public void printEmployeeName() {
		System.out.println("Name : " + empName + "," + "EmpID : " + empId);
	}
		
		public String getEmpAddress() {
		System.out.println("Employee Address : "  + empAddress);
		return empAddress;
		}
		
		public void printEmployeeSalary() {
			System.out.println("Employee Salary : " + empSalary);
		}
		
		public void printEmpMobileNum() {
			System.out.println("Employee Mobile Number : " + mobNum);
		}
	}

