package problem2364

import "fmt"

func countBadPairs(nums []int) int64 {
	n := len(nums)

	totalPairs := int64(n * (n - 1) / 2)
	var goodPairs int64
	freqMap := make(map[int]int64)

	for i, num := range nums {
		val := i - num
		goodPairs += freqMap[val]
		freqMap[val]++
	}

	return totalPairs - goodPairs
}

func Runner() {
	fmt.Println(countBadPairs([]int{4, 1, 3, 3}))
	fmt.Println(countBadPairs([]int{1, 2, 3, 4, 5}))
}
