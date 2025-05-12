package problem2094

import (
	"fmt"
	"sort"
)

func findEvenNumbers(digits []int) []int {
	result := map[int]bool{}

	n := len(digits)
	for i := 0; i < n; i++ {
		for j := 0; j < n; j++ {
			if j == i {
				continue
			}
			for k := 0; k < n; k++ {
				if k == i || k == j {
					continue
				}
				if digits[i] == 0 {
					continue
				}
				if digits[k]%2 != 0 {
					continue
				}
				num := digits[i]*100 + digits[j]*10 + digits[k]
				result[num] = true
			}
		}
	}

	output := make([]int, 0, len(result))
	for num := range result {
		output = append(output, num)
	}
	sort.Ints(output)
	return output
}

func Runner() {
	fmt.Println(findEvenNumbers([]int{2, 1, 3, 0}))
	fmt.Println(findEvenNumbers([]int{2, 2, 8, 8, 2}))
	fmt.Println(findEvenNumbers([]int{3, 7, 5}))

}
