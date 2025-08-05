 interface vehicle{
	 void start();
	 void stop();
 }
 class car implements vehicle{
	 public void start() {
		 System.out.println("Starts with a button");
	 }
	 public void stop() {
		 System.out.println("Stops with a button");
	 }
 }
 class bike implements vehicle{
	 public void start() {
		 System.out.println("Starts with peddling");
	 }
	 public void stop() {
		 System.out.println("stops with no peddling");
	 }
 }
 public class lollll{
	 public static void main(String args[]) {
		 car cc=new car();
		 bike bb=new bike();
		 cc.start();
		 cc.stop();
		 bb.start();
		 bb.stop();
	 }
 }