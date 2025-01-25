package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)

	count := make([]int, 5)
	for i := 0; i < n; i++ {
		var groupSize int
		fmt.Scan(&groupSize)
		count[groupSize]++
	}

	taxis := count[4]

	if count[3] <= count[1] {
		taxis += count[3]
		count[1] -= count[3]
	} else {
		taxis += count[3]
		count[1] = 0
	}

	taxis += count[2] / 2
	if count[2]%2 != 0 {
		taxis++
		count[1] -= 2
	}

	if count[1] > 0 {
		taxis += (count[1] + 3) / 4
	}

	fmt.Println(taxis)
}
