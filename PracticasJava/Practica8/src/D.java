public class D extends A {
    private B b;
    public D(int x, int y, int z) {
        super(x, z);  
        b = new B(y, z);  
    }
    public void incrementaXYZ() {
    	this.x = this.x +1;
        b.incrementaYZ();
        this.z = this.z +1;
    }

    public void incrementaZ() {
        super.incrementaZ();  
        b.incrementaZ();  
    }

    public void incrementaXZ() {
        super.incrementaXZ();
    }

    public void incrementaYZ() {
        b.incrementaYZ();  
        this.z = this.z +1;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + b.y + ", z=" + z;
    }
}
