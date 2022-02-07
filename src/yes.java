public class yes {

        String message = "napa";
        char key = '/';
        String kryptering = "";
        String dekrypt = "";
        int length = message.length();

        for (int i = 0; i < length; i++) {
            kryptering = kryptering + Character.toString((char) (message.charAt(i) ^ key));
        }
        System.out.println(kryptering);


        for (int i = 0; i < length; i++) {
            dekrypt = message + Character.toString((char) (message.charAt(i) ^ key));
        }
        System.out.println(dekrypt);
    }
}