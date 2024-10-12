package college;


class Box2
{
	    double width;
	    double height;
	    double depth;

	    void volume(int w,int d,int h) {
	        width=w;
	        height=h;
	        depth=d;
	        int volume=d*w*h;
	        System.out.println(+volume);
	    }
	}
public class BoxDemo1
{
	public static void main(String args[])
	{
		Box2 obj=new Box2();
		obj.volume(10,5,10);
	}
}
