import java.util.ArrayList;

public class Score {
    public Score(){
        
    }
    
    public int getOnes(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 1){
            s++;
        }
        if(two == 1){
            s++;
        }
        if(three == 1){
            s++;
        }
        if(four == 1){
            s++;
        }
        if(five == 1){
            s++;
        }
        
        if(s == 0){
            return 00;
        }
        return s;
    }
    
    public int getTwos(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 2){
            s+= 2;
            }
            if(two == 2){
                s+= 2;
                }
                if(three == 2){
                    s+= 2;
                    }
                    if(four == 2){
                        s+= 2;
                        }
                        if(five == 2){
                            s+= 2;
                            }
                            if(s == 0){
                            return 00;
                            }   
                            return s;
                            }
    
    public int getThrees(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 3){
            s += 3;
            }
            if(two == 3){
                s += 3;
                }
                if(three == 3){
                    s += 3;
                    }
                    if(four == 3){
                        s += 3;
                        }
                        if(five == 3){
                            s += 3;
                            }
                            if(s == 0){
                            return 00;
                            }
                            return s;
                            }
    
    public int getFours(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 4){
            s += 4;
            }
            if(two == 4){
                s += 4;
                }
                if(three == 4){
                    s += 4;
                    }
                    if(four == 4){
                        s += 4;
                        }
                        if(five == 4){
                            s += 4;
                            }
                            if(s == 0){
                            return 00;
                            }
                            return s;
                            }
    
    public int getFives(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 5){
            s += 5;
            }
            if(two == 5){
                s += 5;
                }
                if(three == 5){
                    s += 5;
                    }
                    if(four == 5){
                        s += 5;
                        }
                        if(five == 5){
                            s += 5;
                            }
                            if(s == 0){
                            return 00;
                            }
                            return s;
                            }
    
    public int getSixes(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == 6){
            s += 6;
            }
            if(two == 6){
                s += 6;
                }
                if(three == 6){
                    s += 6;
                    }
                    if(four == 6){
                        s += 6;
                        }
                        if(five == 6){
                            s += 6;
                            }
                            if(s == 0){
                            return 00;
                            }
                            return s;
                            }
                            
    public int Chance(int one, int two, int three, int four, int five){
        int s = 0;
        s = one + two + three + four + five;
        if(s == 0){
            return 00;
        }
        return s;
    }
    
    public int Yahtzee(int one, int two, int three, int four, int five){
        int s = 0;
        if(one == two && two == three && three == four && four == five){
            s = 50;
        }
        if(s == 0){
            return 00;
        }
        return s;
    }
    
    public int LS(int one, int two, int three, int four, int five){
        int s = 0;
        String str = String.valueOf(one + "" + two + "" + three + "" + four + "" + five);
        if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5")){
            s = 40;
        }
        else if(str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6")){
            s = 40;
        }
        if(s == 0){
            return 00;
        }
        return s;
    }
    
    public int SS(int one, int two, int three, int four, int five){
        int s = 0;
        String str = String.valueOf(one + "" + two + "" + three + "" + four + "" + five);
        if(str.contains("1") && str.contains("2") && str.contains("3") && str.contains("4")){
            s = 30;   
        }
        else if(str.contains("2") && str.contains("3") && str.contains("4") && str.contains("5")){
            s = 30;
        }
        else if(str.contains("3") && str.contains("4") && str.contains("5") && str.contains("6")){
            s = 30;
        }
        if(s == 0){
            return 00;
        }
        return s;
    }
    
    public int fourK(int one, int two, int three, int four, int five){
        int s = 0;
        int c = 0;
        int h = 0;
        ArrayList<Integer> dile = new ArrayList<Integer>();
        dile.add(one);
        dile.add(two);
        dile.add(three);
        dile.add(four);
        dile.add(five);
        
        if(dile.get(0) == dile.get(2) || dile.get(2) == dile.get(4) || dile.get(0) == dile.get(4)){
            if(dile.get(0) == dile.get(2)){
                c = dile.get(2);
            }
            if(dile.get(2) == dile.get(4)){
                c = dile.get(4);
            }
            if(dile.get(0) == dile.get(4)){
                c = dile.get(0);
            }
            for(int i = 0; i < dile.size(); i++){
                if(dile.get(i) == c){
                    h++;
                }
            }
        }
        else{
            return 00;
        }
        
        if(h >= 4){
            s = one + two + three + four + five;
            return s;
        }
        else{
            return 00;
        }
        
        
    }
    
    public int threeK(int one, int two, int three, int four, int five){
        int s = 0;
        int c = 0;
        int h = 0;
        ArrayList<Integer> dile = new ArrayList<Integer>();
        dile.add(one);
        dile.add(two);
        dile.add(three);
        dile.add(four);
        dile.add(five);
        if(dile.get(0) == dile.get(2) || dile.get(2) == dile.get(4) || dile.get(0) == dile.get(4) || dile.get(1) == dile.get(0) || dile.get(1) == dile.get(4) || dile.get(1) == dile.get(2)){
            if(dile.get(0) == dile.get(2)){
                c = dile.get(2);
                }
                if(dile.get(2) == dile.get(4)){
                    c = dile.get(4);
                    }
                    if(dile.get(0) == dile.get(4)){
                        c = dile.get(0);
                        }
                        else if(dile.get(0) == dile.get(1)){
                            c = dile.get(1);
                        }
                        else if(dile.get(1) == dile.get(4)){
                            c = dile.get(4);
                        }
                        else if(dile.get(1) == dile.get(2)){
                            c = dile.get(2);
                        }
                        
                        for(int i = 0; i < dile.size(); i++){
                            if(dile.get(i) == c){
                                h++;
                                
                                }
                                }
                                }
                                else{
                                    return 00;
                                    }
                                    if(h >= 3){
                                        s = one + two + three + four + five;
                                        return s;
                                        }
                                        else{
                                            return 00;
                                            }
                                            }
                                            
                                        
        public int FH(int one, int two, int three, int four, int five){
            int s = 0;
            int c = 0;
            int h = 0;
            ArrayList<Integer> dile = new ArrayList<Integer>();
            dile.add(one);
            dile.add(two);
            dile.add(three);
            dile.add(four);
            dile.add(five);
            if(dile.get(0) == dile.get(2) || dile.get(2) == dile.get(4) || dile.get(0) == dile.get(4) || dile.get(1) == dile.get(0) || dile.get(1) == dile.get(4) || dile.get(1) == dile.get(2))
            {
                if(dile.get(0) == dile.get(2)){
                    c = dile.get(2);
                    }
                    if(dile.get(2) == dile.get(4)){
                        c = dile.get(4);
                        }
                        if(dile.get(0) == dile.get(4)){
                            c = dile.get(0);
                            }
                            else if(dile.get(0) == dile.get(1)){
                                c = dile.get(1);
                                }
                                else if(dile.get(1) == dile.get(4)){
                                    c = dile.get(4);
                                    }
                                    else if(dile.get(1) == dile.get(2)){
                                        c = dile.get(2);
                                        }
                                        for(int i = 0; i < dile.size(); i++){
                                            if(dile.get(i) == c){
                                                h++;
                                                dile.remove(i);
                                                i--;
                                                }
                                                }
                                                }
                                                else{
                                                    return 00;
                                                    }
                                                    if(h >= 3){
                                                        int l = dile.get(0);
                                                        int q = 0;
                                                        for(int k = 0; k < dile.size(); k++){
                                                            if(dile.get(k) == l){
                                                                q++;
                                                            }
                                                        }
                                                        if(q >= 2){
                                                            return 25;
                                                        }
                                                        }
                                        
                                                        else{
                                                            c = dile.get(0);
                                                            h = 0;
                                                            dile.clear();
                                                            dile.add(one);
                                                            dile.add(two);
                                                            dile.add(three);
                                                            dile.add(four);
                                                            dile.add(five);
                                                            for(int i = 0; i < dile.size(); i++){
                                                                if(dile.get(i) == c){
                                                                    h++;
                                                                    
                                                                }
                                                            }
                                                            if(h >= 3){
                                                                return 25;
                                                            }
                                                            }
                                                            return 00;
                                                            }
                                                            
    
    
    
    
    
    
}