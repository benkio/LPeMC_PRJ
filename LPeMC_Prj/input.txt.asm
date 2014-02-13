push labelFun0
lfp
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
push labelFun1
push labelFun2
lra
lfp
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
sfp
lrv
lra
js
