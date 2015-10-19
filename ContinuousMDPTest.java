import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ContinuousMDPTest {
    
    public ContinuousMDPTest() {
    }
    
    public static void main(String[] args) {

        int testNum  = Integer.parseInt(args[0]);
        
        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;
        
        long startTime;
        long endTime;
                
        switch (testNum) {
            case 1: actions = 5;
                    cmdpq.startOver();
                    cmdpq.setTestMode(1);
                    
                    startTime = System.currentTimeMillis();
                    cmdp = new ContinuousMDP(actions, cmdpq);
                    endTime = System.currentTimeMillis();
                    System.out.println("Constructor Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.1);
                    endTime = System.currentTimeMillis();
                    assertEquals(1,bestAct);
                    System.out.println("Case 1 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.6);
                    endTime = System.currentTimeMillis();
                    assertEquals(2,bestAct);
                    System.out.println("Case 2 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                                        
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.9);
                    endTime = System.currentTimeMillis();
                    assertEquals(4,bestAct);
                    System.out.println("Case 3 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    System.out.println("Test case passed!");
                    break;
                    
           case 2:  actions = 12;
                    cmdpq.startOver();
                    cmdpq.setTestMode(2);

                    startTime = System.currentTimeMillis();
                    cmdp = new ContinuousMDP(actions, cmdpq);
                    endTime = System.currentTimeMillis();
                    System.out.println("Constructor Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.1);
                    endTime = System.currentTimeMillis();
                    assertEquals(11, bestAct);
                    System.out.println("Case 1 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.5);
                    endTime = System.currentTimeMillis();
                    assertEquals(6, bestAct);
                    System.out.println("Case 2 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.75);
                    endTime = System.currentTimeMillis();
                    assertEquals(9, bestAct);
                    System.out.println("Case 3 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    System.out.println("Test case passed!");
                    break;

           case 3:  actions = 8;
                    cmdpq.startOver();
                    cmdpq.setTestMode(3);

                    startTime = System.currentTimeMillis();
                    cmdp = new ContinuousMDP(actions, cmdpq);
                    endTime = System.currentTimeMillis();
                    System.out.println("Constructor Execution Speed = " + ((endTime-startTime)/1000) + " seconds");

                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.2);
                    endTime = System.currentTimeMillis();
                    assertEquals(0, bestAct);
                    System.out.println("Case 1 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.04);
                    endTime = System.currentTimeMillis();
                    assertEquals(7, bestAct);
                    System.out.println("Case 2 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    
                    startTime = System.currentTimeMillis();
                    bestAct = cmdp.optimalPolicyAt(0.09);
                    endTime = System.currentTimeMillis();
                    assertEquals(5, bestAct);
                    System.out.println("Case 3 Execution Speed = " + ((endTime-startTime)/1000) + " seconds");
                    System.out.println("Test case passed!");
                    break;
        }
                    
                    
           
        
        
        

        
        
    }
}