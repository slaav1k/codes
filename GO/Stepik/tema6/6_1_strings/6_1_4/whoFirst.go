package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	f := "-1"
	for i := 0; i < len(s); i++ {
		if string(s[i]) == "w" || string(s[i]) == "x" {
			f = string(s[i])
			break
		}
	}
	fmt.Println(f)
}
