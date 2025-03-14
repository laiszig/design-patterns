package main

import "fmt"

func main() {

	adidasFactory, _ := GetSportsFactory("adidas")
	nikeFactory, _ := GetSportsFactory("nike")

	nikeShoe := nikeFactory.makeShoe()
	nikeShirt := nikeFactory.makeShirt()

	adidasShoe := adidasFactory.makeShoe()
	adidasShirt := adidasFactory.makeShirt()

	printShoeDetails(nikeShoe)
	printShirtDetails(nikeShirt)

	printShoeDetails(adidasShoe)
	printShirtDetails(adidasShirt)

}

func printShoeDetails(s IShoe) {
	fmt.Println("Logo: %s", s.getLogo())
	fmt.Println()
	fmt.Println("Size: %d", s.getSize())
	fmt.Println()
}

func printShirtDetails(s IShirt) {
	fmt.Println("Logo: %s", s.getLogo())
	fmt.Println()
	fmt.Println("Size: %d", s.getSize())
	fmt.Println()
}
