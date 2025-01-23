package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	count := 0
	for n > 0 {
		k := n % 10
		if k == 4 {
			count++
		}
		n /= 10
	}
	fmt.Println(count)
}
