public class KiloMiles
{
    public static void main(String[] args)
    {
     double k=Double.parseDouble(args[0]);
     System.out.println("kilometers:"+k);
     double m=(1/0.621371)*k;
     System.out.println("miles:"+m);
    }
}