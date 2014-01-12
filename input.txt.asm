push 1
push 3
push 25
push 5
div
add
push 2
push 2
add
push 2
add
push 3
div
add
push 2
push 6
mult
push 4
div
push 1 
push 0
 beq FALSELabel1
 lfp
push 1
sub
lw
lfp
push 3
sub
lw
add
push 4
beq EQLabel2 
push 0 
b NEQLabel3 
EQLabel2 : 
push 1 
NEQLabel3 : 
push 0
 beq FALSELabel1
 push 1
 b TRUELabel0
 FALSELabel1: 
push 0
 TRUELabel0: 
lfp
push 3
sub
lw
lfp
push 2
sub
lw
bgreat GEQLabel6
 push 0
 b ContinueLabel7
 GEQLabel6: 
push 1
 ContinueLabel7: 
push 0 
beq ELSELabel4 
lfp
push 1
sub
lw
push 4
add
lfp
push 2
sub
lw
sub
lfp
push 3
sub
lw
add
print
b ENDIFLabel5 
ELSELabel4 : 
push 10
print
ENDIFLabel5 : 
halt
