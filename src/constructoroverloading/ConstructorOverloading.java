package constructoroverloading;

public class ConstructorOverloading {
	public static void main(String[] args) {
		
		getArea area1=new getArea(22);
		System.out.println("Area of Square:"+area1.CalulateArea());
		getArea area2=new getArea(2,22);
		System.out.println("Area of rectangle:"+area2.CalulateArea());
		
	}
	
	

}

class getArea
{
	double side,length,breath;
	double result;
	getArea(double s)
	{
	  side=s;
	  result=side*side;
	}
	
	getArea(double l,double b)
	{
		length=l;
		breath=b;
		result=length*breath;
	}
	
	
	double CalulateArea()
	{
		return result;
	}
}