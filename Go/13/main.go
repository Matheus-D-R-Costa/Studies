package main

func main() {
	varA := 10
	varB := 3

	println(varA, varB)

	doSomething(&varA, &varB)

	println(varA, varB)
}

func doSomething(a, b *int)  {

	*a = 50
	*b = 50

}