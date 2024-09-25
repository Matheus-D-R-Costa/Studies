package main

import "net/http"

func main() {
	mux := http.NewServeMux()
	mux.HandleFunc("/", homeHandler)
	mux.HandleFunc("/horse", horseHandler)
	http.ListenAndServe(":8080", mux)

	mux2 := http.NewServeMux()
	mux2.HandleFunc("/", homeHandler)
	mux2.HandleFunc("/horse", horseHandler)
	http.ListenAndServe(":8081", mux2)
}

func homeHandler(res http.ResponseWriter, req *http.Request) {
	res.Write([]byte("Ola mestre dos magos!"))
}

func horseHandler(res http.ResponseWriter, req *http.Request) {
	res.Write([]byte("Cavalo"))
}