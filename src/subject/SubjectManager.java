package subject;

public class SubjectManager {

	double[] arr = new double[5];
	
	public double mean() {

		double mean = 0;
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		mean = sum / arr.length;
		return mean;

	}

	public double variance(double mean) {

		double variance = 0;
		
		for (int i = 0; i < arr.length; i++) {
			variance = Math.pow(i - mean, 2);
		}
		return variance;
	}

	public double standardDev(double variance) {

		double standardDev = 0;
		
		standardDev = Math.sqrt(variance);
		return standardDev;
	}

	public void send(double[] arr2) {
		this.arr = arr2;
	}

}
