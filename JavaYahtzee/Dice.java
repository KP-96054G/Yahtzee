import java.util.ArrayList;
public class Dice {
    private ArrayList<Integer> pd = new ArrayList<Integer>();
    public Dice(){
        
    }
    
    public int rollDie(){
        return (int)(Math.random() * 6 + 1);
    }
    
    public void printDice(int one, int two, int three, int four, int five){
        int c = 0;
        pd.add(one);
        pd.add(two);
        pd.add(three);
        pd.add(four);
        pd.add(five);
        for(int i = 0; i < pd.size(); i++){
            if(pd.get(i).equals(1)){
                c++;
                System.out.println("       -------");
                System.out.println("       |     |");
                System.out.println("Dice: " + c   +  "|  o  |");
                System.out.println("       |     |");
                System.out.println("       -------");
            }
            if(pd.get(i).equals(2)){
                c++;
                System.out.println("       -------");
                System.out.println("       |o    |");
                System.out.println("Dice: " + c   +  "|     |");
                System.out.println("       |    o|");
                System.out.println("       -------");
            }
            if(pd.get(i).equals(3)){
                c++;
                System.out.println("       -------");
                System.out.println("       |    o|");
                System.out.println("Dice: " + c  +   "|  o  |");
                System.out.println("       |o    |");
                System.out.println("       -------");
            }
            if(pd.get(i).equals(4)){
                c++;
                System.out.println("       -------");
                System.out.println("       |o   o|");
                System.out.println("Dice: " + c   +  "|     |");
                System.out.println("       |o   o|");
                System.out.println("       -------");
            }
            if(pd.get(i).equals(5)){
                c++;
                System.out.println("       -------");
                System.out.println("       |o   o|");
                System.out.println("Dice: " + c   +  "|  o  |");
                System.out.println("       |o   o|");
                System.out.println("       -------");
            }
            if(pd.get(i).equals(6)){
                c++;
                System.out.println("       -------");
                System.out.println("       |o   o|");
                System.out.println("Dice: " + c   +  "|o   o|");
                System.out.println("       |o   o|");
                System.out.println("       -------");
            }
        }
    }
}