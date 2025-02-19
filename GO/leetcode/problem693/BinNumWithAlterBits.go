package problem693

import (
	"fmt"
	"strconv"
)

func hasAlternatingBits(n int) bool {
	f := strconv.FormatInt(int64(n), 2)
	if len(f) == 1 {
		return true
	}
	for i := 1; i < len(f); i++ {
		if f[i] == f[i-1] {
			return false
		}
	}
	return true
}

func Runner() {
	fmt.Println(hasAlternatingBits(5))
	fmt.Println(hasAlternatingBits(7))
	fmt.Println(hasAlternatingBits(11))
}
