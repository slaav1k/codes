package main

import "fmt"

func main() {
	var month int
	fmt.Scan(&month)

	switch month {
	case 1, 3, 5, 7, 8, 10, 12:
		fmt.Println(31)
	case 4, 6, 9, 11:
		fmt.Println(30)
	case 2:
		fmt.Println(29)
	default:
		fmt.Println("Неверный номер месяца")
	}
}
