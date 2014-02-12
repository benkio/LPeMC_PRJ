push labelFun0
push labelFun1
push labelFun2
lfp
push 10
lfp
push 2
sub
lw
lfp
push 2
lfp
push 1
sub
lw
lfp
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
push -1
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
labelFun1 :
cfp
lra
lfp
push -1
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
lra
lfp
lfp
push -6
sub
lw
lfp
push -3
sub
lfp
push -2
sub
lw
js
lfp
lfp
push -6
sub
lw
lfp
push -6
sub
lfp
push -5
sub
lw
js
add
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
