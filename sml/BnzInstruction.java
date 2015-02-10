package sml;

/**
 * If the contents of register s1 is not zero, then make the statement labeled
 * L2 the next one to execute
 * 
 * @author Michael De Guzman
 */

public class BnzInstruction extends Instruction {

	private int register;
	private String nextInstruction;

	public BnzInstruction(String label, String opcode) {
		super(label, opcode);
	}

	public BnzInstruction(String label, int register, String nextInstruction) {
		this(label, "bnz");
		this.register = register;
		this.nextInstruction = nextInstruction;
	}

	@Override
	public void execute(Machine m) {
		int value1 = m.getRegisters().getRegister(register);
		if (value1 != 0) {
			int next = m.getLabels().indexOf(nextInstruction);
			m.setPc(next);
		}
	}

	@Override
	public String toString() {
		return super.toString() + " register " + register;
	}
}

