
import java.util.HashMap;


class Solution {
    public static int solution(int[] A) {
        HashMap<Integer,Integer> table=new HashMap<>();
        for(int i:A){
            if(!table.containsKey(i)){
                table.put(i, 1);
            }else{
                table.replace(i, table.get(i)+1);
            }
        }
        while(true){
            if(table.get(0)<2){
                break;
            }
            int index=1;
            while(table.containsKey(index)){
                index++;
            }
            for(int i=0;i<index;i++){
                if(table.get(i)==0){
                    table.remove(i);
                }else{
                    table.replace(i, table.get(i)-1);
                }  
            }
            if(table.get(0)==1){
                    table.remove(0);
                }else{
                    table.replace(0, table.get(0)-1);
                }
            
            if(table.containsKey(index)){
                table.put(index, table.get(index)+1);
            }else{
                table.put(index, 1);
            }  
        }
        
        
        while(true){
            boolean check=false;
            for(int i:table.keySet()){
                if(table.get(i)>1){
                    check=true;
                    int tmp=i;
                    if(table.containsKey(tmp+1)){
                        table.replace(tmp+1, table.get(tmp+1)+1);
                    }else{
                        table.put(tmp+1, 1);
                    }
                    table.replace(i, table.get(i)-2);
                }
                
            }
            
            if(check==false) break;
        }
        int result=0;
        for(int i:table.keySet()){
            if(table.get(i)!=0){
                result++;
            }
            
        }
        
        return result;
    }
}