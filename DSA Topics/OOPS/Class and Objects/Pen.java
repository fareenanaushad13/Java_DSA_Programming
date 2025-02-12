public class Pen{
    public static void main(String args[]){
        Pen1 p1 = new Pen1();//create a pen object called p1
        p1.setColor("Black");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);
        p1.color = "Blue";
        System.out.println(p1.color);
    }
}
class Pen1{ //class
    String color;//properties
    int tip;
    void setColor(String newColor){// funtions
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}