interface Mylaptop
{
	void ram();
	void hhd();
	void windows();
	void size();
}
class Hp implements Mylaptop
{
	public void ram()
	{
		System.out.println("RAM-8GB");
	}
	public void hhd()
	{
		System.out.println("HHD-500GB");
	}
	public void windows()
	{
		System.out.println("Windows 10 pro");
	}
	public void size()
	{
		System.out.println("Size-14\"");
	}
}
class Interface
{
	public static void main(String[] args)
	{
		Hp obj=new Hp();
		obj.ram();
		obj.hhd();
		obj.windows();
		obj.size();
	}
}