#include "Queue.h"

Queue::Queue() {
    front = -1;
    rear = -1;
}

bool Queue::isFull() {
    if (front == 0 && rear == SIZE - 1) {
        return true;
    }
    return false;
}

bool Queue::isEmpty() {
    if (front == -1)
        return true;
    else
        return false;
}

void Queue::enQueue(int element) {
    if (isFull()) {
        cout << "Queue is full";
    }
    else {
        if (front == -1) front = 0;
        rear++;
        items[rear] = element;
        cout << endl
            << "Inserted " << element << endl;
    }
}

int Queue::deQueue() {
    int element;
    if (isEmpty()) {
        cout << "Queue is empty" << endl;
        return (-1);
    }
    else {
        element = items[front];
        if (front >= rear) {
            front = -1;
            rear = -1;
        } /* Q has only one element, so we reset the queue after deleting it. */
        else {
            front++;
        }
        cout << endl
            << "Deleted -> " << element << endl;
        return (element);
    }
}

void Queue::display() {
    /* Function to display elements of Queue */
    int i;
    if (isEmpty()) {
        cout << endl
            << "Empty Queue" << endl;
    }
    else {
        cout << endl
            << "Front index-> " << front;
        cout << endl
            << "Items -> ";
        for (i = front; i <= rear; i++)
            cout << items[i] << "  ";
        cout << endl
            << "Rear index-> " << rear << endl;
    }
}

       