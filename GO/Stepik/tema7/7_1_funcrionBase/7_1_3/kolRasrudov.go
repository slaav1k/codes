package main

import "fmt"

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	fmt.Println(kol(a) * kol(b))
}

func kol(n int) int {
	count := 0
	for n > 0 {
		count++
		n /= 10
	}
	return count
}
