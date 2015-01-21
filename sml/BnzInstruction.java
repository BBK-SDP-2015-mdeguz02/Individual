package sml;

/**
 * This class adds two numbers and stores in result register
 * 
 * @author Michael De Guzman
 */

public class BnzInstruction extends Instruction {

	private int register;
	private String nextInstruction;

	public BnzInstruction(String label, String op) {
		super(label, op);
	}

	public BnzInstruction(String label, int register, String nextInstruction) {
		this(label, "add");
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

