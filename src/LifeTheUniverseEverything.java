import java.util.Scanner;

public class LifeTheUniverseEverything {
    public static void main(String... args){
      while (true){

          Scanner scanner = new Scanner(System.in);
          int input = scanner.nextInt();
          if(input==42)
              break;
          System.out.println(input);

      }

    }
}
