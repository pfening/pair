package datatype;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) {

        String csvFile = "\\\\Glatku-sp170002.eu.novartis.net\\pfeniga1$\\data\\GDDB_SOC_patterns.csv";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                String[] item = line.split(",");
                String type = item[0];
                String desc = item[1];
                String role = item[2];
                String role_ext = item[3];
                String gen = item[4];
                System.out.println(type+desc+role+role_ext+gen);
                
                float ta = (type.equals("GDDB01")) ? 1 : 0 ;
                float tb = (type.equals("GDDB02")) ? 2 : 0 ;
                float tc = (type.equals("GDDB03")) ? 3 : 0 ;
                float td = (type.equals("GDDB04")) ? 4 : 0 ;
                System.out.println(ta+tb+tc+td);
                
                float ra = (role.equals("ROLE_GDDB_ADMINISTRATOR - none - HELPDESK")) ? 1 : 0 ;
                float rb = (role.equals("ROLE_GDDB_MANAGER")) ? 2 : 0 ;
                float rc = (role.equals("ROLE_GDDB_ADMINISTRATOR_PLUS")) ? 3 : 0 ;
                float rd = (role.equals("ROLE_GDDB_ADMINISTRATOR - none")) ? 4 : 0 ;
                System.out.println(ra+rb+rc+rd);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}