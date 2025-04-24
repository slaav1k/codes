package problem2799

import "fmt"

func countCompleteSubarrays(nums []int) int {
	need := countUniqueElements(nums)
	n := len(nums)
	subs := make(map[int]int)
	have := 0
	res := 0
	l := 0

	for r := 0; r < n; r++ {
		if subs[nums[r]] == 0 {
			have++
		}
		subs[nums[r]]++

		for have == need {
			res += n - r
			subs[nums[l]]--
			if subs[nums[l]] == 0 {
				have--
			}
			l++
		}
	}
	return res
}

func countUniqueElements(nums []int) int {
	set := make(map[int]bool)
	for _, n := range nums {
		set[n] = true
	}
	return len(set)
}

func Runner() {
	fmt.Println(countCompleteSubarrays([]int{1, 3, 1, 2, 2}))
	fmt.Println(countCompleteSubarrays([]int{5, 5, 5, 5}))
}
