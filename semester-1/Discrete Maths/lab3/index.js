const { performance } = require('perf_hooks');

let V = 21;

// Returns true if there is a path from source
// 's' to sink 't' in residual graph. Also
// fills parent[] to store the path
function bfs(rGraph, s, t, parent) {
  // Create a visited array and mark all
  // vertices as not visited
  let visited = new Array(V);
  for (let i = 0; i < V; ++i) visited[i] = false;
  // Create a queue, enqueue source vertex
  // and mark source vertex as visited
  let queue = [];
  queue.push(s);
  visited[s] = true;
  parent[s] = -1;
  // Standard BFS Loop
  while (queue.length != 0) {
    let u = queue.shift();

    for (let v = 0; v < V; v++) {
      if (visited[v] == false && rGraph[u][v] > 0) {
        // If we find a connection to the sink
        // node, then there is no point in BFS
        // anymore We just have to set its parent
        // and can return true
        if (v == t) {
          parent[v] = u;
          return true;
        }
        queue.push(v);
        parent[v] = u;
        visited[v] = true;
      }
    }
  }

  // We didn't reach sink in BFS starting
  // from source, so return false
  return false;
}

// Returns the maximum flow from s to t in
// the given graph
function fordFulkerson(graph, s, t) {
  let u, v;

  // Create a residual graph and fill the
  // residual graph with given capacities
  // in the original graph as residual
  // capacities in residual graph

  // Residual graph where rGraph[i][j]
  // indicates residual capacity of edge
  // from i to j (if there is an edge.
  // If rGraph[i][j] is 0, then there is
  // not)
  let rGraph = new Array(V);

  for (u = 0; u < V; u++) {
    rGraph[u] = new Array(V);
    for (v = 0; v < V; v++) rGraph[u][v] = graph[u][v];
  }
  // This array is filled by BFS and to store path
  let parent = new Array(V);

  // There is no flow initially
  let max_flow = 0;

  // Augment the flow while there
  // is path from source to sink
  while (bfs(rGraph, s, t, parent)) {
    // Find minimum residual capacity of the edhes
    // along the path filled by BFS. Or we can say
    // find the maximum flow through the path found.
    let path_flow = Number.MAX_VALUE;
    for (v = t; v != s; v = parent[v]) {
      u = parent[v];
      path_flow = Math.min(path_flow, rGraph[u][v]);
    }
    // Update residual capacities of the edges and
    // reverse edges along the path
    for (v = t; v != s; v = parent[v]) {
      u = parent[v];
      rGraph[u][v] -= path_flow;
      rGraph[v][u] += path_flow;
    }

    // Add path flow to overall flow
    max_flow += path_flow;
  }

  // Return the overall flow
  return max_flow;
}

// Driver code

// Let us create a graph shown in the above example

//8
let graph1 = [
  [0, 4, 0, 0, 4, 0, 0, 0, 0],
  [0, 0, 7, 3, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 9, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 6, 8],
  [0, 0, 0, 7, 0, 8, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 5, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 10],
  [0, 0, 0, 0, 0, 0, 0, 0, 3],
  [0, 0, 0, 0, 0, 0, 0, 0, 0],
];

//10
let graph2 = [
  [0, 4, 7, 4, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 7, 6, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 10],
  [0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
];
//12
let graph3 = [
  [0, 6, 4, 7, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 7, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 7, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 8, 0, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 9, 0, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 9, 8, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5],
  [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0],
];

var startTime = performance.now()

// console.log(fordFulkerson(graph1, 0, 8));
// console.log(fordFulkerson(graph2, 0, 10));
console.log(fordFulkerson(graph3, 0, 20));
    
var endTime = performance.now()

console.log(`Call to ford fulkerson took ${endTime - startTime} milliseconds`)


