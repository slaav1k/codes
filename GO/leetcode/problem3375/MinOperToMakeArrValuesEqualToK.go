package problem3375

import "fmt"

func minOperations(nums []int, k int) int {
	for i := 0; i < len(nums); i++ {
		if nums[i] < k {
			return -1
		}
	}

	mx, p_mx := my_max(nums)
	t := 0
	for mx > k {
		nums = minus(nums, mx, p_mx)
		t++
		mx, p_mx = my_max(nums)
	}
	return t
}

func minus(nums []int, mx int, p_mx int) []int {
	for i := 0; i < len(nums); i++ {
		if nums[i] == mx {
			nums[i] = p_mx
		}
	}
	return nums
}

func my_max(nums []int) (int, int) {
	mx := -1
	second := -1
	for _, num := range nums {
		if num > mx {
			second = mx
			mx = num
		} else if num < mx && num > second {
			second = num
		}
	}
	return mx, second
}

func Runner() {
	fmt.Println(minOperations([]int{5, 2, 5, 4, 5}, 2))
	fmt.Println(minOperations([]int{2, 1, 2}, 2))
	fmt.Println(minOperations([]int{9, 7, 5, 3}, 1))
}
