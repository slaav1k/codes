package main

import "fmt"

func main() {
	var n, k int
	fmt.Scan(&n)
	arr := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arr[i])
	}
	f := false
	for i := 0; i < n-1; i++ {
		if arr[i] < 0 && arr[i+1] < 0 || arr[i+1] > 0 && 0 < arr[i] {
			k++
			f = true
			break
		}
	}
	if f {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
