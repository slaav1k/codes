package problem2537

import "fmt"

func countGood(nums []int, k int) int64 {
	right, left := 0, 0
	pairCount := 0
	cnts := make(map[int]int)
	res := int64(0)

	for left <= right {
		for pairCount >= k {
			cnts[nums[left]]--
			if cnts[nums[left]] >= 1 {
				pairCount -= cnts[nums[left]]
			}
			left++
			if pairCount >= k {
				res += int64(len(nums) - right + 1)
			}
		}
		for pairCount < k && right < len(nums) {
			if cnts[nums[right]] >= 1 {
				pairCount += cnts[nums[right]]
			}
			cnts[nums[right]]++
			right++
		}
		if pairCount < k {
			return res
		}
		res += int64(len(nums) - right + 1)
	}
	return res
}

func Runner() {
	fmt.Println(countGood([]int{1, 1, 1, 1, 1}, 10))
	fmt.Println(countGood([]int{3, 1, 4, 3, 2, 2, 4}, 2))
}
