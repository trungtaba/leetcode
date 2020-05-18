import java.util.Stack;

//https://leetcode.com/problems/min-stack/
class Element {
    public int min;
    public int value;
    public Element next;

    public Element(int min, int value) {
        this.min = min;
        this.value = value;
    }
}
class MinStack {
    Element top;
    public MinStack() {
    }
    
    public void push(int x) {
        if(top==null)
            top=new Element(x, x);
        else{
            Element e=new Element(Math.min(top.min, x), x);
            e.next=top;
            top=e;
        }
    }
    
    public void pop() {
        top=top.next;
    }
    
    public int top() {
        return top.value;
    }
    
    public int getMin() {
        return top.min;
    }
}