/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(A) {
    let a=0;
    let b=A.length-1;
    let max=0;
    let leftmax=0;
    let rightmax=0;
    while(a<=b){
        leftmax=Math.max(leftmax,A[a]);
        rightmax=Math.max(rightmax,A[b]);
        if(leftmax<rightmax){
            max+=(leftmax-A[a]);       // leftmax is smaller than rightmax, so the (leftmax-A[a]) water can be stored
            a++;
        }
        else{
            max+=(rightmax-A[b]);
            b--;
        }
    }
    return max;
};
