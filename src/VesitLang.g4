grammar VesitLang;

import DfsConfig , BfsConfig;


bfs : 'bfs' STRING '{' bfsproperties* '}'
    | 'bfs' STRING
    ;

//dfstraversal : (('d'|'D')('F'|'f')('s'|'S')) STRING;
dfs : 'dfs' STRING '{' dfsproperties* '}'
    | 'dfs' STRING
    ;

graph : 'graph' '{' edges '}' bfs
        |'graph' '{' edges '}' dfs
        |'graph' '{' edges '}' bfs dfs
        |'graph' '{' edges '}' dfs bfs
        | 'graph' '{' edges '}'
        ;
//digraph : 'digraph' '{' edges '}' bfs
//        | 'digraph' '{' edges '}' dfs
//        | 'digraph' '{' edges '}' bfs dfs
//        | 'digraph' '{' edges '}' dfs bfs
//        | 'digraph' '{' edges '}'
//        ;


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


PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;