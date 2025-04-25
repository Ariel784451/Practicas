
public class A {
    protected int x;
    protected int z;
    public A(int x, int z) {
        this.x = x;
        this.z = z;
    }
    public void incrementaXZ() {
        this.x = this.x +1;
        this.z = this.z +1;
    }
    public void incrementaZ() {
    	this.z = this.z +1;
    }
    public int getX() {
        return x;
    }

    public int getZ() {
        return z;
    }
    @Override
    public String toString() {
        return "x=" + x + ", z=" + z;
    }
}
