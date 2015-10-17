//GET HIP Homework
//By Martin Simonini
// Shapes abstract class

public abstract class Shapes implements Printable 
{
	private String shapeType;
	private String shapeName;

	public String getShapeType()
	{
		return shapeType;
	}

	public void setShapeType(String type)
	{
		shapeType = type;
	}

	public String getShapeName()
	{
		return shapeName;
	}

	public void setShapeName(String name)
	{
		shapeName = name;
	}
		
	public abstract double getArea();
}

