push 10
push 3
add
push 11
lfp
push 1
sub
lw
mult
push 1
push labelFun0
push labelFun1
lfp
push 1
sub
lw
lfp
push 2
sub
lw
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
push 2
sub
lw
mult
print
b ENDIFLabel7 
ELSELabel6 : 
lfp
lfp
push 3
sub
lw
lfp
lfp
push 5
sub
lw
js
push 0 
beq ELSELabel10 
lfp
lfp
push 2
sub
lw
push 1
add
lfp
lfp
push 4
sub
lw
js
push 2
mult
print
b ENDIFLabel11 
ELSELabel10 : 
lfp
lfp
push 3
sub
lw
lfp
lfp
push 4
sub
lw
js
print
ENDIFLabel11 : 
ENDIFLabel7 : 
halt
labelFun0 :
cfp
lra
lfp
push -1
sub
lw
push 5
add
srv
sra
pop
pop
sfp
lrv
lra
js
labelFun1 :
cfp
lra
lfp
push -1
sub
lw
push 1
beq EQLabel4 
push 0 
b NEQLabel5 
EQLabel4 : 
push 1 
NEQLabel5 : 
push 0 
beq ELSELabel2 
push 1 
b ENDIFLabel3 
ELSELabel2 : 
push 0 
ENDIFLabel3 : 
srv
sra
pop
pop
sfp
lrv
lra
js
