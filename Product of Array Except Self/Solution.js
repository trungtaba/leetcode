/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    let length=nums.length;
    result=[];
    forward=[];
    forward.push(nums[0]);
    for(let i=1;i<nums.length-1;i++){
        let tmp=forward[i-1]*nums[i];
        forward.push(tmp);
    }
    console.log(forward);
    backword=[];
    backword.push(nums[nums.length-1]);
    for(let i=nums.length-2;i>0;i--){
        let tmp=backword[backword.length-1]*nums[i];
        backword.push(tmp);
    }
    console.log(backword);
    //backword.reverse();
    result.push(backword[length-2]);
    let i=0;
    let j=length-3;
    while(i<length-2){
        console.log(`${forward[i]} ${backword[j]}`);
        let tmp=forward[i]*backword[j];
        i++;
        j--;
        result.push(tmp);
    }
    result.push(forward[length-2]);
    return result;
};

console.log(productExceptSelf([2,3,4,5]));

