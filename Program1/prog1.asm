.var GPIO1 = $8000

.pc = $200  "Main"
        lda   #0
        sta   $0

loop:
        lda   $0
        sta   GPIO1
        inc   $0
        jmp   loop
