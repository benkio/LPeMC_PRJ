package firstVMProject;

public class ExecuteVM {

	public static final int MEMSIZE = 10000;
	public static final int CODESIZE = 10000;

	private int[] code;
	private int[] memory = new int[MEMSIZE]; // Stack Memory

	private int ip = 0; // Instraction Pointer
	private int sp = MEMSIZE; // Stack Pointer

	/*
	 * Registry
	 * 
	 * In order: - Return Address - Return Value - Heap Pointer - Frame Pointer
	 */

	private int ra, rv, hp = 0, fp = MEMSIZE;

	public ExecuteVM(int[] code) {

		this.code = code;
	}

	// /
	// / Start of the executors
	// / Run instructions until halt
	// /
	public void cpu() {

		int bytecode;
		int v1, v2;
		int address;
		while (true) {
			bytecode = code[ip++]; // fetch
			switch (bytecode) {
			// Stack Operations
			case VMParser.PUSH:
				push(code[ip++]);
				break;
			case VMParser.POP:
				pop();
				break;
			// Two Parameters Operations
			// Two values in Stack removed
			case VMParser.ADD:
				v2 = pop();
				v1 = pop();
				push(v1 + v2);
				break;
			case VMParser.SUB:
				v2 = pop();
				v1 = pop();
				push(v1 - v2);
				break;
			case VMParser.MULT:
				v2 = pop();
				v1 = pop();
				push(v1 * v2);
				break;
			case VMParser.DIV:
				v2 = pop();
				v1 = pop();
				push(v1 / v2);
				break;

			/* Added by Benkio :D */
			case VMParser.SW:
				address = pop();
				v2 = pop();
				memory[address] = v2;
				break;
			case VMParser.LW:
				address = pop();
				push(memory[address]);
				break;
			case VMParser.BRANCHEQUAL:
				address = code[ip++];
				v2 = pop();
				v1 = pop();
				if (v1 == v2)
					ip = address;
				break;
			case VMParser.JS:
				ra = ip;
				address = pop();
				ip = address;
				break;
			/* Register <-> stack operations */
			case VMParser.LRA:
				push(ra);
				break;
			case VMParser.SRA:
				ra = pop();
				break;
			case VMParser.LRV:
				push(rv);
				break;
			case VMParser.SRV:
				rv = pop();
				break;
			case VMParser.LHP:
				push(hp);
				break;
			case VMParser.SHP:
				hp = pop();
				break;
			case VMParser.LFP:
				push(fp);
				break;
			case VMParser.SFP:
				fp = pop();
				break;
			case VMParser.CFP:
				fp = sp;
				break;

			// Set the Instruction Pointer to top of the stack. (Jump)
			// 3 stack values removed
			case VMParser.BRANCH:
				address = code[ip++];
				ip = address;
				break;
			// Jump only if the second elements is great than the first
			case VMParser.BRANCHLESS:
				address = code[ip++];
				v2 = pop();
				v1 = pop();
				if (v1 <= v2)
					ip = address;
				break;
			// Simply print the top of the stack
			case VMParser.PRINT:
				System.out.println(memory[sp]);
				break;
			// Exit Executor.
			case VMParser.HALT:
				return;
			}
		}
	}

	// /
	// /Return the current top of the stack and increment the stack pointer
	// /
	private int pop() {

		return memory[sp++];
	}

	// /
	// /Decrement the stack pointer and set it to the parameter
	// /
	private void push(int b) {

		memory[--sp] = b;
	}

}