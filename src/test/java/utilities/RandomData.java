package utilities;

import java.util.Random;
public class RandomData {

    public static String randomEmpId()
    {
        Random random=new Random();
        int num = random.nextInt(90000) + 10000;
        return "OW"+num;
    }

    public static String randomEmailId()
    {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        String username = "";
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(chars.length());
            username += chars.charAt(index);
        }

        return username+ "@" + "optimworks.com";
    }

}

