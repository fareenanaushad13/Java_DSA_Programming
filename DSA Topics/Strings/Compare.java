public class Compare{
    public static void main(String args[]){
    String s1 = "far";
    String s2 = "farru";
    String s3 = new String("far");
    if(s1.equals(s3)){
        System.out.println("Strings are equal");
    }else{
        System.out.println("Strings are not equal");
    }
    }
}