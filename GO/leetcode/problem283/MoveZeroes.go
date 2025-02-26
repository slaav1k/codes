package problem283

import "fmt"

func moveZeroes(nums []int) {
	for i, zeros := 0, 0; i < len(nums); i++ {
		if nums[i] != 0 {
			nums[i], nums[zeros] = nums[zeros], nums[i]
			zeros++
		}
		//fmt.Println("i:", i, "nums:", nums)
	}
}

func Runner() {
	nums := []int{0, 1, 0, 3, 12}
	moveZeroes(nums)
	fmt.Println(nums)
}
