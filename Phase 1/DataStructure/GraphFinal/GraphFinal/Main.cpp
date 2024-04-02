#include "Graph.h"


int main()
{

	Graph g(4);
	g.addEdge(0, 1);
	g.addEdge(0, 2);
	g.addEdge(1, 2);
	g.addEdge(2, 0);
	g.addEdge(2, 3);
	g.addEdge(3, 3);
	g.DFS(0);

	g.BFS(0);
	cout << "\n bfs in the graph is ";
	cout << "     " << endl;
	

	return 0;
}
