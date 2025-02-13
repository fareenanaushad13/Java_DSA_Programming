//MethodOverriding: parent and children both contain the same funtions with different definition, the method inside chil class is called(more priority)
public class MethodOverridingRuntime {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
