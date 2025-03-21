package problem724

import "fmt"

func pivotIndex(nums []int) int {
	totalSum := 0
	for _, num := range nums {
		totalSum += num
	}

	leftSum := 0
	for i, num := range nums {
		if leftSum == totalSum-leftSum-num {
			return i
		}
		leftSum += num
	}
	return -1
}

func pivotIndex_first(nums []int) int {
	n := len(nums)
	for i := 0; i < n; i++ {
		l := sum(nums[:i])
		r := sum(nums[i+1:])
		if l == r {
			return i
		}
		if i == 0 && r == 0 {
			return 0
		}
		if i == n-1 && l == 0 {
			return n - 1
		}
	}
	return -1
}

func sum(nums []int) int {
	s := 0
	for i := 0; i < len(nums); i++ {
		s += nums[i]
	}
	return s
}

func Runner() {
	fmt.Println(pivotIndex([]int{1, 7, 3, 6, 5, 6}))
	fmt.Println(pivotIndex([]int{1, 2, 3}))
	fmt.Println(pivotIndex([]int{2, 1, -1}))
}
