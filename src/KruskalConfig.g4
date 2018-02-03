grammar KruskalConfig;

// See BfsConfig.java for details

kruskalVisitedNodeColor     : 'kruskalVisitedNodeColor' '=' STRING;
kruskalCurrentNodeColor     : 'kruskalCurrentNodeColor' '='  STRING;
kruskalCurrentNodeShape     : 'kruskalCurrentNodeShape' '='  STRING;
kruskalVisitedNodeShape     : 'kruskalVisitedNodeShape' '=' STRING;
kruskalDpi                  : 'kruskalDpi' '=' STRING;
kruskalOutImageDir          : 'kruskalOutImageDir' '='  PATH;
kruskalPptName              : 'kruskalPptName' '=' STRING '.' STRING;


PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;