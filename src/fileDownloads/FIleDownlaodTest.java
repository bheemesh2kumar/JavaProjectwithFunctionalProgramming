package fileDownloads;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class FIleDownlaodTest {


    public static Boolean isFIleDownLoad(String fileName) {

        Boolean flag = false;

        if (fileName.length() != 0) {
            //write logic
            String syshome = System.getProperty("user.home");
            String downlaodpath = syshome + "\\Downloads";
            File file = new File(downlaodpath);
            File[] files = file.listFiles();
            System.out.println("all files are total length is : " + files.length);
            System.out.println("***********8file names are here************");
            for (File val : files) {
                System.out.println(val.getName());
            }

            Comparator<File> com = (file1, file2) -> {
                long count = file1.lastModified() - file2.lastModified();

                if (count < 1) {
                    return -1;
                } else if (count > 1) {
                    return 1;
                } else return 0;


            };

            Arrays.sort(files, com);
            File curentfile = files[files.length - 1];

            System.out.println("file after sorted ***********" + curentfile.getName());

            if (curentfile.getName().trim().equals(fileName)) {
                System.out.println(" ||||||||||||||your downlaod file  name is " + curentfile.getName());
                flag = true;
            }


        } else System.out.println("please provide filenamedetials");


        return flag;

    }


    public static void main(String[] args) {

        String usrDir = System.getProperty("user.home");
        System.out.println("**************");
        System.out.println(usrDir);

        System.out.println("prting system varaibles");

        Map<String, String> syvalues = System.getenv();

        syvalues.forEach((i, j) -> System.out.println(i + "->" + j));
        System.out.println("printin all files count***********");
        isFIleDownLoad("Sept_Payslip_2022-09-30.pdf");

    }


}
