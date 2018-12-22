//https://leetcode.com/problems/4sum-ii/

/**
 * @param {number[]} A
 * @param {number[]} B
 * @param {number[]} C
 * @param {number[]} D
 * @return {number}
 */
var fourSumCount = function(A, B, C, D) {
    let count=0;
    const length=A.length
    let sum=new Map()

    for(let i=0;i<length;i++){
        for(let j=0;j<length;j++){
            const tmp=A[i]+B[j];
            if(sum.get(tmp)!== undefined ){
                sum.set(tmp,sum.get(tmp)+1);
            }else{
                sum.set(tmp,1)
            }
        }
    };
    for(let i=0;i<length;i++){
        for(let j=0;j<length;j++){
            const tmp= -(C[i]+D[j]);
            if(sum.get(tmp)!== undefined){
                count+=sum.get(tmp);
            }
        }
    }
    return count;

};