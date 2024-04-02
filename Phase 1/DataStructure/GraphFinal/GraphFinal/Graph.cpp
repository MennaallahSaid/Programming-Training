#include "Graph.h"



Graph::Graph(int vertices) {
    numVertices = vertices;
    adjLists = new list<int>[vertices];
    resetGraph();
}


void Graph::addEdge(int src, int dest) {
    adjLists[src].push_back(dest);
    adjLists[dest].push_back(src);
}

// BFS algorithm
void Graph::BFS(int startVertex) {
    resetGraph();
    
    list<int> queue;

    visited[startVertex] = true;
    queue.push_back(startVertex);

    list<int>::iterator i;

    while (!queue.empty()) {
        int currVertex = queue.front();
        cout << "Visited " << currVertex << " ";
        queue.pop_front();

        for (i = adjLists[currVertex].begin(); i != adjLists[currVertex].end(); ++i) {
            int adjVertex = *i;
            if (!visited[adjVertex]) {
                visited[adjVertex] = true;
                queue.push_back(adjVertex);
            }
        }
    }
    resetGraph();
}
void Graph::DFS(int vertex) {
    //put it visited 
    visited[vertex] = true;
    //make a list with this node adjlist 
    list<int> adjList = adjLists[vertex];

    cout << vertex << " ";
    //in list there is a pointer called iterator (has begin and end)
    list<int>::iterator i;
    for (i = adjList.begin(); i != adjList.end(); ++i)
    {
        //make sure it not visited 
        if (!visited[*i])
            //call the function again 
            //*i take the value of the node
            DFS(*i);
    }
}

void Graph::resetGraph()
{
    visited = new bool[numVertices];
    for (int i = 0; i < numVertices; i++)
        visited[i] = false;
}
