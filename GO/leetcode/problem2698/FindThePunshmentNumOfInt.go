package problem2698

import "fmt"

func punishmentNumber(n int) int {
	var canPartition func(num, target int) bool
	canPartition = func(num, target int) bool {
		if target < 0 || num < target {
			return false
		}

		if num == target {
			return true
		}
		return canPartition(num/10, target-(num%10)) ||
			canPartition(num/100, target-(num%100)) ||
			canPartition(num/1000, target-(num%1000))
	}

	punishmentNum := 0

	for currentNum := 1; currentNum <= n; currentNum++ {
		squareNum := currentNum * currentNum
		if canPartition(squareNum, currentNum) {
			punishmentNum += squareNum
		}
	}

	return punishmentNum
}

func Runner() {
	fmt.Println(punishmentNumber(10))
	fmt.Println(punishmentNumber(37))
}
