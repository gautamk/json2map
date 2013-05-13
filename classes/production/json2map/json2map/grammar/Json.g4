// Derived from http://json.org
// From http://pragprog.com/titles/tpantlr2/source_code
grammar Json;
@header {
         package json2map.grammar;
         }


json:   obj = object
    |   arr = array
    ;

object
    :   '{' pair (',' pair)* '}' 
    |   '{' '}'                  // empty object
    ;
pair:   key=STRING ':' val=value 
    ; 

array
    :   '[' value (',' value)* ']'
    |   '[' ']' // empty array
    ;

value
    :   STRING  # valueString
    |   NUMBER  # valueNumber
    |   obj=object  # valueObject // recursion
    |   arr=array   # valueArray // recursion
    |   'true'  # valueTrue // keywords
    |   'false' # valueFalse
    |   'null'  # valueNull
    ;

STRING :  '"' (ESC | ~["\\])* '"' ;

fragment ESC :   '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment HEX : [0-9a-fA-F] ;

NUMBER
    :   '-'? INT '.' INT EXP?   // 1.35, 1.35E-9, 0.3, -4.5
    |   '-'? INT EXP            // 1e10 -3e4
    |   '-'? INT                // -3, 45
    ;
fragment INT :   '0' | [1-9] [0-9]* ; // no leading zeros
fragment EXP :   [Ee] [+\-]? INT ; // \- since - means "range" inside [...]

WS  :   [ \t\n\r]+ -> skip ;
