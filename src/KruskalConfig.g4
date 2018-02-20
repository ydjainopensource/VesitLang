grammar KruskalConfig;

// See BfsConfig.java for details

kruskalVisitedNodeColor     : 'kruskalVisitedNodeColor' '=' STRING;
kruskalCurrentNodeColor     : 'kruskalCurrentNodeColor' '='  STRING;
kruskalCurrentNodeShape     : 'kruskalCurrentNodeShape' '='  STRING;
kruskalVisitedNodeShape     : 'kruskalVisitedNodeShape' '=' STRING;
kruskalDpi                  : 'kruskalDpi' '=' INT;
kruskalOutImageDir          : 'kruskalOutImageDir' '='  PATH;
kruskalPptName              : 'kruskalPptName' '=' STRING '.' STRING;
kruskalCurrentEdgeColor     : 'kruskalCurrentEdgeColor' '=' STRING;
kruskalCurrentEdgeWidth     : 'kruskalCurrentEdgeWidth' '=' STRING;
kruskalVisitedEdgeWidth     : 'kruskalVisitedEdgeWidth' '=' STRING;
kruskalVisitedEdgeColor     : 'kruskalVisitedEdgeColor' '=' STRING;

PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;