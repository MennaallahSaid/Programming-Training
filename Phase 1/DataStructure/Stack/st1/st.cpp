//#include <iostream> 
#include <iostream>
#include <string>
#include <stack>
#include "S.cpp"


using namespace std;
int main() {
   

    Stack myStack;
    // Push elements until the stack becomes full
    for (int i = 1; i <= 5; ++i) {
        myStack.push(i);
    }
    // Attempt to push more elements into the full stack
    myStack.push(6);
    // Pop all elements until the stack becomes empty
    while (!myStack.isEmpty()) {
      //  int top = myStack.topElement();
      // cout << "the top is" << top << endl;
        myStack.pop();
                
    }
    
    return 0;
}

