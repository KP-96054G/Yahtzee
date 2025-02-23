import java.util.ArrayList;
public class Scorecard {
    
    
    
    
   
    private int change1;
    private int change2;
    private int change3;
    private int change4;
    
    private int  p;    
    private int c;
    private String p1;
    private String p2;
    private String p3;
    private String p4;
    
    private ArrayList<Boolean> oneAL = new ArrayList<Boolean>();
    private ArrayList<Boolean> twoAL = new ArrayList<Boolean>();
    private ArrayList<Boolean> threeAL = new ArrayList<Boolean>();
    private ArrayList<Boolean> fourAL = new ArrayList<Boolean>();
    private Integer oneS[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private Integer twoS[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private Integer threeS[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private Integer fourS[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int cnt;
    
    private int pnt1;
    private int pnt2;
    private int pnt3;
    private int pnt4;
    
    public Scorecard(int p, String p1, String p2, String p3, String p4){
        
        this.p = p;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        cnt = 1;
        c = 1;
        for(int i = 0; i < 13; i++){
            oneAL.add(false);
            twoAL.add(false);
            threeAL.add(false);
            fourAL.add(false);
        }
    }
    
    public String Turn(){
        Intro run = new Intro(4);
        if(c == 1){
            c++;
            run.Player(p1);
            return "";
        }
        if(c == 2){
            run.Player(p2);
            c++;
            return "";
        }
        if(c == 3){
            run.Player(p3);
            c++;
            return "";
        }
        if(c == 4){
            run.Player(p4);
            c++;
            return "";
        }
        return "error";
    }
    
    public void setC(){
        c = 1;
    }
    
    public void dice1(){
        Dice roll = new Dice();
        one = roll.rollDie();
        two = roll.rollDie();
        three = roll.rollDie();
        four = roll.rollDie();
        five = roll.rollDie();
        System.out.println("Your dice rolls are:");
        roll.printDice(one, two, three, four, five);
    }
    
    public void dice2(int change){
        Dice roll = new Dice();
        String ns = String.valueOf(change);
        System.out.println("You removed: " + ns);
        if(ns.contains("1")){
            one = roll.rollDie();
            //one = 0;
        }
        if(ns.contains("2")){
            two = roll.rollDie();
            //two = 0;
        }
        if(ns.contains("3")){
            three = roll.rollDie();
            //three = 0;
        }
        if(ns.contains("4")){
            four = roll.rollDie();
            //four = 0;
        }
        if(ns.contains("5")){
            five = roll.rollDie();
            //five = 0;
        }
        if(cnt == 1){
            System.out.println("Your new numbers are: ");
            cnt++;
        }
        else if(cnt == 2){
            System.out.println("Your final numbers are: ");
            cnt = 1;
        }
        else{
            System.out.println("error!");
        }
        roll.printDice(one, two, three, four, five);
        

    }
    
    public void Game(String in){
        Score hi = new Score();
        if(in.toUpperCase().equals("ONES")){
            if(c==5 && fourAL.get(0) == false){
                fourAL.set(0, true);
                System.out.println(p4 + " you picked Ones!");
                fourS[0] = hi.getOnes(one, two, three, four, five);
                System.out.println("You got " + fourS[0] + " points");
                //return "yeah";
            }
            else if(c == 2 && oneAL.get(0) == false){
                oneAL.set(0, true);
                System.out.println(p1 + " you picked Ones!");
                oneS[0] = hi.getOnes(one, two, three, four, five);
                System.out.println("You got " + oneS[0] + " points");
                //return "yeah";
            }
            else if(c == 3 && twoAL.get(0) == false){
                twoAL.set(0, true);
                System.out.println(p2 + " you picked Ones!");
                twoS[0] = hi.getOnes(one, two, three, four, five);
                System.out.println("You got " + twoS[0] + " points");
            }
            else if(c == 4 && threeAL.get(0) == false){
                threeAL.set(0, false);
                System.out.println(p3 + " you picked Ones!");
                threeS[0] = hi.getOnes(one, two, three, four, five);
                System.out.println("You got " + threeS[0] + " points");
            }
        }
            
        else if(in.toUpperCase().equals("TWOS")){
                if(c==5 && fourAL.get(1) == false){
                    fourAL.set(1, true);
                    System.out.println(p4 + " you picked Twos!");
                    fourS[1] = hi.getTwos(one, two, three, four, five);
                    System.out.println("You got " + fourS[1] + " points");
                    //return "yeah";
                    }
                    else if(c == 2 && oneAL.get(1) == false){
                        oneAL.set(1, true);
                        System.out.println(p1 + " you picked Twos!");
                        oneS[1] = hi.getTwos(one, two, three, four, five);
                        System.out.println("You got " + oneS[1] + " points");
                        //return "yeah";
                        }
                        else if(c == 3 && twoAL.get(1) == false){
                            twoAL.set(1, true);
                            System.out.println(p2 + " you picked Twos!");
                            twoS[1] = hi.getTwos(one, two, three, four, five);
                            System.out.println("You got " + twoS[1] + " points");
                            }
                            else if(c == 4 && threeAL.get(1) == false){
                                threeAL.set(1, false);
                                System.out.println(p3 + " you picked Twos!");
                                threeS[1] = hi.getTwos(one, two, three, four, five);
                                System.out.println("You got " + threeS[1] + " points");
                                }
        }
            
            else if(in.toUpperCase().equals("THREES")){
                if(c==5 && fourAL.get(2) == false){
                    fourAL.set(2, true);
                    System.out.println(p4 + " you picked Threes!");
                    fourS[2] = hi.getThrees(one, two, three, four, five);
                    System.out.println("You got " + fourS[2] + " points");
                    //return "yeah";
                    }
                    else if(c == 2 && oneAL.get(2) == false){
                        oneAL.set(2, true);
                        System.out.println(p1 + " you picked Threes!");
                        oneS[2] = hi.getThrees(one, two, three, four, five);
                        System.out.println("You got " + oneS[2] + " points");
                        //return "yeah";
                        }
                        else if(c == 3 && twoAL.get(2) == false){
                            twoAL.set(2, true);
                            System.out.println(p2 + " you picked Threes!");
                            twoS[2] = hi.getThrees(one, two, three, four, five);
                            System.out.println("You got " + twoS[2] + " points");
                            }
                            else if(c == 4 && threeAL.get(2) == false){
                                threeAL.set(2, false);
                                System.out.println(p3 + " you picked Threes!");
                                threeS[2] = hi.getThrees(one, two, three, four, five);
                                System.out.println("You got " + threeS[2] + " points");
                                }
            }
            else if(in.toUpperCase().equals("FOURS")){
                if(c==5 && fourAL.get(3) == false){
                    fourAL.set(3, true);
                    System.out.println(p4 + " you picked Fours!");
                    fourS[3] = hi.getFours(one, two, three, four, five);
                    System.out.println("You got " + fourS[3] + " points");
                    //return "yeah";
                    }
                    else if(c == 2 && oneAL.get(3) == false){
                        oneAL.set(3, true);
                        System.out.println(p1 + " you picked Fours!");
                        oneS[3] = hi.getFours(one, two, three, four, five);
                        System.out.println("You got " + oneS[3] + " points");
                        //return "yeah";
                        }
                        else if(c == 3 && twoAL.get(3) == false){
                            twoAL.set(3, true);
                            System.out.println(p2 + " you picked Fours!");
                            twoS[3] = hi.getFours(one, two, three, four, five);
                            System.out.println("You got " + twoS[3] + " points");
                            }
                            else if(c == 4 && threeAL.get(3) == false){
                                threeAL.set(3, false);
                                System.out.println(p3 + " you picked Fours!");
                                threeS[3] = hi.getFours(one, two, three, four, five);
                                System.out.println("You got " + threeS[3] + " points");
                                }
            }
            else if(in.toUpperCase().equals("FIVES")){
                if(c==5 && fourAL.get(4) == false){
                    fourAL.set(4, true);
                    System.out.println(p4 + " you picked Fives!");
                    fourS[4] = hi.getFives(one, two, three, four, five);
                    System.out.println("You got " + fourS[4] + " points");
                    //return "yeah";
                    }
                    else if(c == 2 && oneAL.get(4) == false){
                        oneAL.set(4, true);
                        System.out.println(p1 + " you picked Fives!");
                        oneS[4] = hi.getFives(one, two, three, four, five);
                        System.out.println("You got " + oneS[4] + " points");
                        //return "yeah";
                        }
                        else if(c == 3 && twoAL.get(4) == false){
                            twoAL.set(4, true);
                            System.out.println(p2 + " you picked Fives!");
                            twoS[4] = hi.getFives(one, two, three, four, five);
                            System.out.println("You got " + twoS[4] + " points");
                            }
                            else if(c == 4 && threeAL.get(5) == false){
                                threeAL.set(4, false);
                                System.out.println(p3 + " you picked Fives!");
                                threeS[4] = hi.getFives(one, two, three, four, five);
                                System.out.println("You got " + threeS[4] + " points"); 
                                }
            }
            else if(in.toUpperCase().equals("SIXES")){
                if(c==5 && fourAL.get(5) == false){
                    fourAL.set(5, true);
                    System.out.println(p4 + " you picked Sixes!");
                    fourS[5] = hi.getSixes(one, two, three, four, five);
                    System.out.println("You got " + fourS[5] + " points");
                    //return "yeah";
                    }
                    else if(c == 2 && oneAL.get(5) == false){
                        oneAL.set(5, true);
                        System.out.println(p1 + " you picked Sixes!");
                        oneS[5] = hi.getSixes(one, two, three, four, five);
                        System.out.println("You got " + oneS[5] + " points");
                        //return "yeah";
                        }
                        else if(c == 3 && twoAL.get(5) == false){
                            twoAL.set(5, true);
                            System.out.println(p2 + " you picked Sixes!");
                            twoS[5] = hi.getSixes(one, two, three, four, five);
                            System.out.println("You got " + twoS[5] + " points");
                            }
                            else if(c == 4 && threeAL.get(5) == false){
                                threeAL.set(5, false);
                                System.out.println(p3 + " you picked Sixes!");
                                threeS[5] = hi.getSixes(one, two, three, four, five);
                                System.out.println("You got " + threeS[5] + " points");
                                }
            
           
            
             
        
            //return "error on check";
    
            }
            else if(in.toUpperCase().equals("CHANCE")){
                if(c == 5 && fourAL.get(6) == false){
                    fourAL.set(6, true);
                    System.out.println(p4 + " you picked Chance");
                    fourS[6] = hi.Chance(one, two, three, four, five);
                    System.out.println("You got " + fourS[6] + " points!");
                }
                
                if(c == 2 && oneAL.get(6) == false){
                    oneAL.set(6, true);
                    System.out.println(p1 + " you picked Chance");
                    oneS[6] = hi.Chance(one, two, three, four, five);
                    System.out.println("You got " + oneS[6] + " points!");
                    }
                
                if(c == 3 && twoAL.get(6) == false){
                    twoAL.set(6, true);
                    System.out.println(p2 + " you picked Chance");
                    twoS[6] = hi.Chance(one, two, three, four, five);
                    System.out.println("You got " + twoS[6] + " points!");
                    }
                
                if(c == 4 && threeAL.get(6) == false){
                    threeAL.set(6, false);
                    System.out.println(p3 + " you picked Chance");
                    threeS[6] = hi.Chance(one, two, three, four, five);
                    System.out.println("You got " + threeS[6] + " points!");
                    }
            }
            else if(in.toUpperCase().equals("YAHTZEE")){
                if(c == 5 && fourAL.get(7) == false){
                    fourAL.set(7, true);
                    System.out.println(p4 + " you picked Yahtzee");
                    fourS[7] = hi.Yahtzee(one, two, three, four, five);
                    System.out.println("You got " + fourS[7] + " points!");
                    }
                else if(c == 2 && oneAL.get(7) == false){
                    oneAL.set(7, true);
                    System.out.println(p1 + " you picked Yahtzee");
                    oneS[7] = hi.Yahtzee(one, two, three, four, five);
                    System.out.println("You got " + oneS[7] + " points!");
                    }
                
                else if(c == 3 && twoAL.get(7) == false){
                    twoAL.set(7, true);
                    System.out.println(p2 + " you picked Yahtzee");
                    twoS[7] = hi.Yahtzee(one, two, three, four, five);
                    System.out.println("You got " + twoS[7] + " points!");
                    }
                
                else if(c == 4 && fourAL.get(7) == false){
                    threeAL.set(7, true);
                    System.out.println(p3 + " you picked Yahtzee");
                    threeS[7] = hi.Yahtzee(one, two, three, four, five);
                    System.out.println("You got " + threeS[7] + " points!");
                    }
            }
            
            else if(in.toUpperCase().equals("LARGE STRAIGHT")){
                if(c == 5 && fourAL.get(8) == false){
                    fourAL.set(8, true);
                    System.out.println(p4 + " you picked Large Straight");
                    fourS[8] = hi.LS(one, two, three, four, five);
                    System.out.println("You got " + fourS[8] + " points!");
                    }
                else if(c == 2 && oneAL.get(8) == false){
                    oneAL.set(8, true);
                    System.out.println(p1 + " you picked Large Straight");
                    oneS[8] = hi.LS(one, two, three, four, five);
                    System.out.println("You got " + oneS[8] + " points!");
                    }
                
                else if(c == 3 && twoAL.get(8) == false){
                    twoAL.set(8, true);
                    System.out.println(p2 + " you picked Large Straight");
                    twoS[8] = hi.LS(one, two, three, four, five);
                    System.out.println("You got " + twoS[8] + " points!");
                    }
                
                else if(c == 4 && threeAL.get(8) == false){
                    threeAL.set(8, true);
                    System.out.println(p3 + " you picked Large Straight");
                    threeS[8] = hi.LS(one, two, three, four, five);
                    System.out.println("You got " + threeS[8] + " points!");
                    }
            }
            else if(in.toUpperCase().equals("SMALL STRAIGHT")){
                if(c == 5 && fourAL.get(9) == false){
                    fourAL.set(9, true);
                    System.out.println(p4 + " you picked Small Straight");
                    fourS[9] = hi.SS(one, two, three, four, five);
                    System.out.println("You got " + fourS[9] + " points!");
                    }
                else if(c == 2 && oneAL.get(9) == false){
                    oneAL.set(9, true);
                    System.out.println(p1 + " you picked Small Straight");
                    oneS[9] = hi.SS(one, two, three, four, five);
                    System.out.println("You got " + oneS[9] + " points!");
                    }
                
                else if(c == 3 && twoAL.get(9) == false){
                    twoAL.set(9, true);
                    System.out.println(p2 + " you picked Small Straight");
                    twoS[9] = hi.SS(one, two, three, four, five);
                    System.out.println("You got " + twoS[9] + " points!");
                    }
                
                else if(c == 4 && threeAL.get(9) == false){
                    threeAL.set(9, true);
                    System.out.println(p3 + " you picked Small Straight");
                    threeS[9] = hi.SS(one, two, three, four, five);
                    System.out.println("You got " + threeS[9] + " points!");
                    }
            }
            else if(in.toUpperCase().equals("THREE OF A KIND")){
                if(c == 5 && fourAL.get(10) == false){
                    fourAL.set(10, true);
                    System.out.println(p4 + " you picked Three of a kind!");
                    fourS[10] = hi.threeK(one, two, three, four, five);
                    System.out.println("You got " + fourS[10] + " points!");
                    }
                else if(c == 4 && threeAL.get(10) == false){
                    threeAL.set(10, true);
                    System.out.println(p3 + " you picked Three of a kind!");
                    threeS[10] = hi.threeK(one, two, three, four, five);
                    System.out.println("You got " + threeS[10] + " points!");
                    }
                else if(c == 2 && oneAL.get(10) == false){
                    oneAL.set(10, true);
                    System.out.println(p1 + " you picked Three of a kind!");
                    oneS[10] = hi.threeK(one, two, three, four, five);
                    System.out.println("You got " + oneS[10] + " points!");
                    }
                else if(c == 3 && twoAL.get(10) == false){
                    twoAL.set(10, true);
                    System.out.println(p2 + " you picked Three of a kind!");
                    twoS[10] = hi.threeK(one, two, three, four, five);
                    System.out.println("You got " + twoS[10] + " points!");
                    }
                
            }
            else if(in.toUpperCase().equals("FOUR OF A KIND")){
                if(c == 5 && fourAL.get(11) == false){
                    fourAL.set(11, true);
                    System.out.println(p4 + " you picked Four of a kind!");
                    fourS[11] = hi.fourK(one, two, three, four, five);
                    System.out.println("You got " + fourS[11] + " points!");
                    }
                else if(c == 2 && oneAL.get(11) == false){
                    oneAL.set(11, true);
                    System.out.println(p1 + " you picked Four of a kind!");
                    oneS[11] = hi.fourK(one, two, three, four, five);
                    System.out.println("You got " + oneS[11] + " points!");
                    }
                else if(c == 3 && twoAL.get(11) == false){
                    twoAL.set(11, true);
                    System.out.println(p2 + " you picked Four of a kind!");
                    twoS[11] = hi.fourK(one, two, three, four, five);
                    System.out.println("You got " + twoS[11] + " points!");
                    }
                else if(c == 4 && threeAL.get(11) == false){
                    threeAL.set(11, true);
                    System.out.println(p3 + " you picked Four of a kind!");
                    threeS[11] = hi.fourK(one, two, three, four, five);
                    System.out.println("You got " + threeS[11] + " points!");
                    }                    
            }
            else if(in.toUpperCase().equals("FULL HOUSE")){
                if(c == 5 && fourAL.get(12) == false){
                    fourAL.set(12, true);
                    System.out.println(p4 + " you picked Full House!");
                    fourS[12] = hi.FH(one, two, three, four, five);
                    System.out.println("You got " + fourS[12] + " points!");
                    }
                else if(c == 2 && oneAL.get(12) == false){
                    oneAL.set(12, true);
                    System.out.println(p1 + " you picked Full House!");
                    oneS[12] = hi.FH(one, two, three, four, five);
                    System.out.println("You got " + oneS[12] + " points!");
                    }
                else if(c == 3 && twoAL.get(12) == false){
                    twoAL.set(12, true);
                    System.out.println(p2 + " you picked Full House!");
                    twoS[12] = hi.FH(one, two, three, four, five);
                    System.out.println("You got " + twoS[12] + " points!");
                    }
                else if(c == 4 && threeAL.get(12) == false){
                    threeAL.set(12, true);
                    System.out.println(p3 + " you picked Full House!");
                    threeS[12] = hi.FH(one, two, three, four, five);
                    System.out.println("You got " + threeS[12] + " points!");
                    }
            }
            
            else{
                System.out.println("Invalid");
            }
    }
            public void total(){
            if(c == 2){
                System.out.println("Your total is now: " + pnt1);
            }
            else if(c == 3){
                System.out.println("Your total is now: " + pnt2);
            }
            else if(c == 4){
                System.out.println("Your total is now: " + pnt3);
            }
            else{
                System.out.println("Your total is now: " +  pnt4);
            }
            }
    
    
    public void addC(){
        c++;
    }
    
    
    
    public void YB(String inp){
        Score hi = new Score();
        if(inp.toUpperCase().equals("ONES")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[0] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[0] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[0] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[0] = null;
            }
        }
        if(inp.toUpperCase().equals("TWOS")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[1] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[1] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[1] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[1] = null;
            }
        }
            if(inp.toUpperCase().equals("THREES")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[2] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[2] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[2] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[2] = null;
            }
        }
        if(inp.toUpperCase().equals("FOURS")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[3] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[3] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[3] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[3] = null;
            }
        }
        if(inp.toUpperCase().equals("FIVES")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[4] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[4] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[4] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[4] = null;
            }
        }
        if(inp.toUpperCase().equals("SIXES")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[5] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[5] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[5] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[5] = null;
            }
        }
        if(inp.toUpperCase().equals("CHANCE")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[6] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[6] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[6] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[6] = null;
            }
        }
        if(inp.toUpperCase().equals("LARGE STRAIGHT")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[8] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[8] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[8] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[8] = null;
            }
        }
        if(inp.toUpperCase().equals("SMALL STRAIGHT")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[9] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[9] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[9] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[9] = null;
            }
        }
        if(inp.toUpperCase().equals("THREE OF A KIND")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[10] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[10] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[10] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[10] = null;
            }
        }
        if(inp.toUpperCase().equals("FOUR OF A KIND")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[11] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[11] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[11] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[11] = null;
            }
        }
        if(inp.toUpperCase().equals("FULL HOUSE")){
            if(c == 2 && oneAL.get(7) == true){
                System.out.println(p1 + " you choose Yahtzee Bonus!");
                change1 = pnt1;
                pnt1 += 2 * hi.Yahtzee(one, two, three, four, five);
                change1 = pnt1 - change1;
                System.out.println("You got " + change1 + " points!");
                oneS[12] = null;
            }
            if(c == 3 && twoAL.get(7) == true){
                System.out.println(p2 + " you choose Yahtzee Bonus!");
                change2 = pnt2;
                pnt2 += 2 * hi.Yahtzee(one, two, three, four, five);
                change2 = pnt2 - change2;
                System.out.println("You got " + change2 + " points!");
                twoS[12] = null;
            }
            if(c == 4 && threeAL.get(7) == true){
                System.out.println(p3 + " you choose Yahtzee Bonus!");
                change3 = pnt3;
                pnt3 += 2 * hi.Yahtzee(one, two, three, four, five);
                change3 = pnt3 - change3;
                System.out.println("You got " + change3 + " points!");
                threeS[12] = null;
            }
            if(c == 5 && fourAL.get(7) == true){
                System.out.println(p4 + " you choose Yahtzee Bonus!");
                change4 = pnt4;
                pnt4 += 2 * hi.Yahtzee(one, two, three, four, five);
                change4 = pnt4 - change4;
                System.out.println("You got " + change4 + " points!");
                fourS[12] = null;
            }
        }
        
    }
    
    public void setScore(){
        pnt1 = 0;
        pnt2 = 0;
        pnt3 = 0;
        pnt4 = 0;
        for(int i = 0; i < 13; i++){
            if(oneS[i] != null){
                pnt1 += oneS[i];
            }
            if(twoS[i] != null){
                pnt2 += twoS[i];
            }
            if(threeS[i] != null){
                pnt3 += threeS[i];
            }
            if(fourS[i] != null){
                
                pnt4 += fourS[i];
            }
        }
        pnt1 += change1;
        pnt2 += change2;
        pnt3 += change3;
        pnt4 += change4;
    }
    
    public void getWinner(){
        Intro run = new Intro(4);
        if(pnt1 > pnt2 && pnt1 > pnt3 && pnt1 > pnt4){
            run.Winner(p1, pnt1);
        }
        if(pnt2 > pnt1 && pnt2 > pnt3 && pnt2 > pnt4){
            run.Winner(p2, pnt2);
        }
        if(pnt3 > pnt2 && pnt3 > pnt1 && pnt4 > pnt4){
            run.Winner(p2, pnt2);
        }
        if(pnt4 > pnt2 && pnt4 > pnt3 && pnt4 > pnt1){
            run.Winner(p4, pnt4);
        }
    }
    
    public void setDice(int one, int two, int three, int four, int five){
        cnt = 2;
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }
    
    public void setNull(){
        for(int i = 0; i < oneAL.size(); i++){
            if(oneS[i] != null){
            if(oneAL.get(i) == true && oneS[i] == 0){
                oneS[i] = null;
            }
        }
        }
        
        for(int i = 0; i < twoAL.size(); i++){
            if(twoS[i] != null){
            if(twoAL.get(i) == true && twoS[i] == 0){
                twoS[i] = null;
            }
            }
        }
        
        for(int i = 0; i < threeAL.size(); i++){
            if(threeS[i] != null){
            if(threeAL.get(i) == true && threeS[i] == 0){
                threeS[i] = null;
            }
            }
        }
        
        for(int i = 0; i < fourAL.size(); i++){
            if(fourS[i] != null){
            if(fourAL.get(i) == true && fourS[i] == 0){
                fourS[i] = null;
            }
            }
        }
    }
    
    public String toString(){
        
        
        
        if(c == 2){
            return " Ones: " + oneS[0] + "\n " + "Twos: " + oneS[1] + "\n " + "Threes: " + oneS[2] + "\n " + "Fours: " + oneS[3] + "\n " + "Fives: " + oneS[4] + "\n " + "Sixes: " + oneS[5] + "\n " + "Chance: " + oneS[6] + "\n Small Straight: " + oneS[9] + "\n Large Straight: " + oneS[8] + "\n Three of a kind: " + oneS[10] + "\n Four of a kind: " + oneS[11] + "\n Full House: " + oneS[12] + "\n " + "Yahtzee: " + oneS[7] + "\n Total Points: " + pnt1;
        }
        if(c == 3 ){
            return " Ones: " + twoS[0] + "\n Twos: " + twoS[1] + "\n Threes: " + twoS[2] + "\n Fours: " + twoS[3] + "\n Fives: " + twoS[4] + "\n Sixes: " + twoS[5] + "\n " + "Chance: " + twoS[6] + "\n Small Straight: " + twoS[9] + "\n Large Straight: " + twoS[8] + "\n Three of a kind: " + twoS[10] + "\n Four of a kind: " + twoS[11] + "\n Full House: " + twoS[12] + "\n " + "Yahtzee: " + twoS[7] + "\n Total Points: " + pnt2;
        }
        if(c == 4){
            return " Ones: " + threeS[0] + "\n Twos: " + threeS[1] + "\n Threes: " + threeS[2] + "\n Fours: " + threeS[3] + "\n Fives: " + threeS[4] + "\n Sixes: " + threeS[5] + "\n " + "Chance: " + threeS[6] + "\n Small Straight: " + threeS[9] + "\n Large Straight: " +  threeS[8] + "\n Three of a kind: " + threeS[10] + "\n Four of a kind: " + threeS[11] + "\n Full House: " + twoS[12] + "\n " + "Yahtzee: " + threeS[7] + "\n Total Points: " + pnt3;
        }
        if(c == 5){
            return " Ones: " + fourS[0] + "\n Twos: " + fourS[1] + "\n Threes: " + fourS[2] + "\n Fours: " + fourS[3] + "\n Fives: " + fourS[4] + "\n Sixes: " + fourS[5] + "\n " + "Chance: " + fourS[6] + "\n Small Straight: " + fourS[9] + "\n Large Straight: " + fourS[8] + "\n Three of a kind: " + fourS[10] + "\n Four of a kind: " + fourS[11] + "\n Full House: " + threeS[12] + "\n " + "Yahtzee: " + fourS[7] + "\n Total Points: " + pnt4;
        }
        else{
            return "nah";
        }
    }
    
}