import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Square which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */
class Square extends Shape{
  private int side;
  
  /**
   * Constructs a new Square Object
   * @param x the x value of the coordinate of the Square
   * @param y the y value of the coordinate of the Square
   * @param c the color of the Square
   * @param s the side length of the Square
   */
  Square(int x, int y, Color c, int s){
    super(x,y,c);
    this.side = s;
  }
  
  /**
   * This method returns the area of the Square
   * @return the area of the Square
   */
  double getArea(){
    return Math.pow(this.side,2);
  }
  
  /**
   * This method returns the perimeter of the Square
   * @return the perimeter of the Square
   */
  double getPerimeter(){
    return 4*this.side;
  }
  
  /**
   * This method draws the Square
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawRect((int)this.getCoordinate().getX(), (int)this.getCoordinate().getY() , this.side, this.side);
  }
  
  /**
   * This method sets the side length of the Square
   * @param s the side length Square
   */
  void setSide(int s){
    this.side = s;
  }
  
  /**
   * This method returns the side length of the Square
   * @return the side length of the Square
   */
  int getSide(){
    return this.side;
  }
}