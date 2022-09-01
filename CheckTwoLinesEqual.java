package com.lineComparisonProblem;

public class CheckTwoLinesEqual {

	public static void main(String[] args) {
		int x1 = 2;
		int x2 = 4;
		int y1 = 2;
		int y2 = 4;
		
		int a1 = 2;
		int a2 = 4;
		int b1 = 2;
		int b2 = 4;
	
		String z1 ="0";
		String z2 ="0";
				
		float Line1_Length =  (float) Math.sqrt( Math.pow (x2 - x1 ,2) + Math.pow (y2- y1 , 2));
			
		z1 =String.valueOf(Line1_Length);  
		
		System.out.println( "Line1_Length" );
		System.out.println( Line1_Length );
		
		float Line2_Length =  (float) Math.sqrt( Math.pow (a2 - a1 ,2) + Math.pow (b2- b1 , 2));
		
		z2 =String.valueOf(Line2_Length);
		
		System.out.println( "Line2_Length");
		System.out.println( Line2_Length );
		
		if(z1.equals(z2))
				
		{
			System.out.println(z1.equals(z2));			
			System.out.println("Both Line equal");	

	      }
		else {
			System.out.println("Both Line are not equal");	
			
		}
	}
	
}


