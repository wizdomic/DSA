class Solution {
    public int[] twoSum(int[] nums, int target) {
        //taking hashmap
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            //calculating compliment
            int compliment = target-nums[i];
            //if compliment present then return the current number and compliment 
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            //otherwise update the number
            map.put(nums[i],i);
        }
        //return if no combination found
        return new int[]{};
    }
}