package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	if n <= -3 || n >= 7 {
		fmt.Println("Принадлежит")
	} else {
		fmt.Println("Не принадлежит")
	}

}
