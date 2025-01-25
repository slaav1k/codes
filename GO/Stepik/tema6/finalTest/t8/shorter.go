package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	var a string
	for i := 0; i < n; i++ {
		fmt.Scan(&a)
		if len(a) > 10 {
			fmt.Print(string(a[0]))
			fmt.Print(len(a) - 2)
			fmt.Print(string(a[len(a)-1]))
			fmt.Println()
		} else {
			fmt.Println(a)
		}
	}
}
