public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(10);  // 速度10
        Vehicle v2 = new Vehicle(20);  // 速度20

        v1.go(3);   // 10 × 3 = 30
        v2.go(2);   // 20 × 2 = 40

        System.out.println("v1 の現在地: " + v1.getX());
        System.out.println("v2 の現在地: " + v2.getX());

        System.out.println("差分: " + Vehicle.diff(v1.getX(), v2.getX()));
    }
}

