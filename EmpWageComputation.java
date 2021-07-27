package EmpWageComp;

public class EmpWageComputation {

	public static void main(String[] args) {
	
		int isFullTime = 0;
		int isparttime = 1;
		int workingHr=0;
		int wage_per_hr=20;
    	int empCheck = (int) Math.floor(Math.random() * 10) % 3;
    	switch(empCheck)
    	{
    	   case 0:
    	   {
    	      workingHr=8;
    	      break;
    	   }
    	   case 1:
    	   {	
    	      workingHr=4;
    	      break;
    	   }
    	   case 2:
    	   {	
    	      workingHr=0;
    	      break;
    	   } 
    	}
    	int Emp_wage = wage_per_hr*workingHr;
    	System.out.println(Emp_wage);
	}

}
