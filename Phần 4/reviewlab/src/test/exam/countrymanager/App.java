package test.exam.countrymanager;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        testSortPopulation();
        testSortArea();
        testSortByGdp();
        testFilterEuropeCountry();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;

        try {
            dataReader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                String code = dataList.get(0).trim();
                String name = dataList.get(1).trim();
                int popular = Integer.parseInt(dataList.get(2).trim());
                double area = Double.parseDouble(dataList.get(3).trim());
                double gdp = Double.parseDouble(dataList.get(4).trim());

                if (dataList.get(5).contains("Asia")) {
                    countryManager.append(new AsiaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("Africa")) {
                    countryManager.append(new AfricaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("Europe")) {
                    countryManager.append(new EuropeCountry(code, name, popular, area, gdp));
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String pathFile = "D:\\OOP\\labInSchool\\src\\hus\\oop\\lab8\\countrymanager\\data\\countries.csv";
        readListData(pathFile);
    }

    public static void testSortPopulation() {
        Country[] testSortCountry = countryManager.sortByIncreasingPopulation();

        System.out.println("Sort by increasing population");
        System.out.println();
        CountryArrayManager.print(testSortCountry);
        System.out.println();

        System.out.println("Sort by decreasing population");
        System.out.println();
        CountryArrayManager.print(countryManager.sortByDecreasingPopulation());
        System.out.println();
    }

    public static void testSortArea() {
        System.out.println("Sort by increasing area");
        System.out.println();
        CountryArrayManager.print(countryManager.sortByIncreasingArea());
        System.out.println();

        System.out.println("Sort by decreasing area");
        CountryArrayManager.print(countryManager.sortByDecreasingArea());
        System.out.println();
    }

    public static void testSortByGdp() {
        System.out.println("Sort by increasing gdp");
        System.out.println();
        CountryArrayManager.print(countryManager.sortByIncreasingGdp());
        System.out.println();

        System.out.println("Sort by decreasing gdp");
        System.out.println();
        CountryArrayManager.print(countryManager.sortByDecreasingGdp());
        System.out.println();
    }

    public static void testFilterEuropeCountry() {
        System.out.println("Filter Europe Country");
        System.out.println();
        CountryArrayManager.print(countryManager.filterEuropeCountry());
    }
}
