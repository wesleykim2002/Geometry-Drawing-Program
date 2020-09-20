import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Oval which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */

class Oval extends Shape{
  private int width;
  private int height;
  
  /**
   * Constructs a new Oval Object
   * @param x the x value of the coordinate of the Oval
   * @param y the y value of the coordinate of the Oval
   * @param c the Color of the Oval
   * @param w the width of the Oval
   * @param h the height of the Oval
   */
  Oval(int x, int y, Color c, int w, int h){
    super(x,y,c);
    this.width = w;
    this.height = h;
  }
  
  /**
   * This method returns the area of the Oval
   * @return the area of the Oval
   */
  double getArea(){
    return this.width*this.height*Math.PI;
  }
  
  /**
   * This method returns the perimeter of the Oval
   * @return the perimeter of the Oval
   */
  double getPerimeter(){
    return 2*Math.PI*Math.sqrt((Math.pow(this.width,2)+Math.pow(this.height,2))/2);
  }
  
  /**
   * This method sets the width of the Oval
   * @param w the new width of the Oval
   */
  void setWidth(int w){
    this.width = w;
  }
  
  /**
   * This method returns the width of the Oval
   * @return the width of the Oval
   */
  int getWidth(){
    return this.width;
  }
  
  /**
   * This method sets the height of the Oval
   * @param h the new height of the Oval
   */
  void setHeight(int h){
    this.height = h;
  }
  
  /**
   * This method returns the height of the Oval
   * @return the height of the Oval
   */
  int getHeight(){
    return this.height;
  }
  
  /**
   * This method draws the Oval
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawOval((int)this.getCoordinate().getX(), (int)this.getCoordinate().getY(), width, height);
  }
}