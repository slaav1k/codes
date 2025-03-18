package problem50

import "fmt"

func myPow(x float64, n int) float64 {
	p := x
	if n == 0 {
		return 1
	}
	if x == 1.0 {
		return x
	}
	f := false
	if n < 0 {
		f = true
		n = -n
	}
	for ; n > 1; n-- {
		p *= x
	}
	if f {
		return 1 / p
	} else {
		return p
	}

}

func Runner() {
	fmt.Println(myPow(2.0, 4))
	fmt.Println(myPow(2.0, 10))
	fmt.Println(myPow(2.1, 3))
	fmt.Println(myPow(2.0, -2))
}
