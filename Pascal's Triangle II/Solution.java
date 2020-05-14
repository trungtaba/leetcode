//https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/3234/

import java.util.ArrayList;
import java.util.List;

class Solution {
	public List<Integer> getRow(int numRows) {
		List<Integer> result = new ArrayList<>();
		if (numRows < 0)
			return result;
		result.add(1);
		for (int i = 0; i <= numRows; i++) {
			for (int j = result.size() - 2; j >=0; j--) {
				result.set(j + 1, result.get(j) + result.get(j + 1));
			}
			result.add(1);
			for(int k=0;k<=result.size()-1;k++){
				System.out.print(result.get(k)+" ");
			}
			System.out.println();

		}
		return result;
	}

	public static void main(String[] args) {
		Solution s =new Solution();
		s.getRow(3);
	}
}