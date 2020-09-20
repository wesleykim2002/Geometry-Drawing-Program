import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the abstract class for Shape
 * @author Wesley Kim
 * @version 1.0
 */

abstract class Shape implements Comparable<Shape>{
  private Point point;
  private Color color;
  
  /**
   * Constructs a new Shape Object
   * @param x the x value of the coordinate of the Shape
   * @param y the y value of the coordinate of the Shape
   * @param c the color of the Shape
   */
  Shape(int x, int y, Color c){
    this.point = new Point(x, y);
    this.color = c;
  }
  
  /**
   * Constructs a new Shape Object
   * @param c the color of the Shape
   */
  Shape(Color c){
    this.color = c;
  }
  
  /**
   * This method compares the areas of two Shape Object
   * @param shape the Shape that the Object will be compared to
   */
  public int compareTo(Shape shape){
    if(this.getArea() == shape.getArea()){
      return 0;
    }else if(this.getArea()<shape.getArea()){
      return 1;
    }else{
      return -1;
    }
  }
  
  /**
   * This method draws the Shape
   * @param g Graphics Object g
   */
  abstract void draw(Graphics g);
  
  /**
   * This method returns the area of the Shape
   * @return the area of the shape
   */
  abstract double getArea();
  
  /**
   * This method returns the perimeter of the Shape
   * @return the perimeter of the shape
   */
  abstract double getPerimeter();
  
  /**
   * This method returns the Object Point
   * @return the Point of the Shape
   */
  Point getCoordinate(){
    return this.point;
  }
  
  /**
   * This method sets the values stored in Point
   * @param x the x value stored in Point
   * @param y the y value stored in Point
   */
  void setCoordinate(double x, double y){
    this.point.setLocation(x,y);
  }
  
  /**
   * This method moves the location of the Point
   * @param x the change in the x axis
   * @param y the change in the y axis
   */
  void move(double x, double y){
    this.point.setLocation(this.point.getX()+x, this.point.getY()+y);
  }
  
  /**
   * This method sets the Color of the Shape
   * @param c the Color of the Shape
   */
  void setColor(Color c){
    this.color = c;
  }
  
  /**
   * This method returns the Object Color of the Shape
   * @return the Color of the Shape
   */
  Color getColor(){
    return this.color;
  }
}