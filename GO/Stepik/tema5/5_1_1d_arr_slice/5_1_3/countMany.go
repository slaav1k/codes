package main

import (
	"fmt"
)

func main() {
	var n, k int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
		if i > 0 {
			if arr[i] > arr[i-1] {
				k++
			}
		}
	}
	fmt.Println(k)
}
