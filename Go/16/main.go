package main

func main() {

	var variable interface{} = "Carlos P.O"
	println(variable.(string))

	res, ok := variable.(int)
	if ok == false {
		println("A conversão foi feita de maneira incorreta")
	}

	println(res)

}
