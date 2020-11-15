package fileReader;

import entities.*;

import java.io.*;
import java.util.*;

public class FileService {
    private ArrayList<Vehicle> vehiclesList = new ArrayList<>();
    private ArrayList<Car> carList = new ArrayList<>() ;
    private ArrayList<Bicycle> bicycleList = new ArrayList<>();
    private ArrayList<Tractor> tractorList = new ArrayList<>();
    private ArrayList<Motorcycle> motorcycleList = new ArrayList<>();
    private ArrayList<Boat> boatList = new ArrayList<>();
    private HashMap<String, Integer> brandNumber = new HashMap<>();

    public ArrayList<Vehicle> getVehiclesList() {
        return vehiclesList;
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public ArrayList<Bicycle> getBicycleList() {
        return bicycleList;
    }

    public ArrayList<Tractor> getTractorList() {
        return tractorList;
    }

    public ArrayList<Motorcycle> getMotorcycleList() {
        return motorcycleList;
    }

    public ArrayList<Boat> getBoatList() {
        return boatList;
    }

    public HashMap<String, Integer> getBrandNumber() {
        return brandNumber;
    }

   public void readFileArray(String path){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(", ");
                //System.out.println(Arrays.toString(parts));
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
                Car car = new Car(array[1], array[2], array[3], array[4], CarGearType.valueOf((array[5])), CarShape.valueOf(array[6]));
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
            case "Boat":
                Boat boat = new Boat(array[1], array[2], array[3], array[4]);
                boatList.add(boat);
                vehiclesList.add(boat);
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

   public int getVehiclesNumber(ArrayList<?> arrayList){
        return arrayList.size();
   }

   public void countBrandNumber(){
       for (Vehicle vehicle: vehiclesList) {
           if(brandNumber.get(vehicle.getBrand()) == null){
               brandNumber.put(vehicle.getBrand(), 1);
           }else{
               int count = brandNumber.get(vehicle.getBrand());
               brandNumber.put(vehicle.getBrand(), count+1);
           }
       }

       for (Map.Entry<String, Integer> entry: brandNumber.entrySet()){
           System.out.println(entry.getKey() + " = " + entry.getValue());
       }
   }

   public void separateFiles(String path, ArrayList<?> arrayList){
       try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
           for(Iterator<?> iterator = arrayList.iterator(); iterator.hasNext(); ){
             bufferedWriter.write(String.valueOf(iterator.next()));
             bufferedWriter.write("\n");
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
   }


}
