package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	cp := n
	s := 0
	for n > 0 {
		s += n % 10
		n /= 10
	}
	if cp < 10 || cp%s == 0 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
