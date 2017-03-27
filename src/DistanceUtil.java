
public class DistanceUtil {
	static double calcStr(String x1Str, String y1Str, String x2Str, String y2Str) {

		return calc(Double.parseDouble(x1Str), Double.parseDouble(y1Str), Double.parseDouble(x2Str),
				Double.parseDouble(y2Str));
	}

	static double calc(double x1, double y1, double x2, double y2) {
		double result = 0;

		result = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));

		return result;
	}

}
