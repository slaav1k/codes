package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	var first string
	var second string
	var third string

	scanner := bufio.NewScanner(os.Stdin)
	scanner.Scan()
	first = scanner.Text()
	scanner.Scan()
	second = scanner.Text()
	scanner.Scan()
	third = scanner.Text()
	fmt.Println(third)
	fmt.Println(second)
	fmt.Println(first)

}
