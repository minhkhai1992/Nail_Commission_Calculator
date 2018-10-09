
/**
 * The class purpose will calculate base on commission what nail technician make.
 * @return
 */

public class Nail_Commission {
	
	//private int day;
	private double tip, commission, totalCash, totalCheck;

	
	private final double COMMISSION_PERCENT = 0.6;
	
	public void commissionCal(double t, double tip) {
		// calculate commission nail technician make
		totalCash = t/2;
		totalCheck = totalCash + tip;
	}
	
	public void setCommission(double m) {
		// the method will check valid value
		commission = m*COMMISSION_PERCENT;
	}
	
	public double getCommission() {
		return commission;
	}
	
	public void setTip(double t) {
		tip = t;
	}
	public double getTip() {
		return tip;
	}
	
	public void setTotalCash(double t) {
		totalCash = t;
	}
	
	public double getTotalCash() {
		return totalCash;
	}
	
	public void setTotalCheck(double t) {
		totalCheck = t;
	}
	
	public double getTotalCheck() {
		return totalCheck;
	}
	
	public String toString() {
		return "Total Cash you made: " + getTotalCash()
				+ "\nTotal Check you made " + getTotalCheck()
				+ "\nTotal Tip amount " + getTip();
	}
}
