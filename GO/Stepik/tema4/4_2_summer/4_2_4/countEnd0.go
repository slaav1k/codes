package main

import "fmt"

func main() {
	var n, a int
	fmt.Scan(&n)
	count := 0
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if a%10 == 0 {
			count += 1
		}
	}
	fmt.Println(count)
}
