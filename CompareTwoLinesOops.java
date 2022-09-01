package com.lineComparisonProblem;

public class CompareTwoLinesOops {

	int x1 = 80;
	int x2 = 400;
	int y1 = 80;
	int y2 = 400;

	int a1 = 80;
	int a2 = 40;
	int b1 = 80;
	int b2 = 40;

	Double z1 = 0.0;
	Double z2 = 0.0;

	public static void main(String[] args) {

	CompareTwoLinesOops compareTwoLines = new CompareTwoLinesOops();

	float Line1_Length = (float) Math.sqrt(Math.pow(compareTwoLines.x2 - compareTwoLines.x1, 2)
				+ Math.pow(compareTwoLines.y2 - compareTwoLines.y1, 2));

	compareTwoLines.z1 = Double.valueOf(Line1_Length);

	System.out.println("Line1_Length");
	System.out.println(Line1_Length);

	float Line2_Length = (float) Math.sqrt(Math.pow(compareTwoLines.a2 - compareTwoLines.a1, 2)
			+ Math.pow(compareTwoLines.b2 - compareTwoLines.b1, 2));

	compareTwoLines.z2 = Double.valueOf(Line2_Length);

	System.out.println("Line2_Length");
	System.out.println(Line2_Length);

		// System.out.println(z1);
		// System.out.println(z2);

	System.out.println(compareTwoLines.z1.compareTo(compareTwoLines.z2)); // if z2--> greater thn -ve , if
																				// z1-->greater thn +ve value

	if (compareTwoLines.z1.compareTo(compareTwoLines.z2) == 1)

		{
			// System.out.println(z1.compareTo(z2));
			System.out.println("z1 line is greater");
		}

	else if (compareTwoLines.z1.compareTo(compareTwoLines.z2) == -1){
			// System.out.println(z1.compareTo(z2));
			System.out.println("z2 Line is greater");
		} else {
			System.out.println("both line Equal");
		}
	}

}

