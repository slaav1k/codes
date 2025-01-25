package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	k := 0
	for i := 0; i < len(s); i++ {
		if s[i] == 'e' || s[i] == 'a' || s[i] == 'o' || s[i] == 'u' || s[i] == 'i' {
			k++
		}
	}
	fmt.Println(k)

}
