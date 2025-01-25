package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	arr2 := make([]int, n)
	for i := 0; i < n; i++ {
		arr2[(i+1)%n] = arr[i]
	}
	for i := 0; i < n; i++ {
		fmt.Printf("%d ", arr2[i])
	}
}
