package problem1491

import (
	"fmt"
	"math"
)

func average(salary []int) float64 {
	s := 0
	mn, mx := math.MaxInt, math.MinInt
	for _, v := range salary {
		if v > mx {
			mx = v
		}
		if v < mn {
			mn = v
		}
		s += v
	}
	return float64(s-mn-mx) / float64(len(salary)-2)
}

func Runner() {
	fmt.Println(average([]int{4000, 3000, 1000, 2000}))
	fmt.Println(average([]int{1000, 2000, 3000}))

}
