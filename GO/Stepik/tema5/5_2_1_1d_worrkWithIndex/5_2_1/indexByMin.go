package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	var mn, idx int
	mn = arr[0]
	idx = 0
	for i := 1; i < n; i++ {
		if arr[i] < mn {
			mn = arr[i]
			idx = i
		}
	}
	fmt.Println(idx)
}
