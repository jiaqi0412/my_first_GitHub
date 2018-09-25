package lab2;

public class PerformanceTest6_2 
{
	public static void main(String[] args)
	{
		
		
		double InitialTime = System.currentTimeMillis();
		double FinalTime;
		double DifferenceTime;
		
		for (int i = 0; i < 50000000; i++)
		{
			int r = (int) (1+10*Math.random());
			int o = (int) (1+10*Math.random());
			InterfaceDesign6 point = new InterfacePointCPDesign2('C', r, o);
			InterfaceDesign6 point2 = new InterfacePointCPDesign2('P', r, o);
			point.getRho();
			point.getTheta();
			point2.getX();
			point2.getY();
			point.convertStorageToPolar();
			point2.convertStorageToPolar();
		
			
	
		}
		
		FinalTime = System.currentTimeMillis();
		DifferenceTime = FinalTime - InitialTime;
		System.out.print("Total run is 30000000, difference Time is:" + DifferenceTime);
	}
}
