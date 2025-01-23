package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	p := 1
	for i := 2; i <= n; i += 2 {
		p *= i
	}
	fmt.Println(p)
}
