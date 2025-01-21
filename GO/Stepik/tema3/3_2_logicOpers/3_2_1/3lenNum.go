package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	if n > 99 && n < 1000 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}

}
