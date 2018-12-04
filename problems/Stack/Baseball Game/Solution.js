//https://leetcode.com/problems/baseball-game/submissions/
/**
 * @param {string[]} ops
 * @return {number}
 */
var calPoints = function(ops) {
    let storage=[]

    let sum=0;
    for(let i=0;i<ops.length;i++){
        let val=0;

        if (ops[i] == '+') {
			if(storage.length > 1) {
				val = storage[storage.length - 1] + storage[storage.length - 2]; 
			} 
		} else if(ops[i] == 'D') {
			if(storage.length !== 0) {
				val = storage[storage.length - 1] * 2;
			}
		} else if(ops[i] == 'C') {
			if(storage.length !== 0) {
				val = -1 * storage[storage.length - 1];
				storage.pop();
				sum += val;
				continue;
			}
		} else {
			val = parseInt(ops[i]);
		}
		storage.push(val);
		sum += val;
    }
    return sum;
};