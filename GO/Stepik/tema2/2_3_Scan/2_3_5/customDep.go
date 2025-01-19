package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var dep, first, second, third string
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	dep = scanner.Text()
	scanner.Scan()
	first = scanner.Text()
	scanner.Scan()
	second = scanner.Text()
	scanner.Scan()
	third = scanner.Text()
	fmt.Println(first + dep + second + dep + third)
}
