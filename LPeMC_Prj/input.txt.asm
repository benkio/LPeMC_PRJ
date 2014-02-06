push labelFun0
lfp
push 1 
push 10
lfp
lfp
push 1
sub
lw
js
print
halt
labelFun1 :
cfp
lfp
lw
push -1
sub
lw
lfp
push -1
sub
lw
lfp
lw
push 2
sub
lw
push 2
div
sub
add
lra
lfp
push -1
sub
lw
lfp
push 1
sub
lw
push 2
div
sub
srv
sra
pop
pop
pop
sfp
lrv
lra
js
labelFun0 :
cfp
lfp
push -1
sub
lw
push 2
div
push 4
mult
lfp
push -1
sub
lw
push 2
mult
push labelFun1
lra
lfp
push -2
sub
lw
push 1 
beq EQLabel6 
push 0 
b NEQLabel7 
EQLabel6 : 
push 1 
NEQLabel7 : 
push 0
 beq FALSELabel5
 lfp
lfp
push 1
sub
lw
lfp
lfp
push 3
sub
lw
js
lfp
push -1
sub
lw
push 1
sub
bless LEQLabel8
 push 0
 b ContinueLabel9
 LEQLabel8: 
push 1
 ContinueLabel9: 
push 0
 beq FALSELabel5
 push 1
 b TRUELabel4
 FALSELabel5: 
push 0
 TRUELabel4: 
push 0 
beq ELSELabel2 
lfp
push 2
sub
lw
lfp
push 1
sub
lw
sub
b ENDIFLabel3 
ELSELabel2 : 
lfp
push 1
sub
lw
lfp
push 2
sub
lw
add
ENDIFLabel3 : 
srv
sra
pop
pop
pop
pop
pop
pop
sfp
lrv
lra
js
