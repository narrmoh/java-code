import java.util.*;
class HelloMohith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name");
        String fname= sc.next();
        String lname= sc.next();
        System.out.println("hello "+fname+" "+lname);
        sc.close();
    }
}