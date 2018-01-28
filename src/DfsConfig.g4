grammar DfsConfig;


// Parser

dfsStackNodeColor   : 'dfsStackNodeColor' '=' STRING;
dfsStackNodeShape   : 'dfsStackNodeShape' '=' STRING;
dfsVisitedNodeColor : 'dfsVisitedNodeColor' '=' STRING;
dfsVisitedNodeShape : 'dfsVisitedNodeShape' '=' STRING;
dfsDpi              : 'dfsDpi' '=' STRING;
dfsOutImageDir      : 'dfsOutImageDir' '=' PATH;
dfsPptName          : 'dfsPptName' '=' STRING '.' STRING ;


PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;