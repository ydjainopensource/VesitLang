grammar VesitLang;

import DfsConfig , BfsConfig,KruskalConfig, PrimConfig;


bfs : BFS STRING '{' bfsproperties* '}'
    | BFS STRING
    ;

//dfstraversal : (('d'|'D')('F'|'f')('s'|'S')) STRING;
dfs : DFS STRING '{' dfsproperties* '}'
    | DFS STRING
    ;

kruskal : KRUSKAL '{' kruskalproperties* '}'
        | KRUSKAL
        ;

prim    : PRIM '{' primproperties* '}'
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

edges : edge+
      ;

edge  : FROM from TO to 'cost' INT
      | FROM from TO to
      ;

from : STRING
     ;

to  : STRING
   ;

graph   : GRAPH '{' edges '}' action_list
        | GRAPH '{' edges '}'
        ;

action_list : action action_list
            | action // action_list
            ;

action  : bfs
        | dfs
        | kruskal
        | prim
        ;


GRAPH : 'graph';

DIGRAPH :'digraph';

BFS : 'bfs' ;

DFS : 'dfs';

KRUSKAL :'kruskal';

PRIM    : 'prim';

PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;