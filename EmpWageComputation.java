package EmpWageComp;

public class EmpWageComputation {

	public static void main(String[] args) {
	
		int isFullTime = 0;
		int isparttime = 1;
		int workingHr=0;
		int wage_per_hr=20;
    	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    	if(empCheck == isFullTime)
           workingHr=8;
    	else if(empCheck == isparttime )
    		workingHr=4;
    	else
    	   workingHr=0;
    	int Emp_wage = wage_per_hr*workingHr;
    	System.out.println(Emp_wage);
	}

}
