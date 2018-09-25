package lab2_array;


import java.util.ArrayList;
import java.util.Vector;
import java.util.Iterator;


	public class Compare {
		public static <T> void main(String[] args) {
			
		int[] array = new int[500000000];
		double start = System.currentTimeMillis();
		double end;
		int sum =0;
		double TotalTime;{
			for (int i = 0; i<4999998; i++) {
				int add = (int) (10*Math.random());
				array[i] = add;
				
			}
			end = System.currentTimeMillis();
			TotalTime = end - start;
			System.out.print("Adding 5000000 numbers to an array total time is:" + TotalTime);
			
			double start0 = System.currentTimeMillis();
			double end0;
			for (int i = 0; i<4999998; i++) {
				
				
				sum = sum+array[i];
			}
			end0 = System.currentTimeMillis();
			double TotalTime0 = end0 - start0;

			System.out.print("\nSuming 5000000 numbers in an array total time is:" + TotalTime0);
			
		
		
		double start1 = System.currentTimeMillis();
		double end1;
		double TotalTime1;
		ArrayList<Integer> list = new ArrayList<Integer>();{
		
		for (int i = 0; i<4999998; i++) {
			int add1 = (int) (10*Math.random());
			list.add(add1);
		}
		end1 = System.currentTimeMillis();
		TotalTime1 = end1 - start1;
		System.out.print("\nAdding 5000000 numbers to an arraylist total time is:" + TotalTime1);
		

		double start11 = System.currentTimeMillis();
		double end11;
		double TotalTime11;
		Iterator<Integer> myIterator = list.iterator();
		double sum2=0;
		while(myIterator.hasNext()) {
			Integer i = myIterator.next();
			sum2= i+sum2;
			myIterator.next();
			
		}
		end11 = System.currentTimeMillis();
		TotalTime11 = end11 - start11;
		System.out.print("\nSumming 5000000 numbers to an arraylist by using an iterator total time is:" + TotalTime11);

		
		double start2 = System.currentTimeMillis();
		double end2;
		double TotalTime2;
		Vector<Integer> vector = new Vector<Integer>();
		
		for (int i = 0; i<4999998; i++) {
			int add2 = (int) (10*Math.random());
			vector.add(add2);
		}
		end2 = System.currentTimeMillis();
		TotalTime2 = end2 - start2;
		System.out.print("\nAdding 5000000 numbers to a vector total time is:" + TotalTime2);
		
		double start22 = System.currentTimeMillis();
		double end22;
		double TotalTime22;
		Iterator<Integer> myIterator2 = vector.iterator();
		double sum3=0;
		while(myIterator2.hasNext()) {
			Integer i = myIterator2.next();
			sum3= i+sum3;
			myIterator2.next();
			
		}
		end22 = System.currentTimeMillis();
		TotalTime22 = end22 - start22;
		System.out.print("\nSumming 5000000 numbers to a vector by using an iterator total time is:" + TotalTime22);

	}
	
	}}}


