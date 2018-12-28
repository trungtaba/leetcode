//https://leetcode.com/problems/palindromic-substrings/

/**
 * @param {string} s
 * @return {number}
 */
var countSubstrings = function(s) {
	const N= s.length;
	let result = 0;
	for( let center=0;center<(2*N-1);center++){
		left = center / 2
        right = left + center % 2
        while (left >= 0 && right < N && s.charAt(left) == s.charAt(right)){
			result += 1;
            left -= 1;
            right += 1;
		}            
	}

        
    return result;
};


