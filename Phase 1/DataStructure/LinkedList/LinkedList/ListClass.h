#pragma once
#include "Node.h"
class ListClass
{
    Node* head;

public:

    ListClass() {
        head = NULL;
    }
    //node at the end of the
    // linked list. 
    void insertNode(int);

    // Function to print the 
    // linked list. 
    void printList();

    // Function to delete the 
    // node at given position 
    void deleteNode(int);

};

