
public class ShapesRunner_Sort {
 public static void main(String[] args)
 {
  Shapes[] shapesArray = new Shapes[10];
  populateArray(shapesArray);
  sort(shapesArray);
  
  for(int i = 0; i < shapesArray.length; i++)
  {
     System.out.println("This Shape has an area of :"+shapesArray[i].getArea());
  }
 }
 
 private static vo6id sort(Shapes[] x)
 {
  //I will be using the bubble sort
  //this for loop will go through the array
  //bubble sorts has a complexity of o(n^2)
  for(int i = x.length-1; i > 1; i--)
  {
   //this for loop will compare the current index, j, with the next index, j+1
   for(int j = 0; j < i; j++)
   {
    //if the current index is larger than the next index, which them
    if(x[j].getArea() > x[j+1].getArea())
    {
     Shapes temp = x[j];
     x[j] = x[j+1];
     x[j+1] = temp;
    }
   }
  }
 }
 
 //populates the array with random shapes and random areas
 private static void populateArray(Shapes[] x)
 {
  for(int i = 0; i < x.length; i++)
  {
   int classChoice = (int)(Math.random()*5)+1;
   switch(classChoice)
   {
   case 1:
    x[i] = new Circle((int)(Math.random()*100)+1);
    break;
   case 2:
    x[i] = new Triangle((int)(Math.random()*100)+1, (int)(Math.random()*100)+1);
    break;
   case 3:
    x[i] = new Rectangle((int)(Math.random()*100)+1,(int)(Math.random()*100)+1);
    break;
   case 4:
    x[i] = new Rhombus((int)(Math.random()*100)+1, (int)(Math.random()*100)+1);
    break;
   default:
    x[i] = new Trapezoid((int)(Math.random()*100)+1, (int)(Math.random()*100)+1, (int)(Math.random()*100)+1);
    break;
   }
  }
  
  
  
 }
}