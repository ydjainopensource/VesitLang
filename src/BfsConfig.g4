grammar BfsConfig;

// See BfsConfig.java for details

bfsQueuedNodeColor      : 'bfsQueuedNodeColor' '=' STRING;
bfsVisitedNodeColor     : 'bfsVisitedNodeColor' '=' STRING;
bfsCurrentNodeColor     : 'bfsCurrentNodeColor' '='  STRING;
bfsCurrentNodeShape     : 'bfsCurrentNodeShape' '='  STRING;
bfsQueuedNodeShape      : 'bfsQueuedNodeShape' '=' STRING;
bfsVisitedNodeShape     : 'bfsVisitedNodeShape' '=' STRING;
bfsDpi                  : 'bfsDpi' '=' STRING;
bfsOutImageDir          : 'bfsOutImageDir' '='  PATH;
bfsPptName              : 'bfsPptName' '=' STRING '.' STRING;


PATH : (STRING'/')+;

FROM: 'from';

TO  : 'to';

STRING  : CHAR+;

CHAR    :[a-zA-Z];

INT     : [0-9]+ ;

// ignore whitespace
WS : [ \t\r\n]+ -> skip ;