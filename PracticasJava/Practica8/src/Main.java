public class Main {
    public static void main(String[] args) {
        D d = new D(5, 10, 5);  
        System.out.println("Original: " + d);
        System.out.println("Usando los incrementos");
        d.incrementaZ();
        System.out.println("incrementoZ: " + d);

        d.incrementaXZ();
        System.out.println("incrementoXZ: " + d);

        d.incrementaYZ();
        System.out.println("incrementoYZ: " + d);

        d.incrementaXYZ();
        System.out.println("incrementoXYZ: " + d);
    }
}
