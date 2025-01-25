package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n)
	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	for i := 0; i < n-1; i++ {
		if a[i+1] > a[i] {
			k++
		}
	}
	fmt.Println(k)
}
