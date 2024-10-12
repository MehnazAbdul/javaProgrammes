package college;
class Box {
          int width;
          int heiight;
          int length;
}
class BoxDemo
{
	public static void main(String args[])
	{
		Box b=new Box();
		b.width=5;
		b.length=10;
		b.heiight=10;
		int volume ;
		volume=b.heiight*b.width*b.length;
		System.out.println(volume);
	}
}