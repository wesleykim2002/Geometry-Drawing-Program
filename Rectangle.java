import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Rectangle which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */
class Rectangle extends Shape{
  private int length;
  private int width;
  
  /**
   * Constructs a new Rectangle Object
   * @param x the x value of the coordinate of the Rectangle
   * @param y the y value of the coordinate of the Rectangle
   * @param c the Color of the Rectangle
   * @param l the length of the Rectangle
   * @param w the width of the Rectangle
   */
  Rectangle(int x, int y, Color c, int l, int w){
    super(x,y,c);
    this.length = l;
    this.width = w;
  }
  
  /**
   * This method returns the area of the Rectangle
   * @return the area of the Rectangle
   */
  double getArea(){
    return this.length*this.width;
  }
  
  /**
   * This method returns the perimeter of the Rectangle
   * @return the perimeter of the Rectangle
   */
  double getPerimeter(){
    return 2*this.length + 2*this.width;
  }
  
  /**
   * This method draws the Rectangle
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawRect((int)this.getCoordinate().getX(), (int)this.getCoordinate().getY() , this.width, this.length);
  }
  
  /**
   * This method sets the length of the Rectangle
   * @param l the length of the Rectangle
   */
  void setLength(int l){
    this.length = l;
  }
  
  /**
   * This method returns the length of the Rectangle
   * @return the length of the rectangle
   */
  int getLength(){
    return this.length;
  }
  
  /**
   * This method sets the width of the Rectangle
   * @param w the width of the Rectangle
   */
  void setWidth(int w){
    this.width = w;
  }
  
  /**
   * This method returns the width of the Rectangle
   * @return the width of the Rectangle
   */
  int getWidth(){
    return this.width;
  }
}