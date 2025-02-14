package problem1352

import "fmt"

type ProductOfNumbers struct {
	prefixProducts []int
}

func Constructor() ProductOfNumbers {
	return ProductOfNumbers{[]int{1}}
}

func (this *ProductOfNumbers) Add(num int) {
	if num == 0 {
		this.prefixProducts = []int{1}
	} else {
		this.prefixProducts = append(this.prefixProducts,
			this.prefixProducts[len(this.prefixProducts)-1]*num)
	}
}

func (this *ProductOfNumbers) GetProduct(k int) int {
	n := len(this.prefixProducts)
	if k >= n {
		return 0
	}
	return this.prefixProducts[n-1] / this.prefixProducts[n-k-1]
}

func Runner() {
	productOfNumbers := Constructor()
	productOfNumbers.Add(3)                     // [3]
	productOfNumbers.Add(0)                     // [3,0]
	productOfNumbers.Add(2)                     // [3,0,2]
	productOfNumbers.Add(5)                     // [3,0,2,5]
	productOfNumbers.Add(4)                     // [3,0,2,5,4]
	fmt.Println(productOfNumbers.GetProduct(2)) // return 20. The product of the last 2 numbers is 5 * 4 = 20
	fmt.Println(productOfNumbers.GetProduct(3)) // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
	fmt.Println(productOfNumbers.GetProduct(4)) // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
	productOfNumbers.Add(8)                     // [3,0,2,5,4,8]
	fmt.Println(productOfNumbers.GetProduct(2)) // return 32. The product of the last 2 numbers is 4 * 8 = 32
}
