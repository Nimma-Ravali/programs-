public class CircleAreaCalculator {
	
	 public static void main(String[] args) {
	     double p=3.14;
    double r=Double.parseDouble(args[0]);
if(r>0){
    double a=p*(r*r);
     System.out.println("the area of the circle with radius "+ args[0]+ " is" + a);
    }else{
    System.out.println("radius must be a non-negative number");
    }
   }
}
