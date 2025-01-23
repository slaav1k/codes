package main

import "fmt"

func main() {
	var a, b int
	fmt.Scan(&a, &b)
	for i := b; i >= a; i-- {
		fmt.Printf("%d\n", i)
	}
}
