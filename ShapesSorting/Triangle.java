//GET HIP homework
//By Martin Simonini
//Triangle class

public class Triangle extends Shapes 
{
	private int base;
	private int height;

	public Triangle(int base, int height)
	{
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea()
	{
		return (base*height)/2;
	}

	@Override
	public double printDescription()
	{
		return getArea();
	}

}
