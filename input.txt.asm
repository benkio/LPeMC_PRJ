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
push labelFun4
lfp
push 3
sub
lw
lfp
push 2
sub
lw
bless LEQLabel7
 push 0
 b ContinueLabel8
 LEQLabel7: 
push 1
 ContinueLabel8: 
push 0 
beq ELSELabel5 
lfp
push 1
sub
lw
lfp
lfp
push 4
sub
lw
lfp
lfp
push 5
sub
lw
js
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
b ENDIFLabel6 
ELSELabel5 : 
push 10
print
ENDIFLabel6 : 
halt
labelFun4 :
cfp
lra
push 4
srv
sra
pop
pop
sfp
lrv
lra
js
