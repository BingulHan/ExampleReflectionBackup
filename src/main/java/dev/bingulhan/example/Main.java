package dev.bingulhan.example;

public class Main {



    public static BackupManager backupManager;

    public static void main(String[] args) {

        backupManager = new BackupManager();

        GameData data = new GameData("mustafa", 1);

        
        //It will automatically pull the data.
        GameData data1 = new GameData("mustafa");


    }
}
