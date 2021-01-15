class Object
{
	int i;
	String s;
	float j;
	double d;
	Object()
	{
		i=10;
		s="kaifi";
		j=5.5f;
		d=4.5678;
	}
	Object(int x,String t,float y,double c)
	{
		i=x;
		s=t;
		j=y;
		d=c;
	}
	void Object()
	{
		System.out.println("method call hogya h dekho");
	}
	public static void main(String[] arg)
	{
		Object o1=new Object();
		System.out.println("i=" +o1.i);
		System.out.println("s=" +o1.s);
		System.out.println("j=" +o1.j);
		System.out.println("d=" +o1.d);
		
		Object o2=new Object(50,"wahh",6.8f,7.456);
		System.out.println("i=" +o2.i);
		System.out.println("s=" +o2.s);
		System.out.println("j=" +o2.j);
		System.out.println("d=" +o2.d);
		
		o1.Object();
		o2.Object();
	}
}