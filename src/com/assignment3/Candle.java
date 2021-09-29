package com.assignment3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Candle {
    LocalDateTime currentTime= LocalDateTime.parse("2021-09-29T10:00:00.255");
    List<CandleSeriesData> candelSeriesDataList= new ArrayList<>();
    List<CandleSeriesData> filteredDataList= new ArrayList<>();
    List<CandleDTO> candleDTOList=new ArrayList<>();

    public static String generateSymbols(){
        String[] symbols= {"$","£","₹"};
        Random random=new Random();
        int symbol=random.nextInt(symbols.length);
        return symbols[symbol];
    }

    public static double generatePrice(double price){
        Random random= new Random();
        double[] percentList= {-(random.nextInt(11)),(random.nextInt(11))};
        int percentIndex=random.nextInt(percentList.length);
        price=price+((price*percentList[percentIndex])/100);
        return price;
    }

    public List<CandleSeriesData> generateSeriesData(){
        Random random=new Random();
        double price =random.nextInt( 500) + 500 ;
        while(candelSeriesDataList.size()<100800) {
            if (currentTime.getHour() >= 10 && currentTime.getHour() < 15) {
                candelSeriesDataList.add(new CandleSeriesData(currentTime, generateSymbols(), generatePrice(price)));
            }
            currentTime = currentTime.plusSeconds(1);
        }
        return candelSeriesDataList;
    }

    public List<CandleDTO> getCandles(String symbol, LocalDateTime startDate, LocalDateTime endDate, int granularity) {

        filteredDataList=candelSeriesDataList.stream()
                .filter(e->e.getTime().isAfter(startDate)&&e.getTime().isBefore(endDate))
                .collect(Collectors.toList());

        int start=0;
        int candelSize=filteredDataList.size()/granularity;
        List<CandleSeriesData> oneCandelRaw=null;
        List<CandleSeriesData> oneCandelFiltered = null;
        double closePrice=0;

        for(int i=0;i<candelSize;i++){

            oneCandelRaw = filteredDataList.stream().skip(start)
                    .limit(granularity).collect(Collectors.toList());

            oneCandelFiltered=oneCandelRaw.stream().filter(e->e.getSymbol()==symbol).collect(Collectors.toList());

            List<Double> oneCandelPrice= oneCandelFiltered.stream().map(e -> e.getPrice()).collect(Collectors.toList());

            List<LocalDateTime> oneCandelTime= oneCandelFiltered.stream().map(e -> e.getTime()).collect(Collectors.toList());

            double lowPrice = Collections.min(oneCandelPrice);
            double highPrice = Collections.max(oneCandelPrice);
            double sumPrice = oneCandelPrice.stream().reduce(0d, (acc, element) -> acc + element);
            double openPrice;

            if(start==0){
                openPrice =oneCandelPrice.get(0);
                closePrice =oneCandelPrice.get(oneCandelPrice.size()-1);
            }
            else{
                openPrice=closePrice;
                closePrice =oneCandelPrice.get(oneCandelPrice.size()-1);
            }

            candleDTOList.add(new CandleDTO(oneCandelTime.get(0), lowPrice, highPrice, openPrice, closePrice, sumPrice));
            start+=granularity;
        }

        return candleDTOList ;
    }

    public static void main(String[] args) {
        Candle candle=new Candle();

                candle.generateSeriesData();

        List<CandleDTO> candleDTOList=candle.getCandles("£",LocalDateTime
                .parse("2021-09-29T10:00:00.00"),LocalDateTime
                .parse("2021-09-29T14:59:59.256"),120);



        int count=1;

        for(int i=0;i<candleDTOList.size();i++){
            System.out.println("============================Candel "+count+" Start=============================================================================================================");
            System.out.println(" Time--> "+candleDTOList.get(i).getTime()+"  High-->"+candleDTOList.get(i).getHigh()+"  Low-->"+candleDTOList.get(i).getLow()+"  Open-->"+candleDTOList.get(i).getOpen()+" Close-->"+candleDTOList.get(i).getClose()+ " Volume: "+candleDTOList.get(i).getVolume());
            System.out.println("=====================================Candel "+count+ " END=======================================================================================================");
            count++;

        }
    }
}