import java.util.Scanner;
public class Game {
  public static void main(String[] args){
    int heads = 0;
    int tails = 0;

    System.out.println("Who are you?");
    System.out.print(">");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.println("Hello," + name + "!");
    System.out.println("Tossing a coin...");
    for(int i = 1 ; i <= 3 ; i++){
      System.out.print("Round" + i +":");
      String round = sc.next();
      if("Heads".equals(round)) heads++;
      else tails++;
    }
    System.out.println("Heads:" + heads + ",Tails:" + tails);
  }
}