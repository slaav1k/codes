package main

import "fmt"

func main() {
	var metres int
	_, err := fmt.Scan(&metres)
	if err != nil {
		return
	}
	km := metres / 1000
	fmt.Println(km)

}
