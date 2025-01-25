package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	ans := "YES"
	for i := 0; i < n/2; i++ {
		if arr[i] != arr[n-i-1] {
			ans = "NO"
		}
	}
	fmt.Println(ans)
}
