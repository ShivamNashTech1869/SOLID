import java.util.Scanner;

class Rectangle
{
  int m_width;
  int m_height;
 
  public void setWidth(int width)
  {
    m_width = width;
  }
 
  public void setHeight(int h) 
  {
    m_height = h;
  }
 
  public int getWidth() 
  {
    return m_width;
  }
 
  public int getHeight() 
  {
    return m_height;
  }
 
  public int getArea() 
  {
    return m_width * m_height;
  }
 
}

class Square extends Rectangle 
{
  public void setWidth (int width)
  {
    setSide(width);
  }
 
  public void setHeight (int height) 
  {
    setSide(height);
  }

  public void setSide(int side)
  {
    m_width = side;
    m_height = side;
  }
}

public class Main 
{

    public static void main(String []args) 
    { 

     Scanner scanner_object = new Scanner(System.in); 
     System.out.println("Select any choice : \n1:Rctangle\n2:Square");
     int choice = scanner_object.nextInt();
     
     if(choice == 1)
     {
       
      //For Rectangle -
       System.out.print("Enter height of Rectangle: ");
       int height = scanner_object.nextInt();
       System.out.print("Enter width of Rectangle : ");
       int weidth = scanner_object.nextInt();

       Rectangle rectangle_object = new Rectangle();
       rectangle_object.setHeight(height);
       rectangle_object.setWidth(weidth);
       print(rectangle_object.getArea());
            
     }
     else if(choice == 2)
     {
       
      //For Square -
       System.out.print("Enter side of Square : ");
       int side = scanner_object.nextInt();
      
       Square square_object = new Square();
       square_object.setSide(side);  //square_object.setHeight(side);  or square_object.setWeidth(side);
       print(square_object.getArea());
     
     }
     else
     {
      
       System.out.println("Wrong Choice !");
     
     }
    }
   
    
    public static void print(int area)
    {

       System.out.println("Area = " + area);
    
    }

} 
