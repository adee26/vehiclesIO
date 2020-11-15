import entities.Motorcycle;
import fileReader.FileService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       // FileService.readFile("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\file.txt");
        FileService fileService = new FileService();
        fileService.readFileArray("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\newFile.txt");
        System.out.println("====================");
        fileService.iterateList("Vehicles", fileService.getVehiclesList());
        System.out.println("====================");

        /** Ex1. Count the number of cars, motorcycles, tractors, boats */

        System.out.println("We have " + fileService.getVehiclesNumber(fileService.getBicycleList()) + " " + ((fileService.getVehiclesNumber(fileService.getBicycleList()) == 1)
                ? "bicycle" : "bicycles" + "."));
        System.out.println("We have " + fileService.getVehiclesNumber(fileService.getCarList()) + " " + ((fileService.getVehiclesNumber(fileService.getCarList()) == 1)
                ? "car" : "cars" + "."));
        System.out.println("We have " + fileService.getVehiclesNumber(fileService.getTractorList()) + " " + ((fileService.getVehiclesNumber(fileService.getTractorList()) == 1)
                ? "tractor" : "tractors" + "."));
        System.out.println("We have " + fileService.getVehiclesNumber(fileService.getBoatList()) + " " + ((fileService.getVehiclesNumber(fileService.getBoatList()) == 1)
                ? "boat" : "boats" + "."));
        System.out.println("We have " + fileService.getVehiclesNumber(fileService.getMotorcycleList()) + " " + ((fileService.getVehiclesNumber(fileService.getMotorcycleList()) == 1)
                ? "motorcycle" : "motorcycles" + "."));

        /**Ex2. Count how many vehicles of each brand are there*/
        System.out.println("====================");
        fileService.countBrandNumber();

        /**Ex3. Sort the cars by price*/
        System.out.println("====================");
        Collections.sort(fileService.getCarList());
        fileService.iterateList("Cars", fileService.getCarList());

        /**Ex4. Sort the choppers by top speed*/
        ArrayList<Motorcycle> choppers = new ArrayList<>();
        for(Motorcycle motorcycle : fileService.getMotorcycleList()){
            if(motorcycle.getMotorcycleShape().equalsIgnoreCase("chopper")){
                choppers.add(motorcycle);
            }
        }
        Collections.sort(choppers);
        fileService.iterateList("Choppers", choppers);

        /**Ex5. Display each category of vehicles in separate files */
        fileService.separateFiles("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\cars.txt",
                fileService.getCarList());
        fileService.separateFiles("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\motorcycles.txt",
                fileService.getMotorcycleList());
        fileService.separateFiles("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\bicycles.txt",
                fileService.getBicycleList());
        fileService.separateFiles("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\boats.txt",
                fileService.getBoatList());
        fileService.separateFiles("C:\\Users\\apetr\\OneDrive\\Desktop\\vehiclesIO\\src\\main\\resources\\tractors.txt",
                fileService.getTractorList());

    }
}
