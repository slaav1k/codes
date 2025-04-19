package problem2563

import (
	"sort"
)

func countFairPairs(nums []int, lower int, upper int) int64 {
	sort.Ints(nums)
	var cnt int64 = 0
	n := len(nums)

	for i := 0; i < n; i++ {
		l := sort.SearchInts(nums[i+1:], lower-nums[i])
		r := sort.SearchInts(nums[i+1:], upper-nums[i]+1)
		cnt += int64(r - l)
	}

	return cnt
}
