package main

import "fmt"

func main() {
	var a int
	fmt.Scan(&a)
	if a < 60 {
		fmt.Println("Легкий вес")
	} else {
		if a < 64 {
			fmt.Println("Первый полусредний вес")
		} else {
			fmt.Println("Полусредний вес")
		}
	}
}
