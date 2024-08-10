package main

import "fmt"

func main() {
	nums := []int{3, 3}
	target := 6
	result := twoSum(nums, target)
	fmt.Println(result)
}

func twoSum(nums []int, target int) []int {
	hasher := make(map[int]int)

	for idx, num := range nums {
		if val, ok := hasher[num]; ok {
			return []int{val, idx}
		}
		hasher[target-num] = idx
	}

	return nil

}
