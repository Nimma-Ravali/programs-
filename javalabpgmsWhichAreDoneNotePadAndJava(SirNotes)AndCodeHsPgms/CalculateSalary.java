public class CalculateSalary {
	public static void main(String args[]) {
	    //Declare variables
	    double hrap=15;
	    double conp=15;
	    double enp=10;
		//verify length of an array. if it is not equal to one then print error
		if(args.length==1){
		 double s=Double.parseDouble(args[0]); 
		 System.out.println("java calculatesalary"+s);   
		 System.out.println("Basic salary is:Rs"+s);
		 double hra=s*(hrap/100);
		 System.out.println("HRA is"+hra+"%"+"of basic salary which is:Rs"+hra);
		 double con=s*(conp/100);
		 System.out.println("conveyence is"+conp+"%"+"of basic salary which is:Rs"+con);
		 double en=s*(enp/100);
		 System.out.println("entertainment allowance is"+enp+"%"+"of basic salary which is:Rs"+en);
		 //Calculate Total Salary
		double ts=s+hra+con+en;
		//Print results
		System.out.println("total salary is:Rs"+ts);
		}else{
		  System.out.println("please provide salary amount in command line");
		  System.out.println("for example java calculatorsalary 50000");
		}
	
	}

}