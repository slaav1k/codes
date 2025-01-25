package main

import "fmt"

func main() {
	var s string
	var k int
	fmt.Scan(&s)
	fmt.Scan(&k)
	for i := 0; i < len(s); i++ {
		if i != k-1 {
			fmt.Print(string(s[i]))
		}
	}
}
