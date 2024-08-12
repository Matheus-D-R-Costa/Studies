package main

import "fmt"

func main() {
	words := []string{"abc", "car", "ada", "racecar", "cool"}
	fmt.Println(firstPalindrome(words))
}

func firstPalindrome(words []string) string {
	for _, word := range words {
		if isPalindrome(word) {
			return word
		}
	}

	return ""

}

func isPalindrome(word string) bool {
	for i := 0; i < len(word)/2; i++ {
		if word[i] != word[len(word)-1-i] {
			return false
		}
	}

	return true

}
