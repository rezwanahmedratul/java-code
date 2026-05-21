public class Question1B {
    public static int areaTriangle(int base, int height) {
        return (base * height) / 2;
    }
    public static void main(String[] args) {
        int base = 10;
        int height = 5;
        int area = Question1B.areaTriangle(base, height);
        System.out.println("The area of the triangle is: " + area + " square units.");
    }    
}
