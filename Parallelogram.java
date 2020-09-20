import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Parallelogram which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */

class Parallelogram extends Shape{
  private int[] xCoords = new int [4];
  private int[] yCoords = new int[4];
  private int height;
  private int sideOne;
  private int sideTwo;
  
  /**
   * Constructs a new Parallelogram Object
   * @param x the x value of the coordinate of the Parallelogram
   * @param y the y value of the coordinate of the Parallelogram
   * @param c the color of the Parallelogram
   * @param sideOne one of the side lengths of the Parallelogram
   * @param sideTwo the other side length of the Parallelogram
   * @param height the height of the Parallelogram
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  Parallelogram(int x, int y, Color c, int sideOne, int sideTwo, int height) throws NotShapeException{
    super(x,y,c);
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
    this.height = height;
    
    if(this.height>this.sideTwo){
      throw new NotShapeException();
    }
    
    this.xCoords[0] = x;
    this.xCoords[1] = x+this.sideOne;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    
    this.yCoords[0] = y;
    this.yCoords[1] = y;
    this.yCoords[2] = y+this.height;
    this.yCoords[3] = y+this.height;
  }
  
  /**
   * This method draws the Parallelogram
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(getColor());
    g.drawPolygon(this.xCoords, this.yCoords, 4);
  }
  
  /**
   * This method returns the area of the Parallelogram
   * @return the area of the Parallelogram
   */
  double getArea(){
    return this.sideOne*this.height;
  }
  
  /**
   * This method returns the perimeter of the Parallelogram
   * @return the perimeter of the Parallelogram
   */
  double getPerimeter(){
    return 2*this.sideOne + 2*this.sideTwo;
  }
  
  /**
   * This method returns one of the side lengths of the Parallelogram
   * @return a side length of the Parallelogram
   */
  int getSideOne(){
    return this.sideOne;
  }
  
  /**
   * This method returns the other side length of the Parallelogram
   * @return a side length of the Parallelogram
   */
  int getSideTwo(){
    return this.sideTwo;
  }
  
  /**
   * This method returns the height of the Parallelogram
   * @return the height of the Parallelogram
   */
  int getHeight(){
    return this.height;
  }
  
  /**
   * This method sets one of the side lengths of the Parallelogram
   * @param sideOne the side length of one of the two sides of the Parallelogram
   */
  void setSideOne(int sideOne){
    this.sideOne = sideOne;
    
    this.xCoords[1] = this.xCoords[0]+this.sideOne;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    
    this.yCoords[2] = this.yCoords[0]+this.height;
    this.yCoords[3] = this.yCoords[0]+this.height;
  }
  
  /**
   * This method sets one of the sides lengths of the Parallelogram
   * @param sideTwo the side length of one of the two sides of the Parallelogram
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  void setSideTwo(int sideTwo) throws NotShapeException{
    this.sideTwo = sideTwo;
    
    if(this.height>this.sideTwo){
      throw new NotShapeException();
    }
    
    this.xCoords[1] = this.xCoords[0]+this.sideOne;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    
    this.yCoords[2] = this.yCoords[0]+this.height;
    this.yCoords[3] = this.yCoords[0]+this.height;
  }
  
  /**
   * This method sets the height of the Parallelogram
   * @param height the height of the Parallelogram
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  void setHeight(int height) throws NotShapeException{
    this.height = height;
    
    if(this.height>this.sideTwo){
      throw new NotShapeException();
    }
    
    this.xCoords[1] = this.xCoords[0]+this.sideOne;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    
    this.yCoords[2] = this.yCoords[0]+this.height;
    this.yCoords[3] = this.yCoords[0]+this.height;
  }
  
  /**
   * This method moves the Parallelogram on the drawing screen
   * @param x the change in the x axis
   * @param y the change in the y axis
   */
  void move(double x, double y){
    this.setCoordinate((int)this.getCoordinate().getX()+x, (int)this.getCoordinate().getY()+y);
    
    this.xCoords[0] = (int)this.getCoordinate().getX();
    this.xCoords[1] = (int)this.getCoordinate().getX()+this.sideOne;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.sideTwo,2) - Math.pow(this.height,2)));
    
    this.yCoords[0] = (int)this.getCoordinate().getY();
    this.yCoords[1] = (int)this.getCoordinate().getY();
    this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
    this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
  }
}