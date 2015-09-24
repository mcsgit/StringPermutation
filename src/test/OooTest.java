package test;

import java.util.Set;

import static org.junit.Assert.*;

public class OooTest {

    @org.junit.Test
    public void testComputePermutations() throws Exception {
        String s="hat";
        Ooo t=new Ooo();
        Set<String> result=t.computePermutations(s);
        assertTrue(result.size()==6);
        for(String x:result){
            System.out.print(x+",");
        }
        System.out.println();
        result=t.computePermutations("abc");
        assertTrue(result.size() == 6);
        for(String x:result){
            System.out.print(x+",");
        }
        System.out.println();
        result=t.computePermutations("Zu6");
        assertTrue(result.size() == 6);
        for(String x:result){
            System.out.print(x+",");
        }
    }
}