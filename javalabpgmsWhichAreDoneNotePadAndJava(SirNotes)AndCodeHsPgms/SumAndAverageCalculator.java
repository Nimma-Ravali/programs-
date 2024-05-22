public class SumAndAverageCalculator {
    public static void main(String[] args) {
double sum,avg;
       // Find arguments size. If it is not equal to 3 then print "Usage: java SumAndAverageCalculator //<num1> <num2> <num3>" error message and exit from the program.
       if(args.length==3){
        // Parse command-line arguments as doubles
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        System.out.println("java SumAndAverageCalculator"+a +b +c);
        // Calculate the sum
        sum=a+b+c;
        // Calculate the average
        avg=sum/3;
        // Display the results   
        System.out.println("sum of the three numbers:"+sum);
        System.out.println("avarage of the three numbers:"+avg);
       }else{
           System.out.println("java SumAndAverageCalculator"+a + b + c);
           System.out.println("java SumAndAverageCalculator <num1> <num2> <num3>");
       }
    }
}
