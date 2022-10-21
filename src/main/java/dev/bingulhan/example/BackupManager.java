package dev.bingulhan.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;

public class BackupManager {

    public HashMap<String, String> backups;

    public BackupManager() {
        backups = new HashMap<>();

    }

    public void backupLoad(GameData data) {
        Class<GameData> dataClass = (Class<GameData>) data.getClass();

        for (Field field : dataClass.getFields()) {

            System.out.println(field.getName());
            for (Annotation annotation : field.getAnnotations()) {
                if (annotation instanceof BackupData) {
                    BackupData d = (BackupData) annotation;
                    data.coin = Integer.parseInt(backups.get(d.backupName()));
                }
            }

        }
    }

}
