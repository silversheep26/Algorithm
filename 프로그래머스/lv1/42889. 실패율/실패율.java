import java.util.*;

class Solution {
	public int[] solution(int N, int[] stages) {
		int[] arrN = new int[N]; 
		int[] stayN = new int[N]; 
		double[] fRate = new double[N]; 
		int[] answer = new int[N];
		Map map = new HashMap();
		for(int i = 0 ; i < N ; i++){
			arrN[i] = 0;
			stayN[i] = 0;
			for(int j = 0 ; j < stages.length ; j++){
				if(stages[j] >= i+1) arrN[i]++;
				if(stages[j] == i+1) stayN[i]++;
			}
			if(arrN[i] == 0){
				map.put(i,0.0);
				fRate[i] = 0.0;
			}
			else{
				map.put(i,(double)stayN[i] / (double)arrN[i]);
				fRate[i] = (double)stayN[i] / (double)arrN[i];
			}
		}

		Arrays.sort(fRate);
		for(int i = fRate.length-1; i >= 0  ; i--)
		{
			for(int j = 0 ; j < map.size() ; j++)
			{
				if(fRate[i] == (double)map.get(j))
				{
					answer[Math.abs(i-(fRate.length-1))] = j+1;
					map.replace(j,-1.0);
					break;
				}
			}
		}
		return answer;
	}
}
