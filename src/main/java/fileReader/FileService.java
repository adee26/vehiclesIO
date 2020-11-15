package fileReader;

import entities.Bicycle;
import entities.Car;
import entities.Motorcycle;
import entities.Tractor;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FileService {
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
               carList.add(new Car(array[1], array[2], array[3], array[4],array[5], array[6]));
                break;
            case "Motorcycle":
                motorcycleList.add(new Motorcycle(array[1], array[2], array[3], array[4],array[5]));
                break;
            case "Bicycle":
                bicycleList.add(new Bicycle(array[1], array[2], array[3]));
                break;
            case "Tractor":
                tractorList.add(new Tractor(array[1], array[2], array[3], array[4]));
                break;
        }
   }

   public void printLists(){
       iterateList("Bicycles", bicycleList);
       iterateList("Cars", carList);
       iterateList("Tractors", tractorList);
       iterateList("Motorcycles", motorcycleList);
   }

   public void iterateList(String title, ArrayList<?> arrayList){
       System.out.println();
       System.out.println(title + "\n");
       for(Iterator<?> iterator = arrayList.iterator(); iterator.hasNext(); ){
           System.out.println(iterator.next());
       }
   }

}
