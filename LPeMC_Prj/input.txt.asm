push labelFun0
lfp
push 5
push 1 
push 1
lfp
lfp
push 1
sub
lw
js
print
halt
labelFun0 :
cfp
lra
lfp
push -2
sub
lw
push 0 
beq ELSELabel1 
lfp
push -1
sub
lw
lfp
push -3
sub
lw
add
b ENDIFLabel2 
ELSELabel1 : 
lfp
push -3
sub
lw
ENDIFLabel2 : 
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
