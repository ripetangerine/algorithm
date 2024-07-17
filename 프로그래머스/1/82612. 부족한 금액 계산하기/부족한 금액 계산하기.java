class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int first_price = price;
        long max_money = 0;
        
        for (int i = 0; i<count; i++) {
            max_money += price;
            price += first_price;
        }
        
        long final_money = money - max_money;
        if (final_money > 0) {
            return 0;
        }
        else {
            return final_money*-1;
        }
    }
}