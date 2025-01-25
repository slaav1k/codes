package main

import (
	"fmt"
	"math"
)

func main() {
	var n int
	fmt.Scan(&n)
	a := make([]int, n)
	mx := math.MinInt
	mn := math.MaxInt
	imx := 0
	imn := 0
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
		if a[i] > mx {
			mx = a[i]
			imx = i
		}
		if a[i] < mn {
			mn = a[i]
			imn = i
		}
	}
	fmt.Println(imx - imn)
}
