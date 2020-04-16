package main;

import java.util.Arrays;

public class KthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		System.out.println(Arrays.toString(solution(array, commands)));
	}
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer;
        int length = commands.length;
        answer = new int[length];
        
        for (int n = 0; n < length; n++) {
            int i = commands[n][0];
            int j = commands[n][1];
            int k = commands[n][2];
            int[] sub = new int[j - i + 1];
            
            System.arraycopy(array, i-1, sub, 0, j-i+1);
            
            Arrays.parallelSort(sub);
            
            answer[n] = sub[k-1];
        }
        
        return answer;
    }

}
