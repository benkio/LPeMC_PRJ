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
			
			//Decode
			switch (bytecode) {
			
			case VMParser.PUSH:
				//System.out.println("PUSH");
				push(code[ip++]);
				break;
				
			case VMParser.POP:
				//System.out.println("POP");
				pop();
				break;
				
			case VMParser.ADD:
				//System.out.println("ADD");
				v2 = pop();
				v1 = pop();
				push(v1 + v2);
				break;
				
			case VMParser.SUB:
				//System.out.println("SUB");
				v2 = pop();
				v1 = pop();
				push(v1 - v2);
				break;
				
			case VMParser.MULT:
				//System.out.println("MULT");
				v2 = pop();
				v1 = pop();
				push(v1 * v2);
				break;
				
			case VMParser.DIV:
				//System.out.println("DIV");
				v2 = pop();
				v1 = pop();
				push(v1 / v2);
				break;

			case VMParser.SW:
				//System.out.println("SW");
				address = pop();
				v2 = pop();
				memory[address] = v2;
				break;
				
			case VMParser.LW:
				//System.out.println("LW");
				address = pop();
				push(memory[address]);
				break;
				
			case VMParser.BRANCHEQUAL:
				//System.out.println("BRANCHEQUAL");
				address = code[ip++];
				v2 = pop();
				v1 = pop();
				if (v1 == v2)
					ip = address;
				break;
				
			case VMParser.JS:
				//System.out.println("JS");
				ra = ip;
				address = pop();
				ip = address;
				break;
				
			case VMParser.LRA:
				//System.out.println("LRA");
				push(ra);
				break;
				
			case VMParser.SRA:
				//System.out.println("SRA");
				ra = pop();
				break;
				
			case VMParser.LRV:
				//System.out.println("LRV");
				push(rv);
				break;
				
			case VMParser.SRV:
				//System.out.println("SRV");
				rv = pop();
				break;
				
			case VMParser.LHP:
				//System.out.println("LHP");
				push(hp);
				break;
				
			case VMParser.SHP:
				//System.out.println("SHP");
				hp = pop();
				break;
				
			case VMParser.LFP:
				//System.out.println("LFP");
				push(fp);
				break;
				
			case VMParser.SFP:
				//System.out.println("SFP");
				fp = pop();
				break;
				
			case VMParser.CFP:
				//System.out.println("CFP");
				fp = sp;
				break;


			case VMParser.BRANCH:
				//System.out.println("BRANCH");
				address = code[ip++];
				ip = address;
				break;

			case VMParser.BRANCHLESS:
				//System.out.println("BRANCHLESS");
				address = code[ip++];
				v2 = pop();
				v1 = pop();
				if (v1 <= v2)
					ip = address;
				break;
				
			case VMParser.BRANCHGREAT:
				//System.out.println("BRANCHGREAT");
				address = code[ip++];
				v2 = pop();
				v1 = pop();
				if (v1 >= v2)
					ip = address;
				break;
				
			case VMParser.PRINT:
				//System.out.println("PRINT");
				System.out.println(memory[sp]);
				break;
				
				
			case VMParser.HALT:
				//System.out.println("HALT");
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