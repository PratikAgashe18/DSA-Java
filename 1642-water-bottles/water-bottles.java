class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles=numBottles;
        int empty=numBottles;
        while(empty>=numExchange){
            int newBottles=empty / numExchange;
            int remainingBottles=empty % numExchange;
            totalBottles +=newBottles;
            empty=newBottles + remainingBottles;

        }
        
        return totalBottles;
        
    }
}