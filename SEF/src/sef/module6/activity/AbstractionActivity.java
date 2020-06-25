package sef.module6.activity;


public class AbstractionActivity {

	public static void main(String[] args) {
		
		Shape sR = new Rectangle ();
		sR.setColor("green");
		
		System.out.println("Color of Rectangle          : " +sR.getColor());
		
		Rectangle s = new Rectangle ();
		s.setlength(5);
		s.setbreadth(5);
		
		System.out.println("Area of a square   : " + s.calculateArea());
		System.out.println("Perimeter of a square   : " + s.calculatePerimeter());
		
		Rectangle r  = new Rectangle ();
		r.setlength(5);
		r.setbreadth(6);
		
		System.out.println("Area of a rectangle   : " + r.calculateArea());
		System.out.println("Perimeter of a rectangle   : " + r.calculatePerimeter());

		
	}

}
