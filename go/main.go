package main

import "fmt"

func Greeting(name string) string {
	return fmt.Sprintf("Hello %s", name)
}

func main() {
	fmt.Println(Greeting("world"))
}
