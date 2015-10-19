import java.util.Random;

public class ContinuousMDPNextStateQuery {
  
    double loc;
    int testMode;
    Random rand;
    
    public ContinuousMDPNextStateQuery() {
        loc = 0;
        rand = new Random();
    }
    
    public double[] resultOfAction(int i) {
        
        double[] update = new double[2];
        double movement = 0;
        
        switch (testMode) {
            
            case 1: loc += 0.1;
                    if (loc >= 1) loc = 0;
                    update[0] = loc;
                    update[1] = i;
                    
                    if ((loc >= 0.0) && (loc <= 0.3) && (i == 1)) update[1] = 9;
                    if ((loc >= 0.5) && (loc <= 0.8) && (i == 2)) update[1] = 17;
                    break;
                    
            case 2: loc += 0.05;
                    if (loc >= 1) loc = 0;
                    update[0] = loc;
                    update[1] = 2*i;
                    
                    if ((loc >= 0.4) && (loc <= 0.6) && (i == 6)) update[1] = 100;
                    if ((loc >= 0.7) && (loc <= 0.85) && (i == 9)) update[1] = 100;
                    break;

            case 3: loc += .01;
                    if (loc >= 1) loc = 0;
                    update[0] = loc;
                    update[1] = -2*i;
                    
                    if ((loc >= .03) && (loc <= .07) && (i == 7)) update[1] = 100;
                    if ((loc >= .08) && (loc <= .12) && (i == 5)) update[1] = 55;
                    break;

            case 4: loc += .001;
                    if (loc >= 1) loc = 0;
                    update[0] = loc;
                    update[1] = -i*.1;
                    
                    if ((loc >= .45) && (loc <= .75) && (i == 50)) update[1] = 100;
                    if ((loc >= .85) && (loc <= .95) && (i == 76)) update[1] = 100;
                    break;

            case 5: if (loc >= 1) loc = 0;
                    movement = 0.1 + rand.nextGaussian()*.05;
                
                    loc += movement;
                    loc = Math.min(Math.max(0,loc),1);           
                    
                    update[0] = loc;
                    if (loc == 1) update[1] = 100;
                    else update[1] = -1;
                    
                    break;
                    
            case 6: if (loc >= 1) loc = 0;
                    if ((loc >= 0) && (loc < 0.5) && (i==0)) movement = 0.2 + rand.nextGaussian()*.05;
                    if ((loc >= 0) && (loc < 0.5) && (i==1)) movement = -0.1 + rand.nextGaussian()*.05;
                    if ((loc >= 0.5) && (i==0)) movement = -.1 + rand.nextGaussian()*.05;
                    if ((loc >= 0.5) && (i==1)) movement = 0.2 + rand.nextGaussian()*.05;
                
                    loc += movement;
                    loc = Math.min(Math.max(0,loc),1);           
                    
                    update[0] = loc;
                    if (loc == 1) update[1] = 100;
                    else update[1] = -1;
                    
                    break;
                    
            case 7: if (loc >= 1) loc = 0;
                    if ((loc >= 0) && (loc < 0.2) && (i==0)) movement = 0.15 + rand.nextGaussian()*.01;
                    if ((loc >= 0) && (loc < 0.2) && (i==1)) movement = 0.3 + rand.nextGaussian()*.01;
                    if ((loc >= 0.2) && (loc < 0.4) && (i==0)) movement = -.5 + rand.nextGaussian()*.01;
                    if ((loc >= 0.2) && (loc < 0.4) && (i==1)) movement = -.5 + rand.nextGaussian()*.01;
                    if ((loc >= 0.4) && (loc < 0.6) && (i==0)) movement = 0.15 + rand.nextGaussian()*.01;
                    if ((loc >= 0.4) && (loc < 0.6) && (i==1)) movement = 0.3 + rand.nextGaussian()*.01;
                    if ((loc >= 0.6) && (loc < 0.8) && (i==0)) movement = -.5 + rand.nextGaussian()*.01;
                    if ((loc >= 0.6) && (loc < 0.8) && (i==1)) movement = -.5 + rand.nextGaussian()*.01;
                    if ((loc >= 0.8) && (i==0)) movement = 0.15 + rand.nextGaussian()*.01;
                    if ((loc >= 0.8) && (i==1)) movement = 0.3 + rand.nextGaussian()*.01;
                
                    loc += movement;
                    loc = Math.min(Math.max(0,loc),1);           
                    
                    update[0] = loc;
                    if (loc == 1) update[1] = 100;
                    else update[1] = -1;
                    
                    break;
        }
                    
        return update;
    }
    
    public void startOver() {
        loc = 0;
    }
    
    public void setTestMode(int i) {
        testMode = i;
    }
    
    
}
    