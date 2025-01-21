package main

import "fmt"

func main() {
	var x int
	fmt.Scan(&x)
	if x >= 12 {
		fmt.Println("Доступ разрешен")
	} else {
		fmt.Println("Доступ запрещен")
	}

}
