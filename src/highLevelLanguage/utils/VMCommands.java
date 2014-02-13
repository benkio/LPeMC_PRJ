package highLevelLanguage.utils;

public enum VMCommands {
    PUSH {public String toString(){return "push";}}, // constant in the stack
    POP {public String toString(){return "pop";}}, // removes top of stack
    ADD {public String toString(){return "add";}}, // add two values from the stack
    SUB {public String toString(){return "sub";}}, // add two values from the stack
    MULT {public String toString(){return "mult";}}, // add two values from the stack
    DIV {public String toString(){return "div";}}, // add two values from the stack
    B {public String toString(){return "b";}}, // jump to label
    BLESS {public String toString(){return "bless";}}, // jump to label if top <= next
    BGREAT {public String toString(){return "bgreat";}}, // jump to label if top >= next
    PRINT {public String toString(){return "print";}}, // print top of stack
    HALT {public String toString(){return "halt";}}, // Exit the program
    SW {public String toString(){return "sw";}}, // Push in the address at the top of the stack the value under the top of the stack.
    LW {public String toString(){return "lw";}}, // Push in the stack the value of the cell with the address of the top of the stack.
    BEQ {public String toString(){return "beq";}}, // Jump to label if top = next
    JS {public String toString(){return "js";}}, // Save in ra register the current instruction pointer value and jump to the instruction address in the top of the stack
    LRA {public String toString(){return "lra";}}, // Push the value of ra register at the top of the stack
    SRA {public String toString(){return "sra";}}, // Set the ra register with the top of the stack
    LRV {public String toString(){return "lrv";}}, // Push the rv register at the top of the stack
    SRV {public String toString(){return "srv";}}, // Set the rv register with the top of the stack
    LHP {public String toString(){return "lhp";}}, // Push the hp register at the top of the stack
    SHP {public String toString(){return "shp";}}, // Set the hp register with the top of the stack
    LFP {public String toString(){return "lfp";}}, // Push the fp register at the top of the stack
    SFP {public String toString(){return "sfp";}}, // Set the fp register with the top of the stack
    CFP {public String toString(){return "cfp";}} // Copy the stack pointer value in the fp register
}
