package web

import (
	"encoding/json"
	"gobooks/internal/service"
	"net/http"
)

type BookHandlers struct {
	service *service.BookService
}

func (handler *BookHandlers) Create(res http.ResponseWriter, req *http.Request) {
	var book service.Book

	err := json.NewDecoder(req.Body).Decode(&book)
	if err != nil {
		http.Error(res, "Invalid request body", http.StatusBadRequest)
		return
	}

	err = handler.service.Create(&book)
	if err != nil {
		http.Error(res, "Failed to create book", http.StatusInternalServerError)
	}

	res.WriteHeader(http.StatusCreated)
	json.NewEncoder(res).Encode(book)

}

func (handler *BookHandlers) GetAll(res http.ResponseWriter, req *http.Request) {
	books, err := handler.service.GetAll()
	if err != nil {
		http.Error(res, "Failed to get Books", http.StatusInternalServerError)
		return
	}

	res.Header().Set("Content-Type", "application/json")
	json.NewEncoder(res).Encode(books)

}