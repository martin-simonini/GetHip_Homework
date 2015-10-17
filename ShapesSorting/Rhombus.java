

public class Rhombus extends Shapes 
{
	private int d1;
	private int d2;

	public Rhombus(int d1, int d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}

	@Override
	public double getArea()
	{
		return (d1*d2)/2;
	}

	@Override
	public double printDescription()
	{
		return getArea();
	}

}
