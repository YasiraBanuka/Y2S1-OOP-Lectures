import java.util.Scanner;

public class MyMain {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.show();
        Student s2 = new Student(24, "Yasira", 80.0);
        s2.show();
        Student s3 = new Student(56, "Banuka");
        s3.setName("Yash"); //change name in object s3 using setter
        s2.getName();
        s3.show();

        System.out.println("name in the s3 obj is : " + s3.getName());

        System.out.println("");

        Student s4 = new Student();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student ID ==> ");
        int x = scan.nextInt();
        s4.setId(x);
        System.out.print("Enter student Name ==> ");
        String y = scan.next();
        s4.setName(y);
        System.out.print("Enter student Mark ==> ");
        double z = scan.nextDouble();
        s4.setMark(z);
        s4.show();

     }

}
