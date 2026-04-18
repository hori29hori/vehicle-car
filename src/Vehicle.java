public class Vehicle {

    // 現在地（初期値 0）
    private int x = 0;

    // 速度（初期値 0）
    private int velocity = 0;

    // コンストラクタ（velocity を設定）
    public Vehicle(int velocity) {
        this.velocity = velocity;
    }

    // goメソッド：time × velocity で x を増加
    public void go(int time) {
        x += velocity * time;
    }

    // backメソッド：time × velocity で x を減少
    public void back(int time) {
        x -= velocity * time;
    }

    // 現在地を返す getter
    public int getX() {
        return x;
    }
    public int getVelocity() {
        return velocity;
    }

    // diffメソッド：2つのVehicleの現在地の差を返す
    public static int diff(Vehicle v1, Vehicle v2) {
        return Math.abs(v1.getX() - v2.getX());
    }
}

