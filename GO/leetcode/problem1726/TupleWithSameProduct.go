package problem1726

import "fmt"

func tupleSameProduct(nums []int) int {
	myMap := make(map[int][][]int)
	for i := 0; i < len(nums); i++ {
		for j := i + 1; j < len(nums); j++ {
			prod := nums[i] * nums[j]
			myMap[prod] = append(myMap[prod], []int{nums[i], nums[j]})
		}
	}

	count := 0

	for _, v := range myMap {
		m := len(v)
		if m > 1 {
			count += (m * (m - 1) / 2) * 8
		}
		//fmt.Println("Product:", k, "Pairs:", v, "Combinations:", (m*(m-1))/2*8)
	}
	return count
}

func Runner() {
	//fmt.Println(tupleSameProduct([]int{2, 3, 4, 6}))
	//fmt.Println(tupleSameProduct([]int{1, 2, 4, 5, 10}))
	fmt.Println(tupleSameProduct([]int{2, 3, 4, 6, 8, 12}))
}
