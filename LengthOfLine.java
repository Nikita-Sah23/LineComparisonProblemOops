package com.lineComparisonProblem;

public class LengthOfLine {
	
    int x1 = 2;
	int x2 = 4;
	int y1 = 2;
	int y2 = 4;				

	public static void main(String[] args) 
	{
		LengthOfLine length = new LengthOfLine();

	  float Line1_Length =  (float) Math.sqrt( Math.pow (length.x2 - length.x1 ,2) + Math.pow (length.y2- length.y1 , 2));			
			
			System.out.println( "Line1_Length" );
			System.out.println( Line1_Length );	
	}

	}


