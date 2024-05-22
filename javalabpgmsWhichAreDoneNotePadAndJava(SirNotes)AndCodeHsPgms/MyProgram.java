public class MyProgram
{
    public static void main(String[] args)
    {
     System.out.println("enter the num:");
     int n=Integer.parseInt(args[0]);
     isMultiple(n);
    }
    public static void isMultiple(int num){
        if(num%3==0&&num%5==0){
        System.out.println("divisible by 3 and 5"); 
     }else{
         System.out.println("not divisible by 3 and 5");
     }
    }
}