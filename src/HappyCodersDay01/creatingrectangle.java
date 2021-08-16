package HappyCodersDay01;

public class creatingrectangle {

	private double width = 1;
	private double height = 1;
	
	

	public creatingrectangle () {
		
		
	}
	public creatingrectangle (double width, double height) {
		this.width=width;
		this.height=height;
		
	}

	public double getArea() {
		return width*height;
		
	}
	public double getPerimeter() {
		return 2*(width*height);
		
		
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
