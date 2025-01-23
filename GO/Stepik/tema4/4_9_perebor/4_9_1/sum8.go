package main

import "fmt"

func main() {
	var count int
	for i := 100; i <= 999; i++ {
		sum := (i / 100) + (i / 10 % 10) + (i % 10)
		if sum == 8 {
			count++
		}
	}
	fmt.Println(count)
}
