import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer[] = Arrays.copyOf(arr,arr.length);
        int cont = 0;
        
        while(true){
            
            for(int i=0; i<arr.length; i++){
            
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]/=2;
                }
                else if(arr[i]<50 && arr[i]%2==1){
                    arr[i] = arr[i]*2+1;  
                }
            }      
            
        // 두 배열의 내용물이 같은 지 조사
            if(Arrays.equals(arr,answer)) {
                break;
            }
            
            answer = Arrays.copyOf(arr,arr.length);
            
            
            
            cont ++;
            
            
        }

        return cont;
    }
}