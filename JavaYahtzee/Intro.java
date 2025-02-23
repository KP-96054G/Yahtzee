public class Intro {
    private int p;
    public Intro(int p){
        this.p = p;
    }
    
    public void P0(){
        System.out.println("");
    }
    
    public void P1(){
        System.out.println("Enter player one name");
    }
    
    public void P2(){
        System.out.println("Enter player two name");
    }
    
    public void P3(){
        System.out.println("Enter player three name");
    }
    
    public void P4(){
        System.out.println("Enter player four name");
    }
    
    public void clear(){
        System.out.print("\033[H\033[2J");
    }
    
    public void turns(int i){
        System.out.println("         ------------");
        System.out.println("         |  Turn: "+ i +" |");
        System.out.println("         ------------");
    }
    
    public void Player(String p){
        System.out.println();
        String pl = "";
        for(int i = 0; i < p.length() + 6; i++){
            pl += "-";
        }
        
        System.out.println("         ----" + pl + "---");
        System.out.println("         |   " + p + " turn!  |");
        System.out.println("         ----" + pl + "---");
    }
    
    public void Winner(String p, int pts){
        System.out.println();
        String pl = "";
        String pl2 = "";
        String ptsS = String.valueOf(pts);
        for(int i = 0; i < p.length() + ptsS.length() + 2; i++){
            pl += "*";
            pl2 += " ";
        }
        System.out.println("         ****" + pl + "****");
        System.out.println("         |   " + pl2 + "   |");
        System.out.println("         |   " + p + ": " + pts + "   |");
        System.out.println("         |   " + pl2 + "   |");
        System.out.println("         ****" + pl + "****");
        
    }
    
    
}