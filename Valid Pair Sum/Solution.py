from bisect import bisect_left as lower_bound 

def findNumOfPair(a, n): 
    # code here
    a = sorted(a) 
    result = 0
    for i in range(n): 
        if (a[i] <= 0): 
            continue
        j = lower_bound(a,-a[i] + 1) 
        result += i - j 
    return result 