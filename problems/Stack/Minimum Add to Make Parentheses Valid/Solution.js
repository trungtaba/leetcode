//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
/*
Input: "()))(("
Output: 4
*/

/**
 * @param {string} S
 * @return {number}
 */
var minAddToMakeValid = function (S) {
    let stack = 0
    let count=0;
    for(let i=0;i<S.length;i++){
        let c=S.charAt(i);
        if(c==='('){
            stack++;
        }else{
            if(stack===0){
                count++;
            }else{
                stack--;
            }
        }
    }
    return count+stack;
};