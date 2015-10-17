//GET HIP homework
//By Martin Simonini
// Circle class

import java.util.*;

public class Circle extends Shapes
{
	private int radius;

	public Circle(int radius)
	{
		this.radius = radius;
	}

	@Override
	public double  getArea()
	{
		return (Math.PI)*(radius*radius);	
	
	}

	@Override
	public double printDescription()
	{
		return getArea();	
	}

}
