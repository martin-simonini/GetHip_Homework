
public class Rectangle extends Shapes 
{
	
	private int height;
	private int width;

	public Rectangle(int height, int width)
	{
		this.height = height;
		this.width = width;
	}

	@Override
	public double getArea()
	{
		return height*width;
	}

	@Override
	public double printDescription()
	{
		return getArea();
	}

}

