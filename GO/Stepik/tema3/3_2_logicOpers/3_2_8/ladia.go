package main

import "fmt"

func main() {
	var x1, y1, x2, y2 int
	fmt.Scan(&x1)
	fmt.Scan(&y1)
	fmt.Scan(&x2)
	fmt.Scan(&y2)

	if x1 == x2 || y1 == y2 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
