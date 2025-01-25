package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scan(&n)
	a := make([]int, n)
	min := int(math.MaxInt64)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
		if a[i] < min {
			min = a[i]
		}
	}
	for i := 0; i < n; i++ {
		fmt.Print(a[i]-min, " ")
	}

}
