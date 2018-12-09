//https://leetcode.com/problems/daily-temperatures/
/*
T = [73, 	74, 	75, 71, 69, 72, 76, 73]
	[1, 	1, 		4, 	2, 	1, 	1, 	0, 	0]
*/

/**
 * @param {number[]} T
 * @return {number[]}
 */
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var dailyTemperatures = function (temperatures) {
    let stack = new Array(temperatures.length);
    let top = -1;
    let ret = new Array(temperatures.length).fill(0);;
    for(let i = 0; i < temperatures.length; i++) {
        while(top > -1 && temperatures[i] > temperatures[stack[top]]) {
            let idx = stack[top--];
            ret[idx] = i - idx;
        }
        stack[++top] = i;
    }
    return ret;
};