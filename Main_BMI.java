public class Main_BMI {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        int bodymass = 50;
        float height = (float) 1.5;
        float bmi = bodymass / (height*height);
        System.out.println(bmi);
    }
}
//Например, масса человека = 50 кг, рост = 150 см. Следовательно, индекс массы тела в этом случае равен:
// ИМТ = 50 : (1,5 × 1,5) = 22,22 кг/м²
