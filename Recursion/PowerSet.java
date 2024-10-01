package Recursion;

import java.util.ArrayList;

public class PowerSet {
    static void powerset(String s,String curr,int i,ArrayList<String> list)
    {
        if(s.length()==i){
            list.add(curr);
            return;
        }
        powerset(s, curr, i+1,list); 
        powerset(s, curr+s.charAt(i),i+1,list);;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        powerset("abc", "", 0,list);
        System.out.println("PowerSet"+ list);
    }
}
