/*
 * Test JUnit
 */
package JunitThijs;

/**
 *
 * @author Thijs
 */

public class MyAgileTest {
    public int add(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        return int1 + int2;
    }
    
}

class InfiniteLoop{
    static int loop(int one){
        while (one==1){
            one = 1;
        }
        return 2;
    }

    static int Loop(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
