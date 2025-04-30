package problem1295

import "fmt"

func findNumbers(nums []int) int {
	count := 0
	for _, num := range nums {
		if isEven(countDigits(num)) {
			count++
		}
	}
	return count
}

func isEven(n int) bool {
	if n <= 1 {
		return false
	}
	if n%2 == 0 {
		return true
	}
	return false
}

func countDigits(num int) int {
	count := 0
	for num > 0 {
		num = num / 10
		count++
	}
	return count
}

func Runner() {
	fmt.Println(findNumbers([]int{12, 345, 2, 6, 7896}))
	fmt.Println(findNumbers([]int{555, 901, 482, 1771}))
}
