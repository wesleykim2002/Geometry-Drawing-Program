import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Circle which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */

class Circle extends Shape{
  private int radius;
  
  /**
   * Constructs a new Circle Object
   * @param x the x value of the coordinate of the Circle
   * @param y the y value of the coordinate of the Circle
   * @param c the color of the Circle
   * @param r the radius of the Circle
   */
  Circle(int x, int y, Color c, int r){
    super(x,y,c);
    this.radius = r;
  }
  
  /**
   * This method returns the area of the Circle
   * @return the area of the Circle
   */
  double getArea(){
    double area = Math.pow(radius,2)*Math.PI;
    return area;
  }
  
  /**
   * This method returns the perimeter (circumference) of the Circle
   * @return the perimeter of the Circle
   */
  double getPerimeter(){
    double perimeter = 2*Math.PI*this.radius;
    return perimeter;
  }
  
  /**
   * This method sets the radius of the Circle
   * @param r the radius of the Circle
   */
  void setRadius(int r){
    this.radius = r;
  }
  
  /**
   * This method returns the radius of the Circle
   * @return the radius of the specified Circle
   */
  int getRadius(){
    return this.radius;
  }
  
  /**
   * This method draws the Circle
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawOval((int)this.getCoordinate().getX(), (int)this.getCoordinate().getY() , radius, radius);
  }
}