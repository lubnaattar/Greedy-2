// Time: O(N)
// space: O(N) 
// Fill the candies arrays with minimum criteria = 1
// traverse array once comparing with left values if greater than add candies[x-1] + 1
// traverse array once comparing with right values if greater than add candies[x+1] + 1


class Solution {
    public int candy(int[] ratings) {
        
        int candies[] = new int[ratings.length];
        Arrays.fill(candies, 1);
        
        for(int i = 1; i < ratings.length; i++){
            if(ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1; 
            }
        }
        
        for(int i = ratings.length - 2; i >= 0; i--){
            if(ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i + 1] + 1); 
            }
        }
        
        int output = 0;
        for(int x : candies){
            output = output + x;
        }
        
        return output;
    }
}
