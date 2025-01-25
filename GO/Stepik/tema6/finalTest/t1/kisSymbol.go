package main

import (
	"fmt"
)

func main() {
	var s string
	fmt.Scan(&s)
	var n int
	fmt.Scan(&n)
	if n < 1 || n > len(s) {
		fmt.Println("NO")
	} else {
		fmt.Println(string(s[n-1]))
	}

}
