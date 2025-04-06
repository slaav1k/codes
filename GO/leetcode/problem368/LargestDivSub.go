package problem368

import (
	"fmt"
	"sort"
)

func largestDivisibleSubset(nums []int) []int {
	if len(nums) == 0 {
		return []int{}
	}

	sort.Ints(nums)
	p := make([][]int, len(nums))
	maxIndex := 0

	for i := range nums {
		p[i] = []int{nums[i]}
		for j := 0; j < i; j++ {
			if nums[i]%nums[j] == 0 && len(p[j])+1 > len(p[i]) {
				p[i] = append([]int{}, p[j]...)
				p[i] = append(p[i], nums[i])
			}
		}
		if len(p[i]) > len(p[maxIndex]) {
			maxIndex = i
		}
	}

	return p[maxIndex]
}

func Runner() {
	fmt.Println(largestDivisibleSubset([]int{1, 2, 3}))
	fmt.Println(largestDivisibleSubset([]int{1, 2, 4, 8}))
}
