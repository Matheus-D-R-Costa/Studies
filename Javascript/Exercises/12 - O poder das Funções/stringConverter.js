const word = prompt("Que palavra desejas que seja invertida?")

function reverseWord(word) {
    return word.split('').reverse().join('')
}

const text = document.getElementsByTagName('span')[0]
text.innerHTML = word

const reversedWord = document.getElementsByTagName('span')[1]
reversedWord.innerHTML = reverseWord(word)