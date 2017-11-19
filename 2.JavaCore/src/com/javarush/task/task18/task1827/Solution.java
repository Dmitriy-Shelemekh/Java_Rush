package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    final static byte idLength = 8,
            productNameLength = 38,
            priceLength = 46,
            quantityLength = 50;
    static String fileName;
    static List<String[]> prices = new ArrayList<>();

    {

    }

    public static void main(String[] args) throws Exception {
        readPrices();
        switch (args[0]) {
            case ("-c"):
                createPrice(args);
                break;
        }
    }

    static void enterFileName() throws IOException {
        BufferedReader bRead = new BufferedReader(new InputStreamReader(System.in));
        fileName = bRead.readLine();
        bRead.close();
    }

    public static void createPrice(String[] args) throws IOException {//добавляет в список прайсов новый прайс и запис. в файл
        prices.add(getNewPriceArr(args));
        BufferedWriter bWriter = null;

        try {
            bWriter = new BufferedWriter(new FileWriter(fileName));

            for (int i = 0, end = prices.size() - 1; i < end; i++) {
                bWriter.write(getPriceLine(prices.get(i)));
                bWriter.newLine();
            }

            bWriter.write(getPriceLine(prices.get(prices.size() - 1)));

        } catch (IOException e) {
            throw new IOException("Exception when file write", e);
        } finally {
            if (bWriter != null) {
                try {
                    bWriter.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }

    public static void readPrices() throws IOException {//загружает в карту содержимое файла
        enterFileName();
        BufferedReader bRead = null;
        String nextLine;

        try {
            bRead = new BufferedReader(new FileReader(fileName));
            while (bRead.ready()) {
                nextLine = bRead.readLine();
                prices.add(new String[]{getID(nextLine), getProductName(nextLine), getPrice(nextLine), getQuantity(nextLine)});
            }
        } catch (FileNotFoundException e) {
            System.out.println("Exception when file found");
        } catch (IOException e) {
            throw new IOException("Exception when file read", e);
        } finally {
            if (bRead != null) {
                try {
                    bRead.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }

    static String getID(String priceLine) {//возвращает численное значение ID
        return priceLine.substring(0, idLength);
    }

    static String getProductName(String priceLine) {//возвращает строку-название товара
        return priceLine.substring(idLength, productNameLength);
    }

    static String getPrice(String priceLine) {//возвращает строку-цену товара
        return priceLine.substring(productNameLength, priceLength);
    }

    static String getQuantity(String priceLine) {//возвращает строку-количество товара
        return priceLine.substring(priceLength);
    }

    static int getMaxID() {
        if (prices.size() == 0) {
            return 0;
        }
        Object[] idS = new Object[prices.size()];

        for (int i = 0, end = prices.size(); i < end; i++) {
            idS[i] = getIntID(prices.get(i)[0]);
        }

        Arrays.sort(idS);
        return (int) idS[idS.length - 1];
    }

    static String getNextID() {
        int nextID = getMaxID() + 1;
        String nextIDStr = Integer.toString(nextID);

        if (nextIDStr.length() < idLength) {
            for (int i = 0, end = idLength - nextIDStr.length(); i < end; i++) {
                nextIDStr = nextIDStr + " ";
            }

            return nextIDStr;
        } else if (nextIDStr.length() > idLength) {
            return nextIDStr.substring(0, 8);
        }

        return nextIDStr;
    }

    static int getIntID(String stringID) {
        return Integer.parseInt(stringID.split(" ")[0]);
    }

    static String[] getNewPriceArr(String[] args) {//возвр массив [4] с занесенными параметрами
        return new String[]{getNextID(), getNewPriceProdName(args[1]), getNewPricePrice(args[2]), getNewPriceQuantity(args[3])};
    }

    static String getNewPriceProdName(String prodName) {//возвращает адаптированное значение названия
        int prodNameSize = productNameLength - idLength;
        String newProdName = prodName;

        if (prodName.length() > prodNameSize) {
            newProdName = newProdName.substring(0, prodNameSize);
        } else if (prodName.length() < prodNameSize) {
            for (int i = 0, end = prodNameSize - prodName.length(); i < end; i++) {
                newProdName = newProdName + " ";
            }
        }

        return newProdName;
    }

    static String getNewPricePrice(String price) {//возвращает адаптированное значение цены
        int priceSize = priceLength - productNameLength;
        String newPrice = price;

        if (price.length() > priceSize) {
            newPrice = newPrice.substring(0, priceSize);
        } else if (price.length() < priceSize) {
            for (int i = 0, end = priceSize - price.length(); i < end; i++) {
                newPrice = newPrice + " ";
            }
        }

        return newPrice;
    }

    static String getNewPriceQuantity(String quant) {//возвращает адаптированное значение количества
        int quantSize = quantityLength - priceLength;
        String newQuant = quant;

        if (quant.length() > quantSize) {
            newQuant = newQuant.substring(0, quantSize);
        } else if (quant.length() < quantSize) {
            for (int i = 0, end = quantSize - quant.length(); i < end; i++) {
                newQuant = newQuant + " ";
            }
        }

        return newQuant;
    }

    static String getPriceLine(String[] price) {
        return price[0] + price[1] + price[2] + price[3];
    }
}
