package problem1534

import "fmt"

func countGoodTriplets(arr []int, a int, b int, c int) int {
	count := 0
	for i := 0; i < len(arr); i++ {
		for j := i + 1; j < len(arr); j++ {
			if abs(arr[i]-arr[j]) <= a {
				for k := j + 1; k < len(arr); k++ {
					if abs(arr[k]-arr[j]) <= b {
						if abs(arr[k]-arr[i]) <= c {
							count++
						}
					}

				}
			}
		}
	}
	return count
}

func abs(a int) int {
	if a < 0 {
		return -a
	}
	return a
}

func Runner() {
	fmt.Println(countGoodTriplets([]int{3, 0, 1, 1, 9, 7}, 7, 2, 3))
	fmt.Println(countGoodTriplets([]int{1, 1, 2, 2, 3}, 0, 0, 1))
}
