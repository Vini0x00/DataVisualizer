package DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {

    private String path;
    private Scanner sc;
    private String columsStr[];

    public DataReader(Format format,String path) {
        this.path = path;
        File file = new File(path);
        try {sc = new Scanner(file);} catch (FileNotFoundException e) {e.printStackTrace();}
        if(format==Format.CSV){columCsvReader();}

    }

    private void columCsvReader() {
        String line;
        line = sc.nextLine();
        String[] columStr = line.split(",");
        this.columsStr = columStr;
    }
    public String getColumAt(int colum) {return columsStr[colum];}

    public int getColums(){return columsStr.length-1;}
}
