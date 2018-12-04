import java.io.Console;
import java.util.Hashtable;

//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        Hashtable<Character,Integer> table=new Hashtable<>();

        for( char c: S.toCharArray()){
            if(!table.containsKey(c) ){
                table.put(c, 1);
                //System.out.println("put "+c+" to table");
            }else{
                table.replace(c, table.get(c)+1 );
                //System.out.println("update"+c+" to "+table.get(c));
            }
        }

        for(char c:J.toCharArray()){
            //System.out.println("c="+c);
            if(table.containsKey(c)){
                //System.out.println("c="+c);
                count+=table.get(c);
            }
        }
        return count;
    }
}