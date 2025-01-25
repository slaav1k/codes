package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	k := 0
	for i := 0; i < len(s); i++ {
		for j := 0; j < len(s); j++ {
			if i != j && s[i] == s[j] {
				k++
			}
		}
		if k > 1 {
			fmt.Println(string(s[i]))
			break
		}
	}
}
