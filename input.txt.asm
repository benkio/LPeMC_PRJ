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
lfp
push 1
sub
lw
push 1
beq EQLabel4 
push 0 
b NEQLabel5 
EQLabel4 : 
push 1 
NEQLabel5 : 
push 1
beq TRUELabel2
lfp
push 2
sub
lw
push 3
beq EQLabel6 
push 0 
b NEQLabel7 
EQLabel6 : 
push 1 
NEQLabel7 : 
push 1
beq TRUELabel2
push 0
b FALSELabel3
TRUELabel2: 
push 1
FALSELabel3: 
push 0 
beq ELSELabel0 
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
b ENDIFLabel1 
ELSELabel0 : 
push 10
print
ENDIFLabel1 : 
halt
