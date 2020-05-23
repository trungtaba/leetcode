class Solution
{
    String smallestK(long n)
    {
        if (n >= 0 && n <= 9) { 
            return n+""; 
        }
        Stack<Integer> digits = new Stack<>(); 
        for (int i = 9; i >= 2 && n > 1; i--) { 
            while (n % i == 0) { 
                digits.push(i); 
                n = n / i; 
            } 
        }  
        if (n != 1) { 
            return "-1"; 
        } 
        String result="";
        while (!digits.empty()) { 
            result+=digits.pop();
        } 
        return result;
    }
}