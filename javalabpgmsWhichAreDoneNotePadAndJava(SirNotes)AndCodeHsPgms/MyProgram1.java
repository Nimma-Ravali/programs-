public class MyProgram1
{
    public static void main(String[] args)
    {
     int s=Integer.parseInt(args[0]);
     System.out.println("enter the num:");
     secondConvertion(s);
    }
    public static void secondConvertion(int sec){
       int h=sec/3600;
       int m=(sec%3600)/60;
       int s=(sec%3600)%60;
       System.out.println("hours:"+h+"\n"+"minutes:"+m+"\n"+"seconds:"+s);
    }
}