package main

import "fmt"

func main() {
	var s string
	fmt.Scan(&s)
	k := []rune(s)
	if k[0] >= 48 && k[0] <= 57 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}

}
