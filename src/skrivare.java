import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Skapat februari 2022-02-03 - 13:07
 * skrivare
 * Skriven av coolingen
 */
public class skrivare {
        String binnamn = "binartal.txt";
        String talnamn = "nummertal.txt";
        DataOutputStream binSkriv;

        public skrivare() {
            try {

                binSkriv = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(binnamn)));

                PrintWriter talSkriv = new PrintWriter(new FileWriter(talnamn));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
            for (int i = 0; i < 1000; i++) {
                int r = ThreadLocalRandom.current().nextInt(0,1000);

                binSkriv.writeInt(r);
                talSkriv.println(r);
                System.out.println(talSkriv);

            }
            binSkriv.flush();
            binSkriv.close();
            talSkriv.flush();
            talSkriv.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        DataInputStream binlas = new DataInputStream(new BufferedInputStream(new FileInputStream(binnamn)));
        BufferedReader tallas = new BufferedReader(new FileReader(talnamn));
        int bintal;
        int talnummer;
        try{
            System.out.println("Binärtal:");
            for (int i = 0 ;  i < 1000 ; i++) {
                bintal = binlas.readInt();
                System.out.println(bintal);
            }
            System.out.println("Talnummer:");
            for (int i = 0; i < 1000 ; i++){
                talnummer = Integer.parseInt(tallas.readLine());
                System.out.println(talnummer);
            }
            binlas.close();
            tallas.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
