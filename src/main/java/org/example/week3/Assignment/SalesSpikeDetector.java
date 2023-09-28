package org.example.week3.Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SalesSpikeDetector {

    public static void main(String[] args) {

        try{
            String csvFilePath = "C:/Users/koust/Desktop/github/platform-based-programming/src/main/java/org/example/week3/Assignment/sales_data.csv";
            List<int[]> salesData = readCSV(csvFilePath);

            Scanner scanner = new Scanner(System.in);
            int threshold = scanner.nextInt();
            int timePeriod = scanner.nextInt();

            Map<Integer, Integer> results = detectSalesSpike(salesData, threshold, timePeriod);

            if(results.isEmpty()){
                System.out.println("No sales spike detected");
            }
            else{
                for (Map.Entry<Integer, Integer> entry: results.entrySet()){
                    System.out.println("Item ID:" + entry.getKey() + ", Time Period:"+ entry.getValue() + " minutes");
                }
            }
        }catch (IOException e){
            System.out.println("Error reading CSV file:" + e.getMessage());
        }
    }

    public static List<int[]> readCSV(String csvFilePath) throws IOException{
        List<int[]> data = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))){
            reader.readLine();
            String line;

            while((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                int[] row = new int[parts.length-1];
                for (int i  =0 ; i <row.length; i++){
                    row[i] = Integer.parseInt(parts[i+1]);
                }
                data.add(row);
            }
        }
        return data;
    }


    /**
     * T: sales spike threshold (integer)
     * P: time period in minutes (integer)
     */
    private static Map<Integer, Integer> detectSalesSpike(List<int []> salesData,int threshold, int period){
        Map<Integer, Integer> result = new HashMap<>();
        int length = salesData.get(0).length;
        for(int i = 0 ; i < length; i++){ //아이템
            int [] temp = new int[salesData.size()];
            for (int j = 0; j < salesData.size(); j++){
                temp[j] = salesData.get(j)[i];
            }
            int minPeriod = findMinPeriod(temp, threshold, period);
            if (minPeriod != 61)
                result.put(i+1, minPeriod);
        }
        return result;
    }

    private static int findMinPeriod(int[] salesData, int threshold, int period){
        int[] answer = new int[salesData.length];
        Arrays.fill(answer, period+1);
        for (int i = 0; i < salesData.length; i++){
            try{
                int current = 0;
                int total = 0;
                while(total <= threshold && current <= period){
                    total += salesData[i+current++];
                    if (total >= threshold){
                        answer[i] = current;
                        break;
                    }
                }
            }catch (Exception e){
                answer[i] = period+1;
            }
        }

        return Arrays.stream(answer).min().orElse(period+1);
    }
}

