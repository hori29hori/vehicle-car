public class Bicycle extends Vehicle {

    // コンストラクタ（速度を設定）
    public Bicycle(int velocity) {
        super(velocity);
    }

    // 前進
    @Override
    public void go(int time) {
        super.go(time);

        System.out.println(time + "時間走りました");
        System.out.println("現在地：" + getX());
    }

    // 状態表示
    public void printStatus() {
        System.out.println("現在地：" + getX());
        System.out.println("速度：" + getVelocity());
    }
}
