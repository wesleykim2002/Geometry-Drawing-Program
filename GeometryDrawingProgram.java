import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

/**
 * This program enables useres to add, remove, modify, translate, save, and load shapes on a screen
 * @author Wesley Kim
 * @version 1.0
 */
class GeometryDrawingProgram {
  static JFrame frame; // static JFrame frame
  static ArrayList<Shape>shapes= new ArrayList<Shape>(); // static ArrayList that will store all shapes
  
  public static void main(String[] args) {
    GeometryScreen gs = new GeometryScreen();
    Scanner input = new Scanner(System.in);
    
    int option;
    
    System.out.println("Welcome to the Geometry Drawing Program");
    System.out.println();
    
    //main loop
    do{
      System.out.println();
      System.out.println("MAIN MENU");
      System.out.println();
      System.out.println("Type in the number of the desired command: ");
      System.out.println("1. Display all Shapes (sorted by area)");
      System.out.println("2. Add Shape");
      System.out.println("3. Remove Shape");
      System.out.println("4. Modify Shape");
      System.out.println("5. Translate entire drawing (applied to all shapes)");
      System.out.println("6. Save Drawing");
      System.out.println("7. Load Drawing");
      System.out.println("8. Quit");
      option = input.nextInt();
      input.nextLine();
      
      if (option == 1){ // display all shapes
        
        Collections.sort(shapes); // sorts shapes by area
        displayShapes(shapes);
        
      }else if(option == 2){ // add shape
        System.out.println("Enter the type of shape you would like to add: (lower case)");
        System.out.println("Options: circle, rectangle, oval, square, rhombus, trapezoid, parallelogram, and triangle");
        String shapeType = input.nextLine();
        
        if (shapeType.equals("circle")){
          System.out.println("Enter the x coordinate of the upper left corner of the circle: ");
          int x = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the upper left corner of the circle: ");
          int y = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the radius of the circle: ");
          int radius = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          shapes.add(new Circle(x, y, c, radius));
          
        }else if (shapeType.equals("rectangle")){
          
          System.out.println("Enter the x coordinate of the top left corner of the rectangle: ");
          int x = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the top left corner of the rectangle: ");
          int y = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the length of the rectangle: ");
          int length = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the width of the rectangle: ");
          int width = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          
          shapes.add(new Rectangle(x, y, c, length, width));
          
        }else if (shapeType.equals("oval")){
          
          System.out.println("Enter the x coordinate of the upper left corner of the oval: ");
          int x = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the upper left corner of the oval: ");
          int y = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the height of the oval: ");
          int height = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the width of the oval: ");
          int width = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          shapes.add(new Oval(x, y, c, width, height));
          
        }else if (shapeType.equals("square")){
          
          System.out.println("Enter the x coordinate of the upper left corner of the square: ");
          int x = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the upper left corner of the square: ");
          int y = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the side of the square: ");
          int side = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          shapes.add(new Square(x, y, c, side));
          
        }else if (shapeType.equals("rhombus")){
          try{
            System.out.println("Enter the x coordinate of the upper left corner of the rhombus: ");
            int x = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the y coordinate of the upper left corner of the rhombus: ");
            int y = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the side of the rhombus: ");
            int side = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the height of the rhombus: ");
            int height = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the desired color of the circle based on RGB: ");
            System.out.println("R: ");
            int redC = input.nextInt();
            input.nextLine();
            System.out.println("G: ");
            int greenC = input.nextInt();
            input.nextLine();
            System.out.println("B: ");
            int blueC = input.nextInt();
            input.nextLine();
            
            Color c = new Color(redC, greenC, blueC);
            shapes.add(new Rhombus(x, y, c, side, height));
            
          }catch(NotShapeException e){
          }
          
        }else if (shapeType.equals("trapezoid")){
          System.out.println("Enter the x coordinate of the upper left corner of the trapezoid: ");
          int x = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the upper left corner of the trapezoid: ");
          int y = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the top length of the trapezoid: ");
          int sideOne = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the bottom length of the trapezoid: ");
          int sideTwo = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the height of the trapezoid: ");
          int height = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          shapes.add(new Trapezoid(x, y, c, sideOne, sideTwo, height));
          
        }else if (shapeType.equals("parallelogram")){
          try{
            System.out.println("Enter the x coordinate of the upper left corner of the parallelogram: ");
            int x = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the y coordinate of the upper left corner of the parallelogram: ");
            int y = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter one of the sides of the parallelogram: ");
            int sideOne = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the other side of the parallelogram: ");
            int sideTwo = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the height of the parallelogram: ");
            int height = input.nextInt();
            input.nextLine();
            
            System.out.println("Enter the desired color of the circle based on RGB: ");
            System.out.println("R: ");
            int redC = input.nextInt();
            input.nextLine();
            System.out.println("G: ");
            int greenC = input.nextInt();
            input.nextLine();
            System.out.println("B: ");
            int blueC = input.nextInt();
            input.nextLine();
            
            Color c = new Color(redC, greenC, blueC);
            shapes.add(new Parallelogram(x, y, c, sideOne, sideTwo, height));
          }catch(NotShapeException e){
          }
          
        }else if (shapeType.equals("triangle")){
          int[] x = new int[3];
          int[] y = new int[3];
          
          System.out.println("Enter the x coordinate of the first point of the triangle: ");
          x[0] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the first point of the triangle: ");
          y[0] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the x coordinate of the second point of the triangle: ");
          x[1] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the second point of the triangle: ");
          y[1] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the x coordinate of the third point of the triangle: ");
          x[2] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the y coordinate of the third point of the triangle: ");
          y[2] = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the desired color of the circle based on RGB: ");
          System.out.println("R: ");
          int redC = input.nextInt();
          input.nextLine();
          System.out.println("G: ");
          int greenC = input.nextInt();
          input.nextLine();
          System.out.println("B: ");
          int blueC = input.nextInt();
          input.nextLine();
          
          Color c = new Color(redC, greenC, blueC);
          shapes.add(new Triangle(x, y, c));
          
        }
      }else if(option == 3){ // remove shape
        
        displayShapes(shapes);
        
        System.out.println("Enter the number of the shape you would like to have removed: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        
        shapes.remove(index);
        
      }else if(option == 4){ // modify shape
        displayShapes(shapes);
        
        System.out.println("Enter the number of the shape you would like to have modified: ");
        int index = input.nextInt() - 1;
        input.nextLine();
        
        if (shapes.get(index) instanceof Circle){
          System.out.println("1. Move shape");
          System.out.println("2. Change radius");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new length of the radius: ");
            int radius = input.nextInt();
            input.nextLine();
            ((Circle)shapes.get(index)).setRadius(radius);
          }
          
        }else if(shapes.get(index) instanceof Rectangle){
          System.out.println("1. Move shape");
          System.out.println("2. Change length");
          System.out.println("3. Change width");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if(choice == 2){
            System.out.println("Enter the new length: ");
            int length = input.nextInt();
            input.nextLine();
            ((Rectangle)shapes.get(index)).setLength(length);
            
          }else if(choice == 3){
            System.out.println("Enter the new width: ");
            int width = input.nextInt();
            input.nextLine();
            ((Rectangle)shapes.get(index)).setWidth(width);
          }
          
        }else if(shapes.get(index) instanceof Oval){
          System.out.println("1. Move shape");
          System.out.println("2. Change height");
          System.out.println("3. Change width");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new height: ");
            int height = input.nextInt();
            input.nextLine();
            ((Oval)shapes.get(index)).setHeight(height);
            
          }else if(choice == 3){
            System.out.println("Enter the new width: ");
            int width = input.nextInt();
            input.nextLine();
            ((Oval)shapes.get(index)).setWidth(width);
            
          }
          
        }else if(shapes.get(index) instanceof Square){
          System.out.println("1. Move shape");
          System.out.println("2. Change side length");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new side length: ");
            int side = input.nextInt();
            input.nextLine();
            ((Square)shapes.get(index)).setSide(side);
          }
          
        }else if(shapes.get(index) instanceof Rhombus){
          System.out.println("1. Move shape");
          System.out.println("2. Change side length");
          System.out.println("3. Change height");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new side length: ");
            int side = input.nextInt();
            input.nextLine();
            try{
              ((Rhombus)shapes.get(index)).setSide(side);
            }catch (NotShapeException e){
            }
            
          }else if (choice == 3){
            System.out.println("Enter the new height: ");
            int height = input.nextInt();
            input.nextLine();
            try{
              ((Rhombus)shapes.get(index)).setHeight(height);
            }catch (NotShapeException e){
            }
            
          }
          
        }else if(shapes.get(index) instanceof Trapezoid){
          System.out.println("1. Move shape");
          System.out.println("2. Change the top length");
          System.out.println("3. Change the bottom length");
          System.out.println("4. Change the height");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new top length: ");
            int sideOne = input.nextInt();
            input.nextLine();
            ((Trapezoid)shapes.get(index)).setSideOne(sideOne);
            
          }else if(choice == 3){
            System.out.println("Enter the new bottom length: ");
            int sideTwo = input.nextInt();
            input.nextLine();
            ((Trapezoid)shapes.get(index)).setSideTwo(sideTwo);
            
          }else if(choice == 4){
            System.out.println("Enter the new height: ");
            int height = input.nextInt();
            input.nextLine();
            ((Trapezoid)shapes.get(index)).setHeight(height);
          }
          
        }else if(shapes.get(index) instanceof Parallelogram){
          System.out.println("1. Move shape");
          System.out.println("2. Change side one");
          System.out.println("3. Change side two");
          System.out.println("4. Change the height");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          if (choice == 1){
            System.out.println("Enter the change in the x-axis: ");
            int x = input.nextInt();
            input.nextLine();
            System.out.println("Enter the change in the y-axis: ");
            int y = input.nextInt();
            input.nextLine();
            shapes.get(index).move(x,y);
            
          }else if (choice == 2){
            System.out.println("Enter the new top length: ");
            int sideOne = input.nextInt();
            input.nextLine();
            ((Parallelogram)shapes.get(index)).setSideOne(sideOne);
            
          }else if(choice == 3){
            System.out.println("Enter the new bottom length: ");
            int sideTwo = input.nextInt();
            input.nextLine();
            
            try{
              ((Parallelogram)shapes.get(index)).setSideTwo(sideTwo);
            } catch (NotShapeException e){
            }
            
          }else if(choice == 4){
            System.out.println("Enter the new height: ");
            int height = input.nextInt();
            input.nextLine();
            
            try{
              ((Parallelogram)shapes.get(index)).setHeight(height);
            }catch(NotShapeException e){
            }
          }
          
        }else if(shapes.get(index) instanceof Triangle){
          System.out.println("1. Change coordinate 1");
          System.out.println("2. Change coordinate 2");
          System.out.println("3. Change coordinate 3");
          System.out.println("Enter the number of the action you would like to execute: ");
          int choice = input.nextInt();
          input.nextLine();
          
          System.out.println("Enter the new x coordinate: ");
          int x = input.nextInt();
          input.nextLine();
          ((Triangle)shapes.get(index)).setXCoordinate(choice-1, x);
          
          System.out.println("Enter the new y coordinate: ");
          int y = input.nextInt();
          input.nextLine();
          ((Triangle)shapes.get(index)).setYCoordinate(choice-1,y);          
        }
        
      }else if(option == 5){ // translate all shapes on drawing
        System.out.println("Enter the change in the x axis for the entire drawing: ");
        int x = input.nextInt();
        input.nextLine();
        
        System.out.println("Enter the change in the y axis for the entire drawing: ");
        int y = input.nextInt();
        input.nextLine();
        
        for (int i=0; i<shapes.size(); i++){
          if (shapes.get(i) instanceof Triangle){
            for (int j=0; j<3; j++){
              ((Triangle)shapes.get(i)).setXCoordinate(j,((Triangle)shapes.get(i)).getXCoordinate(j)+x);
              ((Triangle)shapes.get(i)).setYCoordinate(j,((Triangle)shapes.get(i)).getYCoordinate(j)+y);
            }
          }else{
            shapes.get(i).move(x,y);
          }
        }
        
      }else if(option == 6){ // save drawing onto file
        System.out.println("Enter the name of file you would like to save the drawing to: (do not include .txt)");
        try{
          String fileName = input.nextLine();
          File drawing = new File(fileName+".txt");
          PrintWriter writer = new PrintWriter(drawing);
          
          for (int i=0; i<shapes.size(); i++){
            if (shapes.get(i) instanceof Circle){
              writer.print("1 "); // the first number will always determine the type of the shape
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Circle)shapes.get(i)).getRadius()+" ");
              
            }else if(shapes.get(i) instanceof Rectangle){
              writer.print("2 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Rectangle)shapes.get(i)).getLength()+" ");
              writer.print(((Rectangle)shapes.get(i)).getWidth()+" ");
              
            }else if(shapes.get(i) instanceof Oval){
              writer.print("3 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Oval)shapes.get(i)).getWidth()+" ");
              writer.print(((Oval)shapes.get(i)).getHeight()+" ");
              
            }else if(shapes.get(i) instanceof Square){
              writer.print("4 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Square)shapes.get(i)).getSide()+" ");
              
            }else if(shapes.get(i) instanceof Rhombus){
              writer.print("5 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Rhombus)shapes.get(i)).getSide()+" ");
              writer.print(((Rhombus)shapes.get(i)).getHeight()+" ");
              
            }else if(shapes.get(i) instanceof Trapezoid){
              writer.print("6 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Trapezoid)shapes.get(i)).getSideOne()+" ");
              writer.print(((Trapezoid)shapes.get(i)).getSideTwo()+" ");
              writer.print(((Trapezoid)shapes.get(i)).getHeight()+" ");
              
            }else if(shapes.get(i) instanceof Parallelogram){
              writer.print("7 ");
              writer.print((int)(shapes.get(i).getCoordinate().getX())+" ");
              writer.print((int)(shapes.get(i).getCoordinate().getY())+" ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Parallelogram)shapes.get(i)).getSideOne()+" ");
              writer.print(((Parallelogram)shapes.get(i)).getSideTwo()+" ");
              writer.print(((Parallelogram)shapes.get(i)).getHeight()+" ");
              
            }else if(shapes.get(i) instanceof Triangle){
              writer.print("8 ");
              writer.print(shapes.get(i).getColor().getRed()+" ");
              writer.print(shapes.get(i).getColor().getGreen()+" ");
              writer.print(shapes.get(i).getColor().getBlue()+" ");
              writer.print(((Triangle)shapes.get(i)).getXCoordinate(0)+" ");
              writer.print(((Triangle)shapes.get(i)).getXCoordinate(1)+" ");
              writer.print(((Triangle)shapes.get(i)).getXCoordinate(2)+" ");
              writer.print(((Triangle)shapes.get(i)).getYCoordinate(0)+" ");
              writer.print(((Triangle)shapes.get(i)).getYCoordinate(1)+" ");
              writer.print(((Triangle)shapes.get(i)).getYCoordinate(2)+" ");
              
            }
            writer.println(); // every line will store the data for one Shape Object
          }
          
          writer.close();
        }catch(FileNotFoundException e){
          System.out.println("File Not Found");
        }
        
        System.out.print("Drawing Saved");
        
      }else if(option == 7){ // load drawing
        shapes = new ArrayList<Shape>();
        System.out.println("Enter the name of file you would like to load the drawing from: (do not include .txt)");
        try{
          String fileName = input.nextLine();
          File drawing = new File(fileName+".txt");
          Scanner reader = new Scanner(drawing);
          
          while(reader.hasNext()){
            String line = reader.nextLine();
            String[]info = line.split(" "); // separates all the numbers into an array of integers
            
            int[]data = new int [info.length];
            for (int i=0; i<info.length; i++){
              data[i] = Integer.parseInt(info[i]);
            }
            
            if(data[0] == 1){ // the first number always determines the type of shape
              shapes.add(new Circle(data[1], data[2], new Color(data[3],data[4],data[5]), data[6])); // each type of Shape has its own format of information
            }else if(data[0] == 2){
              shapes.add(new Rectangle(data[1],data[2], new Color(data[3],data[4],data[5]), data[6], data[7]));
            }else if(data[0] == 3){
              shapes.add(new Oval(data[1], data[2], new Color(data[3],data[4],data[5]), data[6], data[7]));
            }else if(data[0] == 4){
              shapes.add(new Square(data[1], data[2], new Color(data[3],data[4],data[5]), data[6]));
            }else if(data[0] == 5){
              try{
                shapes.add(new Rhombus(data[1], data[2], new Color(data[3],data[4],data[5]), data[6], data[7]));
              }catch(NotShapeException e){
              }
            }else if(data[0] == 6){
              shapes.add(new Trapezoid(data[1], data[2], new Color(data[3],data[4],data[5]), data[6], data[7], data[8]));
            }else if(data[0] == 7){
              try{
                shapes.add(new Parallelogram(data[1], data[2], new Color(data[3],data[4],data[5]), data[6], data[7], data[8]));
              }catch(NotShapeException e){
              }
            }else if(data[0] == 8){
              int[] xCoords = {data[4], data[5], data[6]};
              int[] yCoords = {data[7], data[8], data[9]};
              shapes.add(new Triangle(xCoords, yCoords, new Color(data[1], data[2], data[3])));
            }
          }
          reader.close();
        }catch(FileNotFoundException e){
          System.out.println("File Not Found");
        }
      }
      Collections.sort(shapes); // sorts shapes by area
      frame.repaint(); //update the screen
    }while(option != 8);
    
    System.out.println("DONE");
    input.close();
  }
  
  /**
   * This method displays all the Shapes from the drawing on the console
   * @param shapes ArrayList of all the shapes on the drawing
   */
  public static void displayShapes(ArrayList<Shape>shapes){
    if (shapes.size() == 0){
      System.out.println("No Shapes Are Currently Drawn");
    }else{
      for (int i=0; i<shapes.size(); i++){
        System.out.println("Shape "+(i+1));
        System.out.println("Type: "+shapes.get(i).getClass());
        System.out.println("Area: "+shapes.get(i).getArea());
        System.out.println("Perimeter: "+shapes.get(i).getPerimeter());
        
        if (shapes.get(i) instanceof Circle){
          System.out.println("Radius: "+((Circle)shapes.get(i)).getRadius());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Rectangle){
          System.out.println("Length: "+((Rectangle)shapes.get(i)).getLength());
          System.out.println("Width: "+((Rectangle)shapes.get(i)).getWidth());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Oval){
          System.out.println("Width: "+((Oval)shapes.get(i)).getWidth());
          System.out.println("Length: "+((Oval)shapes.get(i)).getHeight());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Square){
          System.out.println("Side: "+((Square)shapes.get(i)).getSide());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Rhombus){
          System.out.println("Side: "+((Rhombus)shapes.get(i)).getSide());
          System.out.println("Height: "+((Rhombus)shapes.get(i)).getHeight());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Trapezoid){
          System.out.println("Side One: "+((Trapezoid)shapes.get(i)).getSideOne());
          System.out.println("Side Two: "+((Trapezoid)shapes.get(i)).getSideTwo());
          System.out.println("Height: "+((Trapezoid)shapes.get(i)).getHeight());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Parallelogram){
          System.out.println("Side One: "+((Parallelogram)shapes.get(i)).getSideOne());
          System.out.println("Side Two: "+((Parallelogram)shapes.get(i)).getSideTwo());
          System.out.println("Height: "+((Parallelogram)shapes.get(i)).getHeight());
          System.out.println("Coordinate of Top Left Corner: ("+(int)(shapes.get(i).getCoordinate().getX())+","+(int)(shapes.get(i).getCoordinate().getY())+")");
          
        }else if(shapes.get(i) instanceof Triangle){
          System.out.println("Point 1: ("+((Triangle)shapes.get(i)).getXCoordinate(0)+","+((Triangle)shapes.get(i)).getYCoordinate(0)+")");
          System.out.println("Point 2: ("+((Triangle)shapes.get(i)).getXCoordinate(1)+","+((Triangle)shapes.get(i)).getYCoordinate(1)+")");
          System.out.println("Point 3: ("+((Triangle)shapes.get(i)).getXCoordinate(2)+","+((Triangle)shapes.get(i)).getYCoordinate(2)+")");
        }
      }
    }
  }
  
  //This is an inner class - it has access to the static variables defined above
  public static class GeometryScreen {
    
    //constructor - do no modify
    GeometryScreen(){
      frame = new JFrame("Geometry Drawing Program 1.0");
      
      //Create a new "custom" panel for graphics based on the inner class below
      JPanel graphicsPanel = new GraphicsPanel();
      
      //Add the panel and the frame to the window
      frame.getContentPane().add(graphicsPanel);
      
      // Set the frame to full screen 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(520,540);
      frame.setUndecorated(false);  //Set to true to remove title bar
      frame.setVisible(true);
      
    } 
    
//This is an inner class which contains all the details about drawing to screen.
    public static class GraphicsPanel extends JPanel {
      //The method that draws to the screen - you will need to add.modify code here
      public void paintComponent(Graphics g) {
        setDoubleBuffered(true);
        g.setColor(Color.BLACK);
        //draw the X/Y Axis
        g.drawLine(250, 0, 250, 500);
        g.drawLine(0, 250, 500, 250);
        
        //You will need to draw each of the Shapes contained in your Arraylist here
        //This screen will update everytime the menu loop completes
        
        for (int i=0; i<shapes.size(); i++){
          shapes.get(i).draw(g);
        }
      }
    }
  }
}