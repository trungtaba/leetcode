import java.util.Hashtable;

class Solution {
    public int repeatedNTimes(int[] A) {
        Hashtable<Integer,Integer> table=new Hashtable<>();
        for(int i:A){
            if(table.containsKey(i)){
                table.replace(i, table.get(i)+1 );
            }else{
                table.put(i, 1);
            }
        }

        for(int i:table.keySet()){
            if(table.get(i)*2==A.length){
                return i;
            }
        }
        return -1;
    }
}