public class BmiService {

    public int calculate(double weightKg, double heightM) {

        double index = weightKg / Math.pow(heightM,2);
        int result = (int) index;
        return result;
    }
}