package problem2375

import "fmt"

func smallestNumber(pattern string) string {
	n := len(pattern)
	result := make([]byte, n+1)
	stack := make([]byte, 0)
	current := byte('1')

	for i := 0; i <= n; i++ {
		stack = append(stack, current)
		current++
		if i == n || pattern[i] == 'I' {
			for len(stack) > 0 {
				top := len(stack) - 1
				result[i-top] = stack[top]
				stack = stack[:top]
			}
		}
	}

	return string(result)
}

func Runner() {
	fmt.Println(smallestNumber("IIIDIDDD"))
	fmt.Println(smallestNumber("DDD"))
}
