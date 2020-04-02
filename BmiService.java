public class BmiService {
    public float calculate(int bodymass, float height) {
        float bmi = bodymass / (height*height);
        return bmi;
    }
}
