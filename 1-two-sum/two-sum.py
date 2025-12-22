class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pairIndex = {}
        for i,num in enumerate(nums):
            if target - num in pairIndex:
                return [i,pairIndex[target - num]]
            pairIndex[num]=i
        return []