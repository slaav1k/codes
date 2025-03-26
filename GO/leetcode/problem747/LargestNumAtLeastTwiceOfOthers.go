package problem747

import (
	"fmt"
	"math"
)

func dominantIndex(nums []int) int {
	if len(nums) == 1 {
		return 0
	}

	biggest := math.MinInt
	biggestIndex := 0
	big := math.MinInt

	for i, val := range nums {
		if val > biggest {
			big = biggest
			biggest = val
			biggestIndex = i
		} else if val > big {
			big = val
		}
	}

	if biggest >= big*2 {
		return biggestIndex
	}
	return -1
}

func Runner() {
	fmt.Println(dominantIndex([]int{3, 6, 1, 0}))
	fmt.Println(dominantIndex([]int{1, 2, 3, 4}))
}
