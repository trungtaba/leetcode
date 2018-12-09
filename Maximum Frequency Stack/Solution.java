import java.util.HashMap;
import java.util.Stack;

//https://leetcode.com/problems/maximum-frequency-stack/



class FreqStack {
    HashMap<Integer,Integer> frequency=new HashMap<>();
    HashMap<Integer, Stack<Integer> >m=new HashMap<>();
    int max=0;
    
    public void push(int x) {
        int tmp=frequency.getOrDefault(x,0)+1;
        frequency.put(x,tmp) ;
        max=Math.max(max, tmp);
        
        if(!m.containsKey(tmp)){
            m.put(tmp, new Stack<>());
        }
        m.get(tmp).add(x);
    }
    
    public int pop() {
        int x=m.get(max).pop();
        frequency.put(x, max-1);
        if(m.get(max).size()==0){
            max--;
        }
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 */