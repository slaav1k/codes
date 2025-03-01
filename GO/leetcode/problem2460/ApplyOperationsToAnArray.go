package problem2460

import "fmt"

func moveZeroes(nums []int) {
	for i, zeros := 0, 0; i < len(nums); i++ {
		if nums[i] != 0 {
			nums[i], nums[zeros] = nums[zeros], nums[i]
			zeros++
		}
	}
}

func applyOperations(nums []int) []int {
	n := len(nums)
	for i := 0; i < n-1; i++ {
		if nums[i] == nums[i+1] {
			nums[i] *= 2
			nums[i+1] = 0
		}
	}
	moveZeroes(nums)
	return nums
}

func Runner() {
	fmt.Println(applyOperations([]int{1, 2, 3, 4}))
	fmt.Println(applyOperations([]int{1, 2, 2, 1, 1, 0}))
	fmt.Println(applyOperations([]int{0, 1}))
}
