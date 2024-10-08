package Recursion;

import java.util.ArrayList;
import java.util.HashMap;

public class PossibleWordsFromPhoneDigits {
    static ArrayList <String> possibleWords(int a[], int N)
    {
        ArrayList<String> res = new ArrayList<>();
        
        if(N == 0)
        return res;
        
        HashMap<Integer , String> map = new HashMap<>();
        
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
        
        backtrack(a, 0, map, new StringBuilder(), res);
        return res;
    }
    
    
     private static void backtrack(int a[], int i, HashMap<Integer, String> map, 
     StringBuilder sb, ArrayList<String> res){
         
         if(sb.length() == a.length)  
         {
             res.add(sb.toString());
             return;
         }
         
         String currEle = map.get(a[i]);
         
         for(int j = 0; j<currEle.length() ; j++){     
             
             sb.append(currEle.charAt(j));
             backtrack(a , i+1 , map , sb , res);
             sb.deleteCharAt(sb.length()-1);
         }
     }
    public static void main(String[] args) {
        int[] a = {2,3,4};
        System.out.println(possibleWords(a, a.length));
    }
}
