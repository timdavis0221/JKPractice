package com.jk.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Tester {
    public static void main(String[] args) {
        try {
//            URL url = new URL("http://api.myjson.com/bins/1ftany");
            URL url = new URL("http://data.tycg.gov.tw/opendata/datalist/datasetMeta/" +
                    "download?id=f4cc0b12-86ac-40f9-8745-885bddc18f79&rid=0daad6e6-0632-44f5-bd25-5e1de1e9146f");
            HttpURLConnection HttpUrlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = HttpUrlConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String strLine = bufferedReader.readLine();

            // collect contents of string
            StringBuffer json = new StringBuffer();

            while (strLine != null) {
//                System.out.println(strLine);
                json.append(strLine);
                strLine = bufferedReader.readLine();
            }
            System.out.println(json.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
