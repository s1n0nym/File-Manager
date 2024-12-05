import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    // Метод для создания файла, если он не существует
    public static File CreateOrOpenFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Дата создания файла: "+ fileName);
        } else {
            System.out.println("Файл уже существует: "+ fileName);
        }
        return file;
    }

    // Метод для записи данных в файл
    public static void WriteInFile(String fileName, String data) throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file, true);
        writer.write(data);
        writer.close();
        System.out.println("Данные записаны в файл: "+ fileName);
    }

    // Метод для чтения данных из файла
    public static String ReadDataFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        char[] buffer = new char[(int) file.length()];
        reader.read(buffer);
        reader.close();
        System.out.println("Данные из файла: "+ fileName);
        return new String(buffer);
    }
    // Метод для очистки файла, если он существует
    public static void ClearFile(String fileName) throws IOException {
        File file = new File(fileName);
        FileWriter writer = new FileWriter(file);
        writer.write("");
        writer.close();
        System.out.println("Файл очищен: "+ fileName);
    }
}