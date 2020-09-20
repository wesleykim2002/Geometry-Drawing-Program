import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

/**
 * This is the class for the shape Rhombus which extends the Shape class
 * @author Wesley Kim
 * @version 1.0
 */
class Rhombus extends Shape{
  private int[] xCoords = new int [4];
  private int[] yCoords = new int[4];
  private int height;
  private int side;
  
  /**
   * Constructs a new Rhombus Object
   * @param x the x value of the coordinate of the Rhombus
   * @param y the y value of the coordinate of the Rhombus
   * @param c the Color of the Rhombus
   * @param side the side length of the Rhombus
   * @param height the height of the Rhombus
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  Rhombus(int x, int y, Color c, int side, int height) throws NotShapeException{
    super(x,y,c);
    this.side = side;
    this.height = height;
    
    if (this.height > this.side){
      throw new NotShapeException();
    }
    
    this.xCoords[0] = x;
    this.xCoords[1] = x+this.side;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    
    
    this.yCoords[0] = y;
    this.yCoords[1] = y;
    this.yCoords[2] = y+this.height;
    this.yCoords[3] = y+this.height;
  }
  
  /**
   * This method draws the Rhombus
   * @param g Graphics Object g
   */
  void draw(Graphics g){
    g.setColor(this.getColor());
    g.drawPolygon(this.xCoords, this.yCoords, 4);
  }
  
  /**
   * This method returns the area of the Rhombus
   * @return the area of the Rhombus
   */
  double getArea(){
    return this.side*this.height;
  }
  
  /**
   * This method returns the perimeter of the Rhombus
   * @return the perimeter of the Rhombus
   */
  double getPerimeter(){
    return 2*this.side + 2*this.side;
  }
  
  /**
   * This method returns the side length of the Rhombus
   * @return the side length of the Rhombus
   */
  int getSide(){
    return this.side;
  }
  
  /**
   * This method returns the height of the Rhombus
   * @return the height of the Rhombus
   */
  int getHeight(){
    return this.height;
  }
  
  /**
   * This method sets the side length of the Rhombus
   * @param side the side length of the Rhombus
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  void setSide(int side) throws NotShapeException{
    this.side = side;
    
    if (this.height > this.side){
      throw new NotShapeException();
    }
    
    this.xCoords[1] = this.xCoords[0]+this.side;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    
    this.yCoords[2] = this.yCoords[0]+this.height;
    this.yCoords[3] = this.yCoords[0]+this.height;
  }
  
  /**
   * This method sets the height of the Rhombus
   * @param height the height of the Rhombus
   * @throws NotShapeException if the dimensions can not make the desired shape
   */
  void setHeight(int height) throws NotShapeException{
    this.height = height;
    
    if (this.height > this.side){
      throw new NotShapeException();
    }
    
    this.xCoords[1] = this.xCoords[0]+this.side;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    
    this.yCoords[2] = this.yCoords[0]+this.height;
    this.yCoords[3] = this.yCoords[0]+this.height;
  }
  
  /**
   * This method moves the Rhombus on the drawing screen
   * @param x the change in the x axis
   * @param y the change in the y axis
   */
  void move(double x, double y){
    this.setCoordinate((int)this.getCoordinate().getX()+x, (int)this.getCoordinate().getY()+y);
    
    this.xCoords[0] = (int)this.getCoordinate().getX();
    this.xCoords[1] = (int)this.getCoordinate().getX()+this.side;
    this.xCoords[2] = (int)(this.xCoords[1] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    this.xCoords[3] = (int)(this.xCoords[0] + Math.sqrt(Math.pow(this.side,2) - Math.pow(this.height,2)));
    
    
    this.yCoords[0] = (int)this.getCoordinate().getY();
    this.yCoords[1] = (int)this.getCoordinate().getY();
    this.yCoords[2] = (int)this.getCoordinate().getY()+this.height;
    this.yCoords[3] = (int)this.getCoordinate().getY()+this.height;
  }
}