class shape{
    public void draw(){
        System.out.println("drawing a shape");
    }
}
class circle extends shape{
    @Override public void draw(){
        System.out.println("drawing a circle");
    }
}
class rectangle extends shape{
    @Override public void draw(){
        System.out.println("drawing a rectangle");
    }
}
public class three{
    public static void main(String args[]){
        shape[] shapes=new shape[3];
        shapes[0]=new circle();
        shapes[1]=new rectangle();
        for (int i=0;i<3;i++){
            shapes[i].draw();
        }
    }
}