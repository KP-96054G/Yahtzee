import java.util.*;
public class Main {
    
    //YOU MIGHT HAVE TO SET THIS AS THE MAIN FILE
    
    
    public static void main(String[] args) {
        boolean run = true;
        Scanner in = new Scanner(System.in);
        while(run){
            Game game = new Game();
            System.out.println();
            System.out.println("Thanks for playing!" + "\n Would you like to play again? ('yes' for yes and anything else for no)");
            String inp = in.nextLine();
            if(inp.toUpperCase().equals("YES")){
                continue;
            }
            else{
                run = !run;
            }
        }
    }
}