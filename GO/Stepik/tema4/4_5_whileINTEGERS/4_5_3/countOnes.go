package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)
	countOnes := 0
	for n > 0 {
		k := n % 2
		if k == 1 {
			countOnes++
		}
		n = n / 2
	}
	fmt.Println(countOnes)
}
