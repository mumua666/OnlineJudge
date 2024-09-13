function twoSum(nums: number[], target: number): number[] {
    let size = nums.length;
    let curSum = 0;
    for (let i = 0, j = 0; i < size && j <= size;) {
        if (curSum == target) {
            return [i, j - 1];
        } else if (curSum < target) {
            curSum += nums[j++];
        } else if (curSum > target) {
            curSum -= nums[i++];
        }
    }
    return []
};

console.log(twoSum([2, 7, 11, 15], 9));
console.log(twoSum([3, 2, 4], 6));
console.log(twoSum([3, 3], 6));