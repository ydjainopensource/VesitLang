grammar PrimConfig;

primVisitedNodeColor     : 'primVisitedNodeColor' '=' STRING;
primCurrentNodeColor     : 'primCurrentNodeColor' '='  STRING;
primCurrentNodeShape     : 'primCurrentNodeShape' '='  STRING;
primVisitedNodeShape     : 'primVisitedNodeShape' '=' STRING;
primDpi                  : 'primDpi' '=' INT;
primOutImageDir          : 'primOutImageDir' '='  PATH;
primPptName              : 'primPptName' '=' STRING '.' STRING;
primCurrentEdgeColor     : 'primCurrentEdgeColor' '=' STRING;
primCurrentEdgeWidth     : 'primCurrentEdgeWidth' '=' STRING;
primVisitedEdgeWidth     : 'primVisitedEdgeWidth' '=' STRING;
primVisitedEdgeColor     : 'primVisitedEdgeColor' '=' STRING;



PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;