class Checkdatatypes
{
	public static void main(String... z)
	{
		byte	a=-128;
		byte	b=127;
		short	c=-32768;
		short	d=32767;
		int		e=-2147483648;
		int		f=2147483647;
		long	g=-9223372038l;
		long	h=9223372037l;
		float	i=-2147483648.000000f;
		float	j=2147483647.000000f;
		double	k=-9223372036854775808.000000000000000;
		double	l=9223372036854775807.000000000000000;
		char	m=69;
		char	n=100;
		boolean	o=true;
		boolean	p=false;
		System.out.println("byte= "+a);
		System.out.println("byte= "+b);
		System.out.println("short= "+c);
		System.out.println("short= "+d);
		System.out.println("int= "+e);
		System.out.println("int= "+f);
		System.out.println("long= "+g);
		System.out.println("long= "+h);
		System.out.println("float= "+i);
		System.out.println("float= "+j);
		System.out.println("double= "+k);
		System.out.println("double= "+l);
		System.out.println("char= "+m);
		System.out.println("char= "+n);
		System.out.println("boolean= "+o);
		System.out.println("boolean= "+p);
	}
}