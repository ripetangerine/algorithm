class Solution {
    public int solution(int balls, int share) {
        return combin(balls,share);
    }
    public static int combin(int balls, int share){
        if(balls==share || share==0) return 1;
        return combin(balls-1,share-1) + combin(balls-1,share);
    }
}