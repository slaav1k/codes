package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if i != j && a[i]+a[j] == 0 {
				if i < j {
					fmt.Println(i, j)
				} else {
					fmt.Println(j, i)
				}

				goto end
			}
		}
	}
end:
}
