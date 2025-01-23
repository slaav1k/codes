package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	k := 1
	i := 0
	for k < n {
		k *= 2
		i += 1
	}
	fmt.Println(i)
}
