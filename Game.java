import java.util.Scanner;

public class Game{

   public static void main(String args[]){
   
      System.out.println("Hello what is your name?");
      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      sc.nextLine();
      System.out.println("Hello " + name);
      System.out.println("How old are you?");
      int age = sc.nextInt();
      sc.nextLine();
      System.out.println("You were born in " + (2017 - age));
   }
}