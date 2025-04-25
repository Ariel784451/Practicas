
public class B {
    protected int y;
    protected int z;
    public B(int y, int z) {
        this.y = y;
        this.z = z;
    }
    public void incrementaYZ() {
    	this.y = this.y +1;
        this.z = this.z +1;
    }
    public void incrementaZ() {
    	this.z = this.z +1;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    @Override
    public String toString() {
        return "y=" + y + ", z=" + z;
    }
}
