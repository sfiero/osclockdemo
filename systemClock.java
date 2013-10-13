public class systemClock
{
    public static void main(String[] args)
        throws InterruptedException 
        {
            
            DemoMethods demo = new DemoMethods();
            demo.startClock();
            Thread.sleep(1000);
            System.out.println(demo.getElapsedTime()/1000); 
    }
}
class DemoMethods
{
    long startTime = 0;
	public void startClock()
	{
		startTime = System.currentTimeMillis(); //start time
		
	}
	
	public double getElapsedTime()
	{
		long elapsedTime = System.currentTimeMillis() - startTime;
        return elapsedTime;
	}
}
