package test;


import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * creates permutations of a String and return them in alphabetical order
 */
public class StringPermutation {
    public NavigableSet<String> computePermutations(String s){
        NavigableSet<String> result=new TreeSet<String>();
        if(s.isEmpty()){
            return result;
        }
        result.add(s);
        if(s.length()==2){
            String s1=s.substring(1,2);
            String s2=s.substring(0, 1);
            result.add(s1+s2);
        }else{
            char firstChar=s.charAt(0);
            String workString=s.substring(1);
            NavigableSet<String> workSet=computePermutations(workString);
            for(String work:workSet){
                result.add(firstChar+work);
                result.add(work+firstChar);
                for(int i=1;i<work.length();i++){
                    String occurence=work.substring(0,i)+firstChar+work.substring(i);
                    result.add(occurence);
                }
            }
        }
        return result;
    }
}
