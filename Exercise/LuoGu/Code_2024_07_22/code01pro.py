from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        size = len(nums)
        for i in range(size):
            for j in range(i+1, size):
                if nums[i] + nums[j] == target:
                    return [i, j]


Solution().twoSum([3, 2, 3], 6)


def twoSum(nums, target):
    hash_table = {}

    for i in range(len(nums)):
        complement = target - nums[i]

        if complement in hash_table:
            return [hash_table[complement], i]

        hash_table[nums[i]] = i  # 将元素和它的索引存入哈希表中

    return []


print(twoSum([3, 3], 6))
