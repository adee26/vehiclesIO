import fileReader.FileService;

public class Main {
    public static void main(String[] args) {
       // FileService.readFile("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\file.txt");
        FileService fileService = new FileService();
        fileService.readFileArray("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\file.txt");
        System.out.println("====================");
        fileService.printLists();

    }
}
