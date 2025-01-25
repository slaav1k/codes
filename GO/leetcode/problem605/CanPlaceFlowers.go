package problem605

import "fmt"

func canPlaceFlowers(flowerbed []int, n int) bool {
	count := 0
	for i := 0; i < len(flowerbed); i++ {
		if flowerbed[i] == 0 {
			emptyLeft := i == 0 || flowerbed[i-1] == 0
			emptyRight := i == len(flowerbed)-1 || flowerbed[i+1] == 0
			if emptyLeft && emptyRight {
				flowerbed[i] = 1
				count++
				if count >= n {
					return true
				}
			}
		}
	}
	return count >= n
}

func Runner() {
	fmt.Println(canPlaceFlowers([]int{1, 0, 0, 0, 1}, 1))       // true
	fmt.Println(canPlaceFlowers([]int{1, 0, 0, 0, 1}, 2))       // false
	fmt.Println(canPlaceFlowers([]int{1, 0, 1, 0, 1, 0, 1}, 1)) // false
}
