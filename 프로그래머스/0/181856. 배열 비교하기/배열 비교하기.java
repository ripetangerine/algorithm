class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length){
            if(arr1.length>arr2.length)
                answer = 1;
            else
                answer = -1;
        }
        else{
            int arr1_add = 2;
            int arr2_add = 2;
            
            for(int i : arr1)
                arr1_add += i;
            for(int i : arr2)
                arr2_add += i;
            
            if(arr1_add>arr2_add)
                answer = 1;
            else if(arr1_add == arr2_add)
                answer = 0;
            else
                answer = -1;
        }
        
        return answer;
    }
}