class animal{
    public void makesound(){
        System.out.println("animals make sounds");
    }}
    class dog extends animal{
        @override public void makesound(){
        System.out.println("woof woof");}
    }
    class cat extends animal{
        @override public void makesound(){
            System.out.println("meow");
        }
    }

public class two{
    public static void main(String args[]){
        dog Dog=new dog();
        cat Cat=new cat();
        Dog.makesound();
        Cat.makesound();
    }
}