package highLevelLanguage.utils;

public enum VMCommands {
	push, // constant in the stack
	pop, // removes top of stack
	add, // add two values from the stack
	sub, // add two values from the stack
	mult, // add two values from the stack
	div, // add two values from the stack
	b, // jump to label
	bless, // jump to label if top < next
	print, // print top of stack
	halt, // Exit the program
	sw, // Push in the address at the top of the stack the value under the top
		// of the stack.
	lw, // Push in the stack the value of the cell with the address of the top
		// of the stack.
	beq, // Jump to label if top = next
	js, // Save in ra register the current instruction pointer value and jump to
		// the instruction address in the top of the stack
	lra, // Push the value of ra register at the top of the stack
	sra, // Set the ra register with the top of the stack
	lrv, // Push the rv register at the top of the stack
	srv, // Set the rv register with the top of the stack
	lhp, // Push the hp register at the top of the stack
	shp, // Set the hp register with the top of the stack
	lfp, // Push the fp register at the top of the stack
	sfp, // Set the fp register with the top of the stack
	cfp // Copy the stack pointer value in the fp register
}
