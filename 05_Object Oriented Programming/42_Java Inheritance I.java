class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends Animal implements interFace{
    void fly(){
        System.out.println("I am flying");
    }
    @Override
    public void sing(){
        System.out.println("I am singing");
    }
}
interface interFace{
    void sing();
}

public class Solution {
    public static void main(String[] argh){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}