//polymorphism:means having many forms
//method overloading:Multiple function with the same name but diffrent parameter 
public class MethodOverloadingCompiletime {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.sum(1,2));
        System.out.println(cal.sum((float)1.5,(float)2.5));
        System.out.println(cal.sum(1,2,3));
    }
}
class Calculator{
    int sum(int a , int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b , int c){
        return a+b+c;
    }
}
