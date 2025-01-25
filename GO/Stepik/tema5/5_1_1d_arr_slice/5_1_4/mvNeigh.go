package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	for i := 1; i < n; i += 2 {
		arr[i], arr[i-1] = arr[i-1], arr[i]
	}
	for i := 0; i < n; i++ {
		fmt.Print(arr[i], " ")
	}
}
