
public class Trapezoid extends Shapes 
{
	private int b1; //base 1
	private int b2; //base 2
	private int height;

	public Trapezoid(int b1, int b2, int height)
	{
		this.b1 = b1;
		this.b2 = b2;
		this.height = height;
	}

	@Override
	public double getArea()
	{
		return ((b1+b2)/2)*height;
	}

	@Override
	public double printDescription()
	{
		return getArea();
	}

}
