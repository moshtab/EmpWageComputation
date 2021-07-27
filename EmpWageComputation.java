package EmpWageComp;

public class EmpWageComputation {
	
	public static final int isFulltime = 0;
	public static final int isparttime  = 1;
	public static final int  wage_per_hr = 20;
	public static final int  maxHrs = 100;
	public static final int  No_of_working_days = 20;
	
	

	public static void main(String[] args) {
	
		
		int empHrs=0;
		int totalworkingdays=0;
		int workingHr=0;
		int Emp_wage=0;
		
		while(empHrs<=maxHrs && totalworkingdays<=No_of_working_days)
	    {
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
    	empHrs += workingHr;
  
    	Emp_wage = Emp_wage+(workingHr*wage_per_hr);
    	totalworkingdays++;
		}
		System.out.println(Emp_wage);
		
	}

}
