// Assignment 9.1 - Rectangle class
// this program will compute measurements for a rectangle
package wk9;

public class Rectangle {

    private double width;
    private double height;

    public Rectangle() {
        this.setWidth(1.0);
        this.setHeight(1.0);
    }

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    // getters
    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
    
    // setters
    public void setHeight(double height) {
        this.height = height;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    // return area
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }
    // return perimeter
    public double getPerimeter() {
        return this.getWidth() * 2 + this.getHeight() * 2;
    }

}