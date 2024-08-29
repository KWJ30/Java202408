package ex12;

public class Example {

    public static <T extends Number> void processUpper(Box<? extends T> box) {
        // 상한 제한 관련 로직
    }

    public static <T> void processLower(Box<? super T> box) {
        // 하한 제한 관련 로직
    }

    public static void main(String[] args) {
        Box<Number> box = new Box<>();
        processUpper(box);
        processLower(box);
    }
}

