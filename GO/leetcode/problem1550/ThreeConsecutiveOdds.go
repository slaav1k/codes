package problem1550

func threeConsecutiveOdds(arr []int) bool {
	k := 0
	for i := 0; i < len(arr); i++ {
		if isOdd(arr[i]) {
			k += 1
			if k == 3 {
				return true
			}
		} else {
			k = 0
		}
	}
	return false
}

func isOdd(num int) bool {
	if num%2 != 0 {
		return true
	}
	return false
}
