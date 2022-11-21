class Rectangle{
    private double length;
    private double width;
    public Rectangle(){
        //khoi tao khong tham so;
        //chi tiet trong folder javaoop/classandobjects/constructor.ex;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }



    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * (length + width);
    }

}