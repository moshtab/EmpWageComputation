package EmpWageComp;

public class EmpWageComputation {

	public static void main(String[] args) {
	
		int isFullTime = 0;
    	int empCheck = (int) Math.floor(Math.random() * 10) % 2;
    	if(empCheck == isFullTime)
            System.out.println( "Emp is present");
    	else
    		System.out.println("Emp is absent");
	}

}
