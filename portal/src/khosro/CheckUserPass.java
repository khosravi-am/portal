package khosro;

import java.io.*;
import java.util.HashMap;

public class CheckUserPass {
    private HashMap<String, String> userPass;
    private final String filePath = "./userPass.txt";


    public CheckUserPass() {
        setUserPass();
    }


    private void setUserPass() {
        userPass = new HashMap<String, String>();
        BufferedReader br = null;
        String line = null;
        File file = new File(filePath);

        try {
            br = new BufferedReader(new FileReader(file));
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                userPass.put(parts[0], parts[1]);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Boolean check(String user, String pass) {
        try {
            if (userPass.get(user).equals(pass)) {
                if (pass.charAt(0) == '1')
                    Main.type = "admin";
                else if (pass.charAt(0) == '2')
                    Main.type = "teacher";
                else Main.type = "student";
                return true;
            } else
                return false;
        }catch (NullPointerException e) {
            return false;
        }
    }
}
