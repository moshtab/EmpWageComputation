package EmpWageComp;

public class EmpWageComputation {

	public static void main(String[] args) {
	
		int isFullTime = 0;
		int isparttime = 1;
		int workingHr=0;
		int wage_per_hr=20;
		int No_of_working_days=20;
		int Emp_wage=0;
		for(int day=0;day<No_of_working_days;day++)
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
  
    	Emp_wage = Emp_wage+(workingHr*wage_per_hr);
		}
		System.out.println(Emp_wage);
		
	}

}
