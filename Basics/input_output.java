import java.util.Scanner;
class input_output {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner input = new Scanner(System.in);
 
        String name = input.nextLine(); // string input
        System.out.println("You entered string: " + name);
 
        int age = input.nextInt(); // integer input
        System.out.println("You entered integer: " + age);
 
        float percentage = input.nextFloat(); // float input
        System.out.println("You entered float: " + percentage);
        
        // Closing to avoid memory leak.
       // sc.close();
    }
}
