public class main {
    public static void main(String[] args) {
        //exempel1();
        exempel2();
    }

    // Visar hur exemplet i teorigenomgången funkar i Java
    private static void exempel1() {
        String message = "HEJ";
        char key = '(';
        String crypt = "";

        for (int i = 0 ; i < message.length() ; i++) {
            System.out.println(Integer.toBinaryString(message.charAt(i)));
            System.out.println("0" + Integer.toBinaryString(key));
            System.out.println(Integer.toBinaryString(message.charAt(i)^key));
            System.out.println((message.charAt(i)^key) + "\n");
            crypt += (char)(message.charAt(i)^key);
        }
        System.out.println(crypt);
    }

    // Visar hur XOR-kryptering funkar på byte-nivå
    public static void exempel2() {
        byte A = 96;
        byte B = 40;
        byte D = 69;
        byte E = 74;

        // måste casta till byte eftersom det alltid blir en int
        byte C = (byte)(A^B);
        byte K = (byte)(D^B);
        byte P = (byte)(E^B);

        System.out.println(C + " "+ K +" "+P );
    }
}