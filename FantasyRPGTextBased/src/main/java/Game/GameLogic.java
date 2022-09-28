package Game;
import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);

    // method to get use input from console
    public static int readInt(String prompt, int userChoices){
        int input;
        do{
            System.out.println(prompt);
            //try everything within the try and if an error occurs, catch it and do what is inside the catch
            try{
                input = Integer.parseInt(scanner.next());
            }catch(Exception e){
                input = -1;
                System.out.println("Please enter an integer!");
            }
        }while(input < 1 || input > userChoices);
        return input;
    }

}
