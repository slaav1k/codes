package main

import "fmt"

func main() {
	for i := 10; i <= 99; i++ {
		tens := i / 10
		ones := i % 10
		if i == 2*(tens*ones) {
			if i != 10 {
				fmt.Print(",")
			}
			fmt.Print(i)
		}
	}
}
