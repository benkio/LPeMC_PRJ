push labelFun0
push labelFun1
push labelFun2
lfp
push 10
push 10
lfp
lfp
push 3
sub
lw
js
print
halt
labelFun0 :
cfp
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
push -3
sub
lfp
push -4
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
labelFun1 :
cfp
lra
lfp
push -1
sub
lw
lfp
push -2
sub
lw
add
srv
sra
pop
pop
pop
sfp
lrv
lra
js
labelFun2 :
cfp
lra
lfp
lfp
lw
push 2
sub
lw
lfp
lw
push 10
push 10
lfp
lw
lfp
lw
push 1
sub
lw
js
srv
sra
pop
pop
pop
sfp
lrv
lra
js
