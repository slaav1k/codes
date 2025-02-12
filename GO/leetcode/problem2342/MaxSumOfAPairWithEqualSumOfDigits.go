package problem2342

import "fmt"

func maximumSum(nums []int) int {
	maxNum := make(map[int]int)
	mx := -1

	for _, num := range nums {
		digitSum := sumOfDigits(num)

		if val, exists := maxNum[digitSum]; exists {
			mx = mxNum(mx, val+num)
		}
		maxNum[digitSum] = mxNum(maxNum[digitSum], num)
	}

	return mx
}

func sumOfDigits(num int) int {
	sum := 0
	for num > 0 {
		sum += num % 10
		num /= 10
	}
	return sum
}

func mxNum(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func Runner() {
	fmt.Println(maximumSum([]int{18, 43, 36, 13, 7}))
	fmt.Println(maximumSum([]int{10, 12, 19, 14}))
}
