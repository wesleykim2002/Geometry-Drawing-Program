import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Trapezoid which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */
class Trapezoid extends Shape{
  private int[] xCoords = new int [4];
  private int[] yCoords = new int[4];
  private int height;
  private int sideOne;
  private int sideTwo;
  
  /**
   * Constructs a new Trapezoid Object
   * @param x the x value of the coordinate of the Trapezoid
   * @param y the y value of the coordinate of the Trapezoid
   * @param c the color of the Trapezoid
   * @param sideOne the length of the upper side length of the Trapezoid
   * @param sideTwo the length of the bottom side length of the Trapezoid
   * @param height the height of the Trapezoid
   */
  Trapezoid(int x, int y, Color c, int sideOne, int sideTwo, int height){
    super(x,y,c);
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.height = height;
    
    if (this.sideOne < this.sideTwo){
      this.xCoords[0] = x;
      this.xCoords[1] = x+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] + Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] - Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = y;
      this.yCoords[1] = y;
      this.yCoords[2] = y+this.height;
      this.yCoords[3] = y+this.height;
      
    }else{
      this.xCoords[0] = x;
      this.xCoords[1] = x+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] - Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] + Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = y;
      this.yCoords[1] = y;
      this.yCoords[2] = y+this.height;
      this.yCoords[3] = y+this.height;
    }
  }
  
  /**
   * This method draws the Trapezoid
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawPolygon(this.xCoords, this.yCoords, 4);
  }
  
  /**
   * This method returns the area of the Trapezoid
   * @return the area of the Trapezoid
   */
  double getArea(){
    return (this.sideOne+this.sideTwo)*this.height*0.5;
  }
  
  /**
   * This method returns the perimeter of the Trapezoid
   * @return the perimeter of the Trapezoid
   */
  double getPerimeter(){
    return this.sideOne + this.sideTwo + 2*Math.sqrt(Math.pow((this.sideTwo - this.sideOne)/2.0,2) + Math.pow(this.height,2));
  }
  
  /**
   * This method returns the top side length of the Trapezoid
   * @return the top side length of the Trapezoid
   */
  int getSideOne(){
    return this.sideOne;
  }
  
  /**
   * This method returns the bottom side length of the Trapezoid
   * @return the bottom side length of the Trapezoid
   */
  int getSideTwo(){
    return this.sideTwo;
  }
  
  /**
   * This method returns the height of the Trapezoid
   * @return the height of the Trapezoid
   */
  int getHeight(){
    return this.height;
  }
  
  /**
   * This method sets the top length of the Trapezoid
   * @param sideOne the top length of the Trapezoid
   */
  void setSideOne(int sideOne){
    this.sideOne = sideOne;
    
    if (this.sideOne < this.sideTwo){
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] + Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] - Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
      
    }else{
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] - Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] + Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
    }
  }
  
  /**
   * This method sets the bottom length of the Trapezoid
   * @param sideTwo the bottom length of the Trapezoid
   */
  void setSideTwo(int sideTwo){
    this.sideTwo = sideTwo;
    
    if (this.sideOne < this.sideTwo){
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] + Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] - Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
      
    }else{
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] - Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] + Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
    }
  }
  
  /**
   * This method sets the height of the Trapezoid
   * @param height the height of the Trapezoid
   */
  void setHeight(int height){
    this.height = height;
    
    if (this.sideOne < this.sideTwo){
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] + Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] - Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
      
    }else{
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] - Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] + Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
    }
  }
  
  /**
   * This method moves the Trapezoid on the drawing screen
   * @param x the change in the x axis
   * @param y the change in the y axis
   */
  void move(double x, double y){
    this.setCoordinate((int)this.getCoordinate().getX()+x, (int)this.getCoordinate().getY()+y);
    
    if (this.sideOne < this.sideTwo){
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] + Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] - Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
      
    }else{
      this.xCoords[0] = (int)this.getCoordinate().getX();
      this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
      this.xCoords[2] = (int)(this.xCoords[1] - Math.abs(this.sideTwo - this.sideOne)/2);
      this.xCoords[3] = (int)(this.xCoords[0] + Math.abs(this.sideTwo - this.sideOne)/2);
      
      this.yCoords[0] = (int)this.getCoordinate().getY();
      this.yCoords[1] = (int)this.getCoordinate().getY();
      this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
      this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
    }
  }
}