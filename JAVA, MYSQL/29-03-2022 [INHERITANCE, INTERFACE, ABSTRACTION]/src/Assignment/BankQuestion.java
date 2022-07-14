package Assignment;

abstract class GeneralBank {
	abstract double getSavingInterestRate(double interest);

	abstract double getFixedDepositInterestRate(double interest);
}

class ICICI extends GeneralBank {
	double getSavingInterestRate(double interest) {
		return interest;
	}

	double getFixedDepositInterestRate(double interest) {
		return interest;
	}
}

class SBI extends GeneralBank {
	double getSavingInterestRate(double interest) {
		return interest;
	}

	double getFixedDepositInterestRate(double interest) {
		return interest;
	}
}

public class BankQuestion {
	public static void main(String args[]) {
		ICICI b1 = new ICICI();
		System.out.println("Saving : " + b1.getSavingInterestRate(4) + " %" + " Fixed : "
				+ b1.getFixedDepositInterestRate(8.5) + " %");
		SBI b2 = new SBI();
		System.out.println("Saving : " + b2.getSavingInterestRate(4) + " %" + " Fixed : "
				+ b2.getFixedDepositInterestRate(7) + " %");
		GeneralBank b3 = new ICICI();
		System.out.println("Saving : " + b3.getSavingInterestRate(4) + " %" + " Fixed : "
				+ b3.getFixedDepositInterestRate(8.5) + " %");
		GeneralBank b4 = new SBI();
		System.out.println("Saving : " + b4.getSavingInterestRate(4) + " %" + " Fixed : "
				+ b4.getFixedDepositInterestRate(7) + " %");
	}
}