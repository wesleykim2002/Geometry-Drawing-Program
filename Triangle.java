import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Triangle which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */

class Triangle extends Shape{
  private int[] xCoords = new int [3];
  private int[] yCoords = new int[3];
  
  /**
   * Constructs a new Triangle Object
   * @param x an integer array of all the x values of the coordinates of the Triangle
   * @param y an integer array of all the y values of the coordinates of the Triangle
   * @param c the color of the Triangle
   */
  Triangle(int[] x, int[] y, Color c){
    super(c);
    
    this.xCoords = x;
    this.yCoords = y;
  }
  
  /**
   * This method draws the Triangle
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(getColor());
    g.drawPolygon(this.xCoords, this.yCoords, 3);
  }
  
  /**
   * This method returns the area of the Triangle
   * @return the area of the Triangle
   */
  double getArea(){
    return Math.abs((this.xCoords[0]*(this.yCoords[1]-this.yCoords[2]) + this.xCoords[1]*(this.yCoords[2]-this.yCoords[0]) + this.xCoords[2]*(this.yCoords[0]-this.yCoords[1]))/2);
  }
  
  /**
   * This method returns the perimeter of the Triangle
   * @return the perimeter of the Triangle
   */
  double getPerimeter(){
    return Math.sqrt(Math.pow(this.xCoords[1]-this.xCoords[0],2)+Math.pow(this.yCoords[1]-this.yCoords[0],2)) + Math.sqrt(Math.pow(this.xCoords[2]-this.xCoords[1],2)+Math.pow(this.yCoords[2]-this.yCoords[1],2)) + Math.sqrt(Math.pow(this.xCoords[0]-this.xCoords[2],2)+Math.pow(this.yCoords[0]-this.yCoords[2],2));
  }
  
  /**
   * This method returns the x value of a coordinate of the Triangle
   * @param index the number which specifies which of three coordinates is desired by the user
   * @return the x value of a specified coordinate
   */
  int getXCoordinate(int index){
    return this.xCoords[index];
  }
  
  /**
   * This method returns the y value of a coordinate of the Triangle
   * @param index the number which specifies which of three coordinates is desired by the user
   * @return the y value of a specified coordinate
   */
  int getYCoordinate(int index){
    return this.yCoords[index];
  }
  
  /**
   * This method sets the x value of a coordinate of the Triangle
   * @param index the number which specifies which of three coordinates is desired by the user
   * @param newX the x value of a specified coordinate
   */
  void setXCoordinate(int index, int newX){
    this.xCoords[index] = newX;
  }
  
  /**
   * This method sets the y value of a coordinate of the Triangle
   * @param index the number which specifies which of three coordinates is desired by the user
   * @param newY the y value of a specified coordinate
   */
  void setYCoordinate(int index, int newY){
    this.yCoords[index] = newY;
  }
}