package problem2873

import (
	"fmt"
	"math"
)

func maximumTripletValue(nums []int) int64 {
	mx := math.MinInt
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			for k := j + 1; k < len(nums); k++ {
				val := (nums[i] - nums[j]) * nums[k]
				if val > mx {
					mx = val
				}
			}
		}
	}
	if mx < 0 {
		return 0
	}
	return int64(mx)
}

func Runner() {
	fmt.Println(maximumTripletValue([]int{12, 6, 1, 2, 7}))
	fmt.Println(maximumTripletValue([]int{1, 10, 3, 4, 19}))
	fmt.Println(maximumTripletValue([]int{1, 2, 3}))
}
