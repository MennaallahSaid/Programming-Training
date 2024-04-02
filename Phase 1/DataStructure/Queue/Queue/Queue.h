#pragma once
#include<iostream>
using namespace std;
#define SIZE 5
class Queue
{
private:
    int items[SIZE], front, rear;

public:
    Queue();
    bool isFull();

    bool isEmpty();
    void enQueue(int element);
    int deQueue();

    void display();
};


