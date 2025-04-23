package problem1399

func countLargestGroup(n int) int {
	sumCount := make(map[int]int)
	maxSize := 0
	result := 0

	for i := 1; i <= n; i++ {
		sum := sumOfDigits(i)
		sumCount[sum]++
		if sumCount[sum] > maxSize {
			maxSize = sumCount[sum]
			result = 1
		} else if sumCount[sum] == maxSize {
			result++
		}
	}

	return result
}

func sumOfDigits(n int) int {
	sum := 0
	for n > 0 {
		sum += n % 10
		n /= 10
	}
	return sum
}
