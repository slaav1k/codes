package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	var s string
	fmt.Scan(&s)
	removals := 0
	for i := 0; i <= n-3; {
		if s[i:i+3] == "xxx" {
			removals++
			i++
		} else {
			i++
		}
	}
	fmt.Println(removals)
}
