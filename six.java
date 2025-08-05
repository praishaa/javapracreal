class box{
	int len;
	int hei;
	int bred;
	box(int length,int height,int breadth){
		len=length;
		hei=height;
		bred=breadth;
	}
	box(int length){
		len=length;
		hei=length;
		bred=length;
	}
	int volume() {
		int volume=len*hei*bred;
		return volume;
		
	}
}
public class lollll{
	public static void main(String args[]) {
		box b1=new box(3,4,5);
		box b2=new box(3);
		System.out.println(b1.volume());
		System.out.println(b2.volume());
	}
}