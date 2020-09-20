/**
 * Signals that the Shape the user has requested to make can not exist due to its invalid dimensions
 * @author Wesley Kim
 * @version 1.0
 */
public class NotShapeException extends Exception{
  
  /**
   * Constructs a NotShapeException with a message describing the Exception
   */
  NotShapeException(){
    System.out.println("Specified Dimensions not Valid for Shape");
  }
}