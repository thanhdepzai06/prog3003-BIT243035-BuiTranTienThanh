package Test;

public class Test<T> {

    private T value;

    public void set(T t) {
        this.value = t;
    }

    public T get() {
        return this.value;
    }

    public static void main(String[] args) {

        Test<Integer> testInt = new Test<>();

        testInt.set(2025);
        System.out.println("Gia tri Integer: " + testInt.get());

        Test<String> testStr = new Test<>();

        System.out.println("Gia tri String: " + testStr.get());

        Test<Double> testDouble = new Test<>();
        testDouble.set(3.14159);
        System.out.println("Gia tri Double: " + testDouble.get());
    }
}
