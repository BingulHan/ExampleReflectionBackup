package dev.bingulhan.example;

public class GameData {

    public String name;

    @BackupData(backupName = "coin")
    public int coin = -1;

    public GameData(String name, int coin) {
        this.name = name;
        this.coin = coin;

        if (Main.backupManager.backups.get(name)==null) {
            Main.backupManager.backups.put("coin", ""+coin);
        }else {
            Main.backupManager.backups.replace("coin", ""+coin);
        }

    }

    public GameData(String name) {
        this.name = name;

        Main.backupManager.backupLoad(this);

        System.out.println("Coin: "+coin);
    }


}
