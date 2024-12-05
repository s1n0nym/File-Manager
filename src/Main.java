import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "test.txt";
        Date date = new Date();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Создать файл");
            System.out.println("2. Записать в файл");
            System.out.println("3. Читать из файла");
            System.out.println("4. Очистить файл");
            System.out.println("5. Выход");

            int choise = scan.nextInt();
            switch (choise) {
                //Создать файл
                case 1:
                    try {
                        System.out.println("Созданный файл: " + FileManager.CreateOrOpenFile(fileName));
                        System.out.println("Файл создан: " + date.toString());
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Записать в файл
                case 2:
                    try {
                        Scanner scan2 = new Scanner(System.in);
                        System.out.println("Введите данные для записи в файл");
                        FileManager.WriteInFile(fileName, scan2.nextLine());
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Читать из файла
                case 3:
                    try {
                        System.out.println("Данные из файла:" + FileManager.ReadDataFile(fileName));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                //Очистить файл
                case 4: {
                    System.out.println("Файл очищен");
                    try {
                        FileManager.ClearFile(fileName);
                    } catch (IOException e) {
                        throw new RuntimeException(e);

                    }
                    break;
                }
                //Выход
                case 5: {
                    System.out.println("Выход");
                    return;
                }
            }
        }
    }
}