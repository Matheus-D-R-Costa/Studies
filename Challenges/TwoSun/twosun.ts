const array = [3, 2, 4]
console.log(twoSun(array, 6))

function twoSun(nums: number[], target: number): number[]  {
  const hasher: { [key: number]: number } = {};

  for (let idx = 0; idx < nums.length; idx++) {
    const i = nums[idx]
    if (hasher[i] !== undefined) {
      return [hasher[i], idx]
    }

    hasher[target - 1] = idx

  }

  return [];

}