package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	ans := "NO"
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if i != j && arr[i] == arr[j] {
				ans = "YES"
				goto label
			}
		}
	}
label:
	fmt.Println(ans)
}
