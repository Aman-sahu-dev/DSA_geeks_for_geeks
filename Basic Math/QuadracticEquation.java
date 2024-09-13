import java.util.ArrayList;

public class QuadracticEquation {
    public  static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> result = new ArrayList<>();
        double d = (b*b) - (4*a*c);
        if(d<0) {
            result.add(-1);
            return result;
        }
        double res1 = (-b + Math.sqrt(d))/(2*a);
        double res2 = (-b - Math.sqrt(d))/(2*a);

        int r1 = (int) Math.floor(res1);
        int r2 = (int) Math.floor(res2);
        
        if(r1>r2){
            result.add(r1);
            result.add(r2);
            
        }else{
            result.add(r2);
            result.add(r1);
        }
        return result;
    }
    public static void main(String[] args) {
        for(int num : quadraticRoots(1,-2,1)){
            System.out.println(num);
        }
    }
}
