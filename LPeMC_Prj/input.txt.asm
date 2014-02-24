push labelFun0
lfp
push 0 
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
lra
lfp
lw
push 2
sub
lw
srv
sra
pop
pop
sfp
lrv
lra
js
labelFun2 :
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
push labelFun2
lra
lfp
push -2
sub
lw
push 1 
beq EQLabel7 
push 0 
b NEQLabel8 
EQLabel7 : 
push 1 
NEQLabel8 : 
push 0
 beq FALSELabel6
 lfp
lfp
push 1
sub
lw
lfp
lfp
push 4
sub
lw
js
lfp
push -1
sub
lw
push 1
sub
bless LEQLabel9
 push 0
 b ContinueLabel10
 LEQLabel9: 
push 1
 ContinueLabel10: 
push 0
 beq FALSELabel6
 push 1
 b TRUELabel5
 FALSELabel6: 
push 0
 TRUELabel5: 
push 0 
beq ELSELabel3 
lfp
push 1
lfp
lfp
push 3
sub
lw
js
lfp
push 1
sub
lw
sub
b ENDIFLabel4 
ELSELabel3 : 
lfp
push 1
sub
lw
lfp
push 2
sub
lw
add
ENDIFLabel4 : 
srv
sra
pop
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
