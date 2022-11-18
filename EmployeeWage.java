package bl.com.day8;

import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("--Welcome to employee wage ");
		
		String attendanceString = EmployeeWage.checkAttendance();
	    System.out.println(attendanceString);
	    checkAttendance() ;

	}

	  private static String checkAttendance() {
	    Random random = new Random();
	    boolean randomBool = random.nextBoolean();

	    if (randomBool) return "Employee is present.";
	    
	    else return "Employee is absent.";

	}
}
