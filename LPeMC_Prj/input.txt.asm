push labelFun0
lfp
push 1
sub
lw
lfp
halt
labelFun1 :
cfp
lra
lfp
push -1
sub
lw
push -1
beq EQLabel4 
push 0 
b NEQLabel5 
EQLabel4 : 
push 1 
NEQLabel5 : 
push 0 
beq ELSELabel2 
push 0
b ENDIFLabel3 
ELSELabel2 : 
lfp
lfp
push -1
sub
lw
push 1 
add
lw
lfp
lw
lfp
lw
push 1
sub
lw
js
ENDIFLabel3 : 
srv
sra
pop
pop
sfp
lrv
lra
js
labelFun0 :
cfp
push labelFun1
lra
lfp
lfp
push -1
sub
lw
lfp
lfp
push 1
sub
lw
js
lfp
lfp
push -2
sub
lw
lfp
lfp
push 1
sub
lw
js
beq EQLabel8 
push 0 
b NEQLabel9 
EQLabel8 : 
push 1 
NEQLabel9 : 
push 0 
beq ELSELabel6 
lfp
lfp
push -1
sub
lw
lfp
lfp
push 1
sub
lw
js
b ENDIFLabel7 
ELSELabel6 : 
push 0
ENDIFLabel7 : 
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
