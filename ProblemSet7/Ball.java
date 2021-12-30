public class Ball {
    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        float singleValueX = (int) (this.x * 10);
        return singleValueX / 10;
    }
    public float getY() {
        float singleValueY = (int) (this.y * 10);
        return singleValueY / 10;
    }
    public float getZ() {
        float singleValueZ = (int) (this.z * 10);
        return singleValueZ / 10;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + "," + z + ')';
    }
}
