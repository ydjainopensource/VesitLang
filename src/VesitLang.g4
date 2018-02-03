grammar VesitLang;

import DfsConfig , BfsConfig,KruskalConfig;


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


expression  : graph EOF
//            | graph kruskal EOF
            ;

graph :   GRAPH '{' edges '}' action_list
//        | GRAPH '{' edges '}' dfs
//        | GRAPH '{' edges '}' bfs dfs
//        | GRAPH '{' edges '}' dfs bfs
//        | GRAPH '{' edges '}' action*
        | GRAPH '{' edges '}'
        ;

action_list : action action_list
            | action // action_list
            ;

action  : bfs
        | dfs
        | kruskal
        ;


GRAPH : 'graph';

DIGRAPH :'digraph';

BFS : 'bfs' ;

DFS : 'dfs';

KRUSKAL :'kruskal';

PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;