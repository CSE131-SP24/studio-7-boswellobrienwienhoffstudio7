package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private int width;
	private int length;
	public Rectangle (int w, int l) {
		//StdDraw.filledRectangle (0.5, 0.5, width/2, length/2);
		this.width = w;
		this.length = l;
	}
	public double Area () {
		return this.width * this.length;
	}
	public double Perimeter () {
		return (2*this.width + 2*this.length);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(8, 90);
		System.out.println(r1.Area());
		System.out.println(r1.Perimeter());
	}

}