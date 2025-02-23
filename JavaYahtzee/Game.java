import java.util.*;
public class Game
{
    public Game()
    {
        

        
        String p1 = "";
        String p2 = "";
        String p3 = "";
        String p4 = "";
        int pla = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Yahtzee, How many players will be playing (up to 4)");
        int p = in.nextInt();
        in.nextLine();
        Intro run = new Intro(p);
        if(p > 0 && p <= 4){
            if(p == 1){
                run.P0();
                run.P1();

                p1 = in.nextLine();
                pla = 1;
                p2 = "";
                p3 = "";
                p4 = "";
                
                }
            else if(p == 2){
                run.P0();
                run.P1();

                p1 = in.nextLine();
                run.P2();
                p2 = in.nextLine();
                pla = 2;
                p3 = "";
                p4 = "";
            }
            else if(p == 3){
                run.P0();
                run.P1();

                p1 = in.nextLine();
                run.P2();
                p2 = in.nextLine();
                run.P3();
                p3 = in.nextLine();
                pla = 3;
                p4 = "";
            }
            else{
                run.P0();
                run.P1();

                p1 = in.nextLine();
                run.P2();
                p2 = in.nextLine();
                run.P3();
                p3 = in.nextLine();
                run.P4();
                p4 = in.nextLine();
                pla = 4;
            }
            
        }
        else{
            System.out.println("Not a valid player num. Please restart");
        }
        run.clear();
        Scorecard game = new Scorecard(p, p1, p2, p3, p4);
        for(int i = 1; i < 14; i++){
            run.P0();
            game.setScore();
            System.out.println("Scorecards: ");
            for(int k2 = 0; k2 < pla; k2++){
                game.addC();
                run.P0();
                game.setNull();
                System.out.println(game);
                run.P0();
                
            }
            game.setC();
            System.out.println("Press any key to start turn " + i);
            run.P0();
            String clrg = in.nextLine();
            run.clear();
            run.turns(i);
            
            run.P0();
            for(int k = 0; k < pla; k++){
                game.Turn();
                
                run.P0();
                System.out.println("Time for dice rolls");
                game.dice1();
                run.P0();
                System.out.println("Enter the number of the dice you do not want to keep (ex: 123 for dice 1, 2, and 3)");
                System.out.println("To skip all rolls press '9'");
                int change = in.nextInt();
                if(change != 9){
                 game.dice2(change);

                    run.P0();
                    System.out.println("Enter the number of the dice you do not want to keep (ex: 123 for dice 1, 2, and 3)");
                    System.out.println("To skip all rolls press '9'");
                    
                    change = in.nextInt();
                    if(change!= 9){
                    game.dice2(change);
                    }
                }
                
                run.P0();
                System.out.println(game);
                run.P0();
                System.out.println("What do you pick? ex: 'ones', 'full house'");
                in.nextLine();
                String inp = in.nextLine();
                if(inp.toUpperCase().equals("MANUAL")){
                    System.out.println("User, you picked manual dice enter!");
                    System.out.print("Dice 1: ");
                    int won = in.nextInt();
                    System.out.print("Dice 2: ");
                    int to = in.nextInt();
                    System.out.print("Dice 3: ");
                    int thre = in.nextInt();
                    System.out.print("Dice 4: ");
                    int fo = in.nextInt();
                    System.out.print("Dice 5: ");
                    int pive = in.nextInt();
                    game.setDice(won, to, thre, fo, pive);
                    in.nextLine();
                    System.out.println("What do you pick? ex: 'ones'");
                    inp = in.nextLine();
                }
                if(inp.toUpperCase().equals("YAHTZEE BONUS")){
                    System.out.println("What category would you like to enter 0 for?");
                    String inpc = in.nextLine();
                    game.YB(inpc);
                }
                else{
                    run.P0();
                    game.Game(inp);
                }
                
                    
                
                game.setScore();
                game.total();
                System.out.println("Press enter for next turn");
                String clr = in.nextLine();
                run.clear();
                
            }
            game.setC();
            
            
        }
        
        System.out.println("The winner is: ");
        game.getWinner();
        
        
    }
    
}