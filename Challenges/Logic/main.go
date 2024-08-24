package main

func main() {

	a := false
	b := true
	c := true

	result := !((a || b) && c) || (b || !c)
	result2 := !((a && b)) || (b && !b)
	result3 := !(a && b) || !c

	println(result)
	println(result2)
	println(result3)

	println(b || !b)

	testaTautologia(result, result3)

}

// A → B = !A || B
// "(false || true) && true -> (true || !true)
// "(false || true) && true -> (true || false)
// "true && true -> true
// "true -> (true)
// "true

// (a && b) -> (a && !b)
// (false && true) -> (false && !true)
// (false && true) -> (false && false)
// false -> (false && false)"
// false -> false
// true

func testaTautologia(P bool, Q bool) {
	implicacao := !P || Q

	if implicacao {
		println("P -> Q é uma tautologia.")
	} else {
		println("P -> Q não é uma tautologia")
	}

}