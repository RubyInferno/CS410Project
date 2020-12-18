grammar MapGenerationLanguage
/*
 * Parser Rules
 */
chat                : line line EOF ;
line                : name THE opinion NEWLINE;
name                : WORD ;
opinion             : TEXT ;
/*
 * Lexer Rules
 */
fragment H          : ('H'|'h') ;
fragment T          : ('T'|'t') ;
fragment E          : ('E'|'e') ;
fragment U          : ('U'|'u') ;
fragment R          : ('R'|'r') ;
fragment B          : ('B'|'b') ;
fragment S          : ('S'|'s') ;
fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
THE                 : T H E ;
WORD                : (LOWERCASE | UPPERCASE)+ ;
TEXT                : '"' .*? '"' ;
WHITESPACE          : (' '|'t')+ -> skip ;
NEWLINE             : ('r'? 'n' | 'r')+ ;

