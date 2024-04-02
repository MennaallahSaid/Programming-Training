#pragma once
#include <iostream>
const int MAX_SIZE = 5;
															
class Stack 
{
private:
	int arr[MAX_SIZE];
	int top;
    bool isEmpty() {
        return (top == -1);
    }

    bool isFull() {
        return (top == MAX_SIZE - 1);
    }

    void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            std::cout << "Pushed element: " << element << " onto the stack.\n";
        }
        else {
            std::cout << "Stack is full. Cannot push element " << element << ".\n";
        }
    }

    void pop() {
        if (!isEmpty()) {
            int poppedElement = arr[top];
            top--;
            std::cout << "Popped element: " << poppedElement << " from the stack.\n";
        }
        else {
            std::cout << "Stack is empty. Cannot pop from an empty stack.\n";
        }
    }
    int topElement() {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            std::cout << "Stack is empty.\n";
            return -1; // In this example, we consider -1 as an invalid value.
        }
    }
};

