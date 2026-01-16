/** Draws the Koch curve and the the Koch snowflake fractal. */
public class Koch {

	public static void main(String[] args) {

		//// Uncomment the first code block to test the curve function.
		//// Uncomment the second code block to test the snowflake function.
		//// Uncomment only one block in each test, and remember to compile
		//// the class whenever you change the test.

        /*
		// Tests the curve function:
		// Gets n, x1, y1, x2, y2,
		// and draws a Koch curve of depth n from (x1,y1) to (x2,y2).
		curve(Integer.parseInt(args[0]),
			  Double.parseDouble(args[1]), Double.parseDouble(args[2]), 
		      Double.parseDouble(args[3]), Double.parseDouble(args[4]));*/
		

		/*
		// Tests the snowflake function:
		// Gets n, and draws a Koch snowflake of n edges in the standard canvass.*/
		snowFlake(Integer.parseInt(args[0]));
		
	}

	/** Gets n, x1, y1, x2, y2,
     *  and draws a Koch curve of depth n from (x1,y1) to (x2,y2). */
	public static void curve(int n, double x1, double y1, double x2, double y2) {
		if (n == 0) {
			StdDraw.line(x1, y1, x2, y2);
		}
		else {
			double xLineLength = x2 - x1;
			double yLineLength = y2 - y1;
			double xLeft = x1 + xLineLength / 3;
			double xRight = xLeft + xLineLength / 3;
			double yLeft = y1 + yLineLength / 3;
			double yRight = yLeft + yLineLength / 3;
			double pX = ((Math.sqrt(3) / 6) * (y1 - y2)) + (0.5 * (x1 + x2));
			double pY = ((Math.sqrt(3) / 6) * (x2 - x1)) + (0.5 * (y1 + y2));
			curve(n - 1, x1, y1, xLeft, yLeft);
			curve(n - 1, xRight, yRight, x2, y2);
			curve(n - 1, xLeft, yLeft, pX, pY);
			curve(n - 1, pX, pY, xRight, yRight);
		}
	}

    /** Gets n, and draws a Koch snowflake of n edges in the standard canvass. */
	public static void snowFlake(int n) {
    StdDraw.setYscale(0, 1.1);
    StdDraw.setXscale(0, 1.1);
    double x1 = 0.2, y1 = 0.2;
    double x2 = 0.8, y2 = 0.2;
    double side = x2 - x1;
    double h = (Math.sqrt(3) / 2) * side;
    double x3 = 0.5, y3 = y1 + h; // נקודה עליונה
    curve(n, x1, y1, x3, y3);
    curve(n, x3, y3, x2, y2);
    curve(n, x2, y2, x1, y1);
	}
}
