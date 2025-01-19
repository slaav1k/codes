package main

import "fmt"

func main() {
	var a int
	fmt.Scan(&a)
	for i := 0; i < 3; i++ {
		fmt.Println(a + i)
	}
}
