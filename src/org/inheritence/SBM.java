package org.inheritence;

public class SBM extends SBI{

	private void amountInSBM() {
		System.out.println("Amount in SBM is 6 crs");

	}
	private void amountFromSBI() {
		System.out.println("Amount from SBI is 4 crs");

	}
	public static void main(String[] args) {
		SBM s = new SBM();
		s.amountInSBM();
		s.amountFromSBI();
		s.amountInRBI();
		s.amountToSBI();
		s.amountInSBI();
		s.amountFromRBI();
		s.amountToSBM();
	}
}
