package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	count := 0
	for n%3 == 0 {
		count++
		n /= 3
	}
	fmt.Println(count)

}
