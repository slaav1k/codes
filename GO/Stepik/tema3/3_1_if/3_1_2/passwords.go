package main

import "fmt"

func main() {
	var password, password2 string
	fmt.Scan(&password, &password2)
	if password2 == password {
		fmt.Println("Пароль принят")
	} else {
		fmt.Println("Пароль не принят")
	}

}
