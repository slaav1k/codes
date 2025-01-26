package main

import (
	"fmt"
)

func main() {
	var t1, t2 string
	fmt.Scan(&t1, &t2)

	if isLuckyTicket(t1) && isLuckyTicket(t2) {
		fmt.Println(1)
	} else {
		fmt.Println(-1)
	}
}

func isLuckyTicket(s string) bool {
	if len(s) != 6 {
		return false
	}

	sum1, sum2 := 0, 0
	for i := 0; i < 6; i++ {
		digit := int(s[i] - '0')
		if i < 3 {
			sum1 += digit
		} else {
			sum2 += digit
		}
	}
	return sum1 == sum2
}
