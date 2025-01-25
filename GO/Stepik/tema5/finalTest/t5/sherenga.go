package main

import "fmt"

func main() {
	var n, petyaHeight int
	fmt.Scan(&n)

	heights := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&heights[i])
	}

	fmt.Scan(&petyaHeight)

	position := 1
	for i := 0; i < n; i++ {
		if heights[i] >= petyaHeight {
			position = i + 2
		}
	}

	fmt.Println(position)
}
