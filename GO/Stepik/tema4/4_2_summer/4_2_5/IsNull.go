package main

import "fmt"

func main() {
	var n, a int
	fmt.Scan(&n)
	f := "NO"
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if a == 0 {
			f = "YES"
			break
		}
	}
	fmt.Println(f)
}
