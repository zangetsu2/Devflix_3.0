package main

import (
	"net/http"

	"github.com/gin-gonic/gin"
)

func main() {
	r := gin.Default()
	r.GET("/recommendations", func(c *gin.Context) {
		recs := []string{"Inception", "The Matrix"}
		c.JSON(http.StatusOK, gin.H{"data": recs})
	})
	r.Run(":8000")
}
