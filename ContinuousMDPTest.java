import org.junit.Test;
import static org.junit.Assert.*;

public class ContinuousMDPTest {

    @Test
    public void test1() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;

        actions = 5;
        cmdpq.startOver();
        cmdpq.setTestMode(1);

        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.1);
        endTime = System.currentTimeMillis();
        assertEquals(1, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.6);
        endTime = System.currentTimeMillis();
        assertEquals(2, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.9);
        endTime = System.currentTimeMillis();
        assertEquals(4, bestAct);
        System.out.println("Case 3 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }


    @Test
    public void test2() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 12;
        cmdpq.startOver();
        cmdpq.setTestMode(2);

        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.1);
        endTime = System.currentTimeMillis();
        assertEquals(11, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.5);
        endTime = System.currentTimeMillis();
        assertEquals(6, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.75);
        endTime = System.currentTimeMillis();
        assertEquals(9, bestAct);
        System.out.println("Case 3 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }


    @Test
    public void test3() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 8;
        cmdpq.startOver();
        cmdpq.setTestMode(3);

        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.2);
        endTime = System.currentTimeMillis();
        assertEquals(0, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.04);
        endTime = System.currentTimeMillis();
        assertEquals(7, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.09);
        endTime = System.currentTimeMillis();
        assertEquals(5, bestAct);
        System.out.println("Case 3 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }


    @Test
    public void test4() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 100;
        cmdpq.startOver();
        cmdpq.setTestMode(4);

        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.23);
        endTime = System.currentTimeMillis();
        assertEquals(0, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.54);
        endTime = System.currentTimeMillis();
        assertEquals(50, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.89);
        endTime = System.currentTimeMillis();
        assertEquals(76, bestAct);
        System.out.println("Case 3 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }

    @Test
    public void test5() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 1;
        cmdpq.startOver();
        cmdpq.setTestMode(5);

        System.out.println("Udacity Test Case #1");
        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.5);
        endTime = System.currentTimeMillis();
        assertEquals(0, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
    }

    @Test
    public void test6() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 2;
        cmdpq.startOver();
        cmdpq.setTestMode(6);

        System.out.println("Udacity Test Case #2");
        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.25);
        endTime = System.currentTimeMillis();
        assertEquals(0, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.75);
        endTime = System.currentTimeMillis();
        assertEquals(1, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }

    @Test
    public void test7() throws Exception {

        ContinuousMDPNextStateQuery cmdpq = new ContinuousMDPNextStateQuery();
        ContinuousMDP cmdp;
        int actions;
        int bestAct;

        long startTime;
        long endTime;
        actions = 2;
        cmdpq.startOver();
        cmdpq.setTestMode(7);

        System.out.println("Udacity Test Case #3");
        startTime = System.currentTimeMillis();
        cmdp = new ContinuousMDP(actions, cmdpq);
        endTime = System.currentTimeMillis();
        System.out.println("Constructor Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.15);
        endTime = System.currentTimeMillis();
        assertEquals(1, bestAct);
        System.out.println("Case 1 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.4);
        endTime = System.currentTimeMillis();
        assertEquals(0, bestAct);
        System.out.println("Case 2 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");

        startTime = System.currentTimeMillis();
        bestAct = cmdp.optimalPolicyAt(0.8);
        endTime = System.currentTimeMillis();
        assertEquals(1, bestAct);
        System.out.println("Case 3 Execution Speed = " + ((endTime - startTime) / 1000) + " seconds");
        System.out.println("Test case passed!");
    }
}
