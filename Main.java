package homework5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        try(OutputStream out = new FileOutputStream("newfile.csv")) {
            out.write(("Value; 100,300; " + " Value 2; 200,400; " + " Value 3; 123,500;").getBytes());
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        ArrayList<AppData> appDataArrayList = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("newfile.csv"))) {
            String tempString;
            while ((tempString = bufferedReader.readLine()) !=null){

                String[] values = tempString.split(";");
                int[][] data = {{100, 300}, {200, 400}, {123, 500}};
                AppData appData = new AppData(values, data);
                appDataArrayList.add(new AppData (values, data));

                System.out.println(appData.toString());
                System.out.println(appData.deepToString(data));

            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
//        System.out.println(appDataArrayList);

    }

}



