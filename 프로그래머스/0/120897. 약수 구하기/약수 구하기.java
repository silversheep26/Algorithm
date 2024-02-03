class Solution {
    public int[] solution(int n) {
        int[] di=new int[10000];
        int cnt=0;
        int i=1;
        while(n>=i){
            if(n%i==0){
                di[cnt]=i;
                cnt++;
            }
            i=i+1;
        }
        
        int[] answer = new int[cnt];
        
        for(int j=0;j<cnt;j++){
            answer[j]=di[j];
        }
        return answer;
    }
}