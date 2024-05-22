public class SwapNumbersWithoutTempVariable {
    public static void main(String[] args) {
        int a,b;
  // write a logic to display error if arguments length is not equals to 2
if(args.length==2){
// Parse command-line arguments as integers
     double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);  
        // Display the original values
       System.out.println("java SwapNumbersWithoutTempVariable "+a +b);
       System.out.println("Original values num1="+a"num2"+b);
        // Swap the values without using a third variable
        a=a+b;
        b=a-b;
        a=a-b;
        // Display the swapped values
        System.out.println("swapped values num1="+a"num2"+b);
    }else{
        System.out.println("java SwapNumbersWithoutTempVariable "+a +b);
         System.out.println("java SwapNumbersWithoutTempVariable <num1> <num2>");
    }
}
}
