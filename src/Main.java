import java.io.*;

public static void main(String[] args) {
        FileManager fileManager = new FileManager();
        String filePath = "example.txt";

        try {
            File file = fileManager.createOrOpenFile(filePath);
            System.out.println("Файл " + file.getName() + " был создан или открыт.");

            fileManager.writeToFile(filePath, "Hello, World!");
            fileManager.writeToFile(filePath, "Это тестовое сообщение.");

            String content = fileManager.readFromFile(filePath);
            System.out.println("Содержимое файла:");
            System.out.println(content);

            fileManager.deleteFile(filePath);
            System.out.println("Файл удален.");
        } catch (IOException e) {
            e.printStackTrace();
        }
}
