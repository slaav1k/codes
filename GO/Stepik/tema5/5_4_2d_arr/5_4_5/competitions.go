package main

import (
	"fmt"
	"math"
)

func main() {
	var n, m, mx, imx, sm int
	fmt.Scan(&n, &m)
	arr := make([][]int, n)
	mx = math.MinInt
	for i := 0; i < n; i++ {
		arr[i] = make([]int, m)
		sm = 0
		for j := 0; j < m; j++ {
			fmt.Scan(&arr[i][j])
			sm += arr[i][j]
		}
		if sm > mx {
			mx = sm
			imx = i
		}
	}
	fmt.Println(mx)
	fmt.Println(imx)
}
