package facade;

public class DifficultProduct {

	char nameChars[] = new char[7];

	public DifficultProduct() {
		// TODO Auto-generated constructor stub
	}

	public void setFirstNameCharacter(char c) {

		nameChars[0] = c;

	}

	public void setSecondNameCharacter(char c) {

		nameChars[1] = c;

	}

	public void setThirdNameCharacter(char c) {

		nameChars[2] = c;

	}

	public void setFourthNameCharacter(char c) {

		nameChars[3] = c;

	}

	public void setFifthNameCharacter(char c) {

		nameChars[4] = c;

	}

	public void setSixthNameCharacter(char c) {

		nameChars[5] = c;

	}

	public void setSeventNameCharacter(char c) {

		nameChars[6] = c;

	}

	public String getName() {

		return new String(nameChars);

	}

}
