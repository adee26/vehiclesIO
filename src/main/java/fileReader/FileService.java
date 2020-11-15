package fileReader;

import entities.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FileService {
    private ArrayList<Vehicle> vehiclesList = new ArrayList<>();
    private ArrayList<Car> carList = new ArrayList<>() ;
    private ArrayList<Bicycle> bicycleList = new ArrayList<>();
    private ArrayList<Tractor> tractorList = new ArrayList<>();
    private ArrayList<Motorcycle> motorcycleList = new ArrayList<>();

    public  ArrayList<Car> getCarList() {
        return carList;
    }

    public  ArrayList<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public  ArrayList<Tractor> getTractorList() {
        return tractorList;
    }

    public  ArrayList<Motorcycle> getMotorcycleList() {
        return motorcycleList;
    }

    public ArrayList<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public FileService setVehiclesList(ArrayList<Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
        return this;
    }

    public static void readFile(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   public void readFileArray(String path){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(", ");
                System.out.println(Arrays.toString(parts));
                getVehicleType(parts);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
   }

   public void getVehicleType(String[] array){
        String type = array[0];
        switch (type){
            case "Car":
                Car car = new Car(array[1], array[2], array[3], array[4],array[5], array[6]);
               carList.add(car);
               vehiclesList.add(car);
                break;
            case "Motorcycle":
                Motorcycle motorcycle = new Motorcycle(array[1], array[2], array[3], array[4],array[5]);
                motorcycleList.add(motorcycle);
                vehiclesList.add(motorcycle);
                break;
            case "Bicycle":
                Bicycle bicycle = new Bicycle(array[1], array[2], array[3]);
                bicycleList.add(bicycle);
                vehiclesList.add(bicycle);
                break;
            case "Tractor":
                Tractor tractor = new Tractor(array[1], array[2], array[3], array[4]);
                tractorList.add(tractor);
                vehiclesList.add(tractor);
                break;
        }
   }

   public void iterateList(String title, ArrayList<?> arrayList){
       System.out.println();
       System.out.println(title + "\n");
       for(Iterator<?> iterator = arrayList.iterator(); iterator.hasNext(); ){
           System.out.println(iterator.next());
       }
   }


}
