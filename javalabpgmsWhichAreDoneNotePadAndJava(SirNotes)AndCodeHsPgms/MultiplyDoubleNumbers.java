public class MultiplyDoubleNumbers {
    public static void main(String[] args) {
       //Find if args length is 2 or not. if not then display error message.
       if(args.length==2){
         // Parse the command line arguments to double or Float
         double a=Double.parseDouble(args[0]);
         double b=Double.parseDouble(args[1]);
         // Perform the multiplication
         double c=a*b;
         // Display the result
         System.out.println("mul:"+c);
       }else{
           System.out.println("error");
       }
      
    }
}
