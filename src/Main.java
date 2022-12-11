import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args)throws Exception {

                File f = new File("text.txt");
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String s ;//= br.readLine();
                String lines;
                String code;
                int i = 0;
                while ((s = br.readLine()) != null) {
                    i=0;
                    int o=0;
                    code = "";
                    lines="";
                    String str[] = s.split(" ");
                    for (String st : str) {

                        if (st.length()>8) {
            int j = 0;
            if ((((st.charAt(0) >= 'A' && st.charAt(0) <= 'Z')) || ((st.charAt(0) >= 'a') && (st.charAt(0) <= 'z')))) {
                if (('0' <= st.charAt(st.length() - 1)) && (st.charAt(st.length() - 1) <= '9')) {
                    char c[]=st.toCharArray();
                    j=0;
                    try {
                        char m[]=st.toCharArray();
                        for(char x :m) {
                            if(x=='0')break;
                            lines += x;
                            j++;
                            o = 1;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }

        if(o==1) {
            break;
        }
        if (i == 1) {
            lines += st.charAt(0);
            i = 0;
        }
        if (st.length() > 8) {
            if (st.charAt(0) == '0' && st.charAt(1) == '1' && st.charAt(2) == '1') {
                code += st.substring(3, 9);
                i = 1;
            }
        }
    }
                    if(lines!="") {
                        lines+= code;
                        lines+="@bscse.uiu.ac.bd;";
                        FileWriter fw= new FileWriter("mail.txt",true);
                        fw.write(lines+"\n");
                        fw.close();
                        System.out.println(lines);

                    }
}

}
}
