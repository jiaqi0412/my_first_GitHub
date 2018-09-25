package lab2;

public class PerformanceTest3 
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
			PointCPDesign3 point = new PointCPDesign3('C', r, o);
			PointCPDesign3 point2 = new PointCPDesign3('P', r, o);
			point.getRho();
			point.getTheta();
			point2.getX();
			point2.getY();
			point.convertStorageToCartesian();
			point2.convertStorageToCartesian();

			
		}
		
		FinalTime = System.currentTimeMillis();
		DifferenceTime = FinalTime - InitialTime;
		System.out.print("Total run is 30000000, difference Time is:" + DifferenceTime);
	}
}
