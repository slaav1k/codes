package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	f := "YES"
	for i := 0; i < len(s); i++ {
		if s[i] != s[len(s)-i-1] {
			f = "NO"
			break
		}
	}
	fmt.Println(f)
}
