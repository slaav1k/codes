package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	k := 1
	fmt.Println(k)
	for k*2 <= n {
		k *= 2
		fmt.Println(k)
	}

}
