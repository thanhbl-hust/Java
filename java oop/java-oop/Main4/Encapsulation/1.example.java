class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
        //using command: Rectangle myRectangle = new Rectangle(); then use below command;
        //set a new Rectangele and using setWidth and setLength to 
        //set value for them;
	}

	public Rectangle(double length, double width) {
		this.length = length; 
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return (length + width) * 2;
	}
}