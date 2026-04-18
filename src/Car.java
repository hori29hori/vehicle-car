public class Car extends Vehicle {

    private int fuel = 50;

    // コンストラクタ
    public Car(int velocity) {
        super(velocity);
    }

    // 前進（燃料を消費）
    @Override
    public void go(int time) {
        int move = getVelocity() * time;

        if (fuel >= move) {
            super.go(time);
            fuel -= move;
        } else {
            System.out.println("ガソリンが足りません");
        }
    }

    // 後退（燃料を消費）
    @Override
    public void back(int time) {
        int move = getVelocity() * time;

        if (fuel >= move) {
            super.back(time);
            fuel -= move;
        } else {
            System.out.println("ガソリンが足りません");
        }
    }

    // 給油
    public void charge(int litre) {
        if (litre > 0) {
            fuel += litre;
            if (fuel > 100) {
                fuel = 100;
            }
        }
    }

    // 状態表示
    public void printStatus() {
        System.out.println("現在地：" + getX());
        System.out.println("速度：" + getVelocity());
        System.out.println("ガソリン量：" + fuel);
    }
}
