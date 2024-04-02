#include "S.h"
#pragma once
#include <iostream>
const int MAX_SIZE = 5;

using namespace std;
class Stack
{
public:
    int arr[MAX_SIZE];
    int top=-1;
    bool isEmpty() {
        return (top == -1);
    }

    bool isFull() {
        //check if top (have 4 )is full 
        //

        if (top == MAX_SIZE - 1)
            return true;
        else
            return false;
        //return (top == MAX_SIZE - 1);
    }

    void push(int element) {
        if (!isFull()) {
            top++;
            arr[top] = element;
            cout << "Pushed element: " << element << " onto the stack.\n";
        }
        else {
            cout << "Stack is full. Cannot push element " << element << ".\n";
        }
    }

    void pop() {
        if (!isEmpty()) {
            int poppedElement = arr[top];
            top--;
            cout << "Popped element: " << poppedElement << " from the stack.\n";
        }
        else {
            cout << "Stack is empty. Cannot pop from an empty stack.\n";
        }
    }
    int topElement() {
        if (!isEmpty()) {
            return arr[top];
        }
        else {
            cout << "Stack is empty.\n";
            return -1; // In this example, we consider -1 as an invalid value.
        }
    }
};

