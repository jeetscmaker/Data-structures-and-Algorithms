package com.jk;

/**
 * Famous wizard Sumar moonji kumaru is stuck in a huge room and has to save
 * Hermione Granger from a monster. Kumaru is at location P1 given by integral
 * coordinates (x1,y1) and Hermione is at location P2 given by integral
 * coordinates (x2,y2). Sadly P1 and P2 are the only points at which floating
 * rocks are present. Rest of the room is without floor and underneath is hot
 * lava.
 * 
 * Kumaru has to go from P1 to P2 but there are no floating rocks to walk on.
 * Kumaru knows a spell that can make the rocks appear but only on the integral
 * coordinates on the straight line joining P1 and P2.
 * 
 * How many rocks can appear at locations (x,y) on the line segment between P1
 * and P2 (excluding P1 and P2) which satisfy the condition that both x and y
 * are integers?
 */
public class IntegralPoints {
	static int solve(int x1, int y1, int x2, int y2) {
		// y = (((y2-y1)/(x2-x1)) * (x-x1)) + y1;
		int count = 0, y;
		int yDiff = y2 - y1;
		int xDiff = x2 - x1;
		double m;

		if ((xDiff < 0 && yDiff > 0) || (xDiff > 0 && yDiff < 0)) {
			m = (Math.abs(yDiff) * 1.0 / Math.abs(xDiff)) * (-1);
		} else {
			m = Math.abs(yDiff) * 1.0/Math.abs(xDiff);
		}

		double d;
		for (int x = x1 + 1; x < x2; x++) {
			d = ((m) * (x - x1)) + y1;
			y = (int) ((m) * (x - x1)) + y1;
			if (d == y) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		 System.out.println("The number of integral points is: " + solve(0, 2, 4, 0));
//		System.out.println(0.5 * -1);
	}
}
