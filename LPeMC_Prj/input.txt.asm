push labelFun0
lfp
push 10
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
lfp
push -3
sub
lw
lfp
push -3
sub
lw
lfp
push -2
sub
lw
js
srv
sra
pop
pop
pop
pop
sfp
lrv
lra
js
labelFun3 :
cfp
lra
lfp
push -1
sub
lw
lfp
push -1
sub
lw
mult
push 100
bgreat GEQLabel6
 push 0
 b ContinueLabel7
 GEQLabel6: 
push 1
 ContinueLabel7: 
push 0 
beq ELSELabel4 
push 1 
b ENDIFLabel5 
ELSELabel4 : 
push 0 
ENDIFLabel5 : 
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
push labelFun3
lra
lfp
lfp
push -1
sub
lw
lfp
push 1
sub
lw
lfp
lfp
lw
lfp
lw
push 1
sub
lw
js
push 0
 beq NotLabel10
 push 0
 b FALSELabel11
 NotLabel10: 
push 1
 FALSELabel11: 
push 0 
beq ELSELabel8 
lfp
push -2
sub
lw
lfp
push -1
sub
lw
add
b ENDIFLabel9 
ELSELabel8 : 
lfp
push -2
sub
lw
lfp
push -1
sub
lw
mult
ENDIFLabel9 : 
srv
sra
pop
pop
pop
pop
sfp
lrv
lra
js
labelFun0 :
cfp
push labelFun1
push labelFun2
lra
lfp
lfp
push -2
sub
lw
lfp
push -1
sub
lw
lfp
lfp
push 2
sub
lw
js
srv
sra
pop
pop
pop
pop
pop
sfp
lrv
lra
js
