package LeetCodeProblems;

public class FindTheClosestPerson {

    public int findClosest(int x,int y,int z){
        int d1 = Math.abs(x - z);
        int d2 = Math.abs(y - z);
        if(d1 == d2)
            return 0;
        return d1 < d2 ? 1 : 2;
    }
    public static void main(String[] args){
        int x = 1, y = 5, z = 3;
        FindTheClosestPerson sol = new FindTheClosestPerson();
        int result = sol.findClosest(x,y,z);
        System.out.println(result);
    }
}