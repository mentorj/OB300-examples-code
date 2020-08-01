package serialization;

import java.io.*;

public class VoitureDemo {
    public static void main(String[] args) {
        Voiture v1 = new Voiture("543VZ75","rouge");
        System.out.println("Avant serialization , v1 ="+ v1.toString());
        File f = new File("/tmp/test.ser");
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(v1);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("/tmp/test.ser");

            ObjectInputStream ois =new ObjectInputStream(fis);
            Voiture v2 = (Voiture)ois.readObject();
            System.out.println("v2 lue depuis un fichier =" + v2.toString());
            assert (v1==v2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
