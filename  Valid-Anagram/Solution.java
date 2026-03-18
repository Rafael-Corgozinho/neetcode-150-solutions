import java.util.HashMap;
import java.util.Map;



class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        
        Map<Character,Integer> frequency = new HashMap<>();
        Map<Character,Integer> frequency2 = new HashMap<>();

        for(char i : s.toCharArray()){
          frequency.put( i, frequency.getOrDefault(i,0)+1);
        }

         for(char j : t.toCharArray()){
          frequency2.put(j, frequency2.getOrDefault(j, 0)+1);
        } 
        System.out.println(frequency);
        System.out.println(frequency2);

        if(frequency2.keySet().equals(frequency.keySet())){
           return true;
        }  
         return false;
    }
}


