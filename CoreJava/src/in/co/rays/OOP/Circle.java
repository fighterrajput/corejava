package in.co.rays.OOP;

public class Circle {

	private int radius;
	
	public int getRadius() {
		return radius;
	}
		public void setRadius(int radius) {
			this.radius= radius;
			
		}
		
		public void area() {
			double carea = 3.14*getRadius()*getRadius();
			System.out.println("Area or circle ="+carea);
		}
	}

