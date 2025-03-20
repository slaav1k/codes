package problem717

import "fmt"

func isOneBitCharacter(bits []int) bool {
	if len(bits) < 1 {
		return false
	}
	if len(bits) == 1 && bits[0] == 0 {
		return true
	}
	if len(bits) == 2 && bits[0] == 1 {
		return false
	}
	l := len(bits)
	for i := 1; i < l-1; i++ {
		if bits[i-1] == 1 {
			bits[i], bits[i-1] = -1, -1
			i++
		}
	}
	if bits[l-2] == -1 {
		return true
	}
	return bits[l-2] != 1
}

func Runner() {
	fmt.Println(isOneBitCharacter([]int{1, 0, 0}))
	fmt.Println(isOneBitCharacter([]int{1, 1, 1, 0}))
}
