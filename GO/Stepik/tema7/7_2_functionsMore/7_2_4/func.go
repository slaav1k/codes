package main

import (
	"fmt"
	"math"
)

func main() {
	s := 0.0
	for x := -25.0; x <= 15; x++ {
		s += y(x)
	}
	fmt.Println(s)
}

func y(x float64) float64 {
	switch {
	case x < -5:
		{
			return 2*math.Abs(x) - 1
		}
	case x <= 5:
		{
			return x
		}
	case x > 5:
		{
			return 2 * x
		}
	}
	return -1
}
