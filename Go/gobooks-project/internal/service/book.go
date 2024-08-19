package service

import "database/sql"

type Book struct {
	Id int
	Title string
	Author string
	Genre string
}

type BookService struct {
	db *sql.DB
}

func (service *BookService) Create(book *Book) error {
	query := "INSERT INTO Books (title, author, genre) VALUES (?, ?, ?)"

	result, err := service.db.Exec(query, book.Title, book.Author, book.Genre)
	if err != nil {
		return err
	}

	lastInsertId, err := result.LastInsertId()
	if err != nil {
		return err
	}

	book.Id = int(lastInsertId)

	return nil

}

func (service *BookService) GetAll() ([]Book, error) {
	query := "SELECT * FROM Books"

	rows, err := service.db.Query(query)
	if err != nil {
		return nil, err
	}

	defer rows.Close()

	var books []Book
	for rows.Next() {
		var book Book

		err := rows.Scan(&book.Id, &book.Title, &book.Author, &book.Genre)
		if err != nil {
			return nil, err
		}

		books = append(books,book)

	}

	return books, nil

}

func (service *BookService) GetById(id int) (*Book, error) {
	query := "SELECT * FROM Books WHERE id = ?"

	row := service.db.QueryRow(query, id)

	var book Book

	err := row.Scan(&book.Id, &book.Title, &book.Author, &book.Genre)
	if err != nil {
		return nil, err
	}

	return &book, nil

}

func (service *BookService) Update(book *Book) error {
	query := "UPDATE Books SET title = ?, author = ?, genre = ?, WHERE id = ?"

	_, err := service.db.Exec(query, book.Title, book.Author, book.Genre, book.Id)

	return err

}

func (service *BookService) Delete(id int) error {
	query := "DELETE FROM Books WHERE id = ?"

	_, err := service.db.Exec(query, id)

	return err
	
}