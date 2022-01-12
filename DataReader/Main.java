package DataReader;

public class Main {

    public static void main(String[] args){

        DataReader c = new DataReader(Format.CSV,"C:\\Users\\Spiele\\Downloads\\FAN t14 18B\\Design 1\\Szenario 1/Szenario 1_torque.csv");

        System.out.println(c.getColumAt(0));
    }

}
