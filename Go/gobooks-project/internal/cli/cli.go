package cli

import (
	"fmt"
	"gobooks/internal/service"
	"os"
)

type Cli struct {
	service *service.BookService
}

func NewCli(service *service.BookService) *Cli {
	return &Cli{service: service}
}

func (cli Cli) Run() {
	if len(os.Args) < 2 {
		fmt.Println("Usage: books <command> [args]")
		return
	}

	command := os.Args[1]

	//TODO: Switch Case
}