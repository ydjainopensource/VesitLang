# VesitLang
VesitLang is a tiny DSL which aims to make learning graph algorithms easier.

It 

## System Requirements
1. Java 8 or above
1. Graphviz dot package
1. Ubuntu 16.04 or above

## Syntax

A graph is started by `graph` keyword.
A graph may have multiple edges. 
Typical syntax of an edge is `from a to b` here a and b are names of the starting and ending nodes.
By default edges have an associated cost of 0.
Weighted edges may have an optional `cost` attribute which represents the cost of the edge.

# Parser 

```antlr
graph   : GRAPH '{' edges '}' action_list
        | GRAPH '{' edges '}'
        ;

edges : edge+
      ;

edge  : FROM from TO to 'cost' INT
      | FROM from TO to
      ;

from : STRING
     ;

to  : STRING
   ;


action_list : action action_list
            | action // action_list
            ;

action  : bfs
        | dfs
        | kruskal
        | prim
        ;

bfs : BFS STRING '{' bfsproperties* '}'
    | BFS STRING
    ;


dfs : DFS STRING '{' dfsproperties* '}'
    | DFS STRING
    ;

kruskal : KRUSKAL '{' kruskalproperties* '}'
        | KRUSKAL
        ;

prim    : PRIM '{' primproperties '}'
        | PRIM
        ;

bfsproperties : bfsQueuedNodeColor
              | bfsVisitedNodeColor
              | bfsCurrentNodeColor
              | bfsCurrentNodeShape
              | bfsQueuedNodeShape
              | bfsVisitedNodeShape
              | bfsDpi
              | bfsOutImageDir
              | bfsPptName
                ;


kruskalproperties : kruskalVisitedNodeColor
                  | kruskalCurrentNodeColor
                  | kruskalCurrentNodeShape
                  | kruskalVisitedNodeShape
                  | kruskalDpi
                  | kruskalOutImageDir
                  | kruskalPptName
                  | kruskalCurrentEdgeColor
                  | kruskalCurrentEdgeWidth
                  | kruskalVisitedEdgeWidth
                  | kruskalVisitedEdgeColor
                  ;

primproperties    : primVisitedNodeColor
                  | primCurrentNodeColor
                  | primCurrentNodeShape
                  | primVisitedNodeShape
                  | primDpi
                  | primOutImageDir
                  | primPptName
                  | primCurrentEdgeColor
                  | primCurrentEdgeWidth
                  | primVisitedEdgeWidth
                  | primVisitedEdgeColor
                  ;

dfsproperties : dfsStackNodeColor
              | dfsStackNodeShape
              | dfsVisitedNodeColor
              | dfsVisitedNodeShape
              | dfsDpi
              | dfsOutImageDir
              | dfsPptName
                ;
```

<-----!
### Properties 


1. `<Action>VisitedNodeShape` : set   to
1. `<Action>VisitedNodeColor` : set  
1. `<Action>VisitedEdgeWidth` : set   to
1. `<Action>VisitedEdgeColor` : set   to
1. `<Action>CurrentNodeColor` : set   to
1. `<Action>CurrentNodeShape` : set   to
1. `<Action>CurrentEdgeColor` : set   to
1. `<Action>CurrentEdgeWidth` : set   to
1. `<Action>QueuedNodeShape`  : set   to
1. `<Action>QueuedNodeColor`  : set   to
1. `<Action>StackNodeColor`   : set   to
1. `<Action>StackNodeShape`   : set   to
1. `<Action>Dpi`              : set   to
1. `<Action>OutImageDir`      : set   to
1. `<Action>PptName`          : set   to
    
