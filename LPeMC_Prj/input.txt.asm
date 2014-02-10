push 10
push labelFun0
lfp
push 3
push 1
lfp
lfp
push 2
sub
lw
js
print
halt
labelFun1 :
cfp
lra
lfp
push -2
sub
lw
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
push 100
push labelFun1
lra
lfp
push 1
push 1
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
