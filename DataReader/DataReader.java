package DataReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

enum Format {CSV, TSV;}

public class DataReader {

    private String path;
    private int rows;
    private Scanner sc;
    private String columsStr[];

    public DataReader(Format format, String path) {
        this.path = path;
        File file = new File(path);
        try {sc = new Scanner(file);} catch (FileNotFoundException e) {e.printStackTrace();}if (format == Format.CSV) {columCsvReader();}
    }
    private void columCsvReader() {
        String line;
        line = sc.nextLine();
        String[] columStr = line.split(",");
        this.columsStr = columStr;
        rowCounter();
    }
    private void rowCounter() {
        int rows = 0;
        while (sc.hasNextLine()) {
            rows++;
            if(sc.nextLine()==null) {break;}
        }
        this.rows = rows;
    }
    public String getColumHeadLineAt(int colum) {return columsStr[colum];}

    public int getColums() {return columsStr.length - 1;}

    public int getRows() {return rows;}
}

