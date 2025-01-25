package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	for i := 0; i < len(s); i++ {
		if s[i] == 'e' {
			fmt.Print("i")
		} else {
			fmt.Print(string(s[i]))
		}
	}
}
