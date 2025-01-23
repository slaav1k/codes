package main

import "fmt"

func main() {
	var n, a int
	fmt.Scan(&n)
	k := 0
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if a == 0 {
			k++
		}
	}
	fmt.Println(k)
}
