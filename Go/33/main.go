package main

import (
	"context"
	"fmt"
)

func main() {
	ctx := context.Background()
	ctx = context.WithValue(ctx, "token", "value")
	bookHotel(ctx)
}

func bookHotel(ctx context.Context) {
	token := ctx.Value("token")
	fmt.Println(token)
}