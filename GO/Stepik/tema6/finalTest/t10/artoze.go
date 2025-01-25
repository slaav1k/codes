package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	for i := 0; i < len(s); {
		if s[i] == '.' {
			fmt.Print(0)
			i++
		} else if s[i:i+2] == "-." {
			fmt.Print(1)
			i += 2
		} else {
			fmt.Print(2)
			i += 2
		}
	}
}
