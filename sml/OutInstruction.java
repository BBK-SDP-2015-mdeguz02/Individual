package sml;

/**
 * This class prints the contents of one register
 * 
 * @author Michael De Guzman
 */

public class OutInstruction extends Instruction {
	private int register;
	private int value;

	public OutInstruction(String label, String opcode) {
		super(label, opcode);
	}

	public OutInstruction(String label, int register) {
		super(label, "out");
		this.register = register;
	}

	@Override
	public void execute(Machine m) {
		value = m.getRegisters().getRegister(register);
		System.out.println("The contents of register " + register + " is " + value);
	}

	@Override
	public String toString() {
		return super.toString() + " register " + register;
	}
}
