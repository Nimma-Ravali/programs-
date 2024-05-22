class Manager
{
	public void greet()
	{
		System.out.println("Hello Manager, Good Evening");
	}
}

public class CreateObjectDynamicall
{
   public static void main(String [] args) throws Exception
   {
	  Manager obj =  Class.forName(args[0]).newInstance();
	  
          //Manager m = (Manager) obj; // Down Casting

	  m.greet();
   }
}