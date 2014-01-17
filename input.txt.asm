push labelFun0
lfp
push 1 
push 0 
push 1 
push -1
push 1
lhp
add
sw
lhp
sw
lhp
push 2
lhp
add
shp
push 1
lhp
add
sw
lhp
sw
lhp
push 2
lhp
add
shp
push 1
lhp
add
sw
lhp
sw
lhp
push 2
lhp
add
shp
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
push -1
sub
lw
push -1
beq EQLabel3 
push 0 
b NEQLabel4 
EQLabel3 : 
push 1 
NEQLabel4 : 
push 0 
beq ELSELabel1 
push 0
b ENDIFLabel2 
ELSELabel1 : 
push 1
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
add
ENDIFLabel2 : 
srv
sra
pop
pop
sfp
lrv
lra
js
