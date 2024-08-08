class Solution {
    public long solution(long n) {
        int cnt = 0; //자릿수를 세는
        long ret = 0; //자릿수를 붙여 반환할 변수
        long tmp = n; //나누면서 while 문에 사용될 수
        
        while(tmp>0){ //자릿수를 센다.
            tmp /= 10;
            cnt++;
        }
        
        int arr[] = new int[cnt];
        System.out.println("x length : "+arr.length);
        
        cnt = 0; // arr에 할당
        while(n>0){
            arr[cnt++] = (int)(n%10);
            n /= 10;
        }
        
        //정렬 
        for(int i=0; i<cnt; i++){
            for(int j=i+1; j<cnt; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        //자릿수 붙여서 반환
        for(int i=0; i<arr.length; i++){
            // ret += arr[i]*cnt;
            // cnt--;
            
            ret = ret*10 + arr[i];
        }
        
        return ret;
    }
}