package homework5;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class AppData implements Serializable {

    private String[] header;
    private int[][] data;

    public AppData(String[] header, int[][] data) {
        this.header = header;
        this.data = data;
    }

    @Override
    public String toString() {
        ArrayList<String> headerTemp = new ArrayList<String>();
        for (int i = 0; i < header.length ; i++) {
            if(header[i].contains("Value") )
            {
                headerTemp.add(header[i].toString());
            }
        }
        return  "header=" + Arrays.toString(headerTemp.toArray());
    }

    public String deepToString(int[][] data) {
        return  "data=" + Arrays.deepToString(this.data);
    }


//    public boolean toString(String tempString) {
//
//    }
}

