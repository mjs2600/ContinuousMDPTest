public class ContinuousMDPNextStateQuery {
  
    double loc;
    int testMode;
    
    public ContinuousMDPNextStateQuery() {
        loc = 0;
    }
    
    public double[] resultOfAction(int i) {
        
        double[] update = new double[2];
        
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
    