package main

import (
	"testing"

	"github.com/stretchr/testify/assert"
)

// Simple test
func Test_Greeting(t *testing.T) {
	assert.Equal(t, "Hello world", Greeting("world"))
}

// Embedded tests
func Test_GreetingShould(t *testing.T) {
	t.Run("display the famous hello world", func(t *testing.T) {
		assert.Equal(t, "Hello world", Greeting("world"))
	})
	t.Run("greet the code retreat developers", func(t *testing.T) {
		assert.Equal(t, "Hello developers", Greeting("developers"))
	})
}

// Test cases
func Test_GreetingShouldAlso(t *testing.T) {
	tests := []struct {
		name         string
		greetingName string
		want         string
	}{
		{
			name:         "display the famous hello world",
			greetingName: "world",
			want:         "Hello world",
		},
		{
			name:         "greet the code retreat developers",
			greetingName: "developers",
			want:         "Hello developers",
		},
	}
	for _, tt := range tests {
		tt := tt // Avoid a warning
		t.Run(tt.name, func(t *testing.T) {
			if got := Greeting(tt.greetingName); got != tt.want {
				t.Errorf("Greeting(%s) = %v, want %v", tt.greetingName, got, tt.want)
			}
		})
	}
}
