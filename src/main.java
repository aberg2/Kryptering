public class main {
    public static void main(String[] args) {
        exempel1();
        //exempel2();
    }

    // Visar hur exemplet i teorigenomgången funkar i Java

    private static String exempel1() {
        String message = "";
        char key = 'W';
        String kryptering = "a";
        int length = message.length();

        for (int i = 0 ; i < length ; i++) {
            kryptering = kryptering + Character.toString((char) (message.charAt(i) ^ key));
        }
        System.out.println(kryptering);
        return kryptering;

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