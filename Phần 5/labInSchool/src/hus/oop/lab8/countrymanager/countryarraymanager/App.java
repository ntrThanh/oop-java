package hus.oop.lab8.countrymanager.countryarraymanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class App {
    private static final String COMMA_DELIMITER = ",";
    private static final CountryArrayManager countryManager = new CountryArrayManager();

    public static void main(String[] args) {
        init();
        /* TODO: write code to test program */
        CountryArrayManager.print(countryManager.getCountries());
        System.out.println();

        testFilterAsiaCountry();
        testFilterAfricaCountry();
        testFilterNorthAmericaCountry();
        testFilterOceaniaCountry();
        testFilterEuropeCountry();
        testFilterSouthAmericaCountry();

        testSortIncreasingByArea();
        testSortDecreasingByArea();

        testSortIncreasingByPopulation();
        System.out.println();
        testSortDecreasingByPopulation();

        testSortIncreasingByGdp();
        testSortDecreasingByGdp();

        testFilterLargestAreaCountries();
        testFilterSmallestAreaCountries();

        testFilterHighestGdpCountries();
        testFilterLowestGdpCountries();

        testFilterMostPopulousCountries();
        testFilterLeastPopulousCountries();
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            dataReader = new BufferedReader(new FileReader(filePath));

            // Read file in java line by line.
            String line;
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                if (dataList.size() != 6) {
                    continue;
                }

                /*
                * TODO: create Country and append countries into 
                * CountryArrayManager here.
                */

                String code = dataList.getFirst();
                String name = dataList.get(1);
                int popular = Integer.parseInt(dataList.get(2));
                double area = Double.parseDouble(dataList.get(3));
                double gdp = Double.parseDouble(dataList.get(4));

                if (dataList.get(5).contains("Asia")) {
                    countryManager.append(new AsiaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("Africa")) {
                    countryManager.append(new AfricaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("Europe")) {
                    countryManager.append(new EuropeCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("North America")) {
                    countryManager.append(new NorthAmericaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("Oceania")) {
                    countryManager.append(new OceaniaCountry(code, name, popular, area, gdp));
                } else if (dataList.get(5).contains("South America")) {
                    countryManager.append(new SouthAmericaCountry(code, name, popular, area, gdp));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null) {
                    dataReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            Collections.addAll(result, splitData);
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
        String filePath = "D:\\OOP\\LabInSchool\\src\\hus\\oop\\lab8\\countrymanager\\data\\countries.csv";
        readListData(filePath);
    }

    public static void testOriginalData() {
        String codesString = CountryArrayManager.codeOfCountriesToString(countryManager.getCountries());
        System.out.print(codesString);
    }

    public static void testSortIncreasingByPopulation() {
        Country[] countries = countryManager.sortByIncreasingPopulation();
        String codesString = CountryArrayManager.codeOfCountriesToString(countries);
        System.out.print(codesString);
    }

    public static void testSortDecreasingByPopulation() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingPopulation();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortIncreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingArea();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortDecreasingByArea() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingArea();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortIncreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByIncreasingGdp();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testSortDecreasingByGdp() {
        /* TODO */
        Country[] countries = countryManager.sortByDecreasingGdp();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterAfricaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAfricaCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterAsiaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterAsiaCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterEuropeCountry() {
        /* TODO */
        Country[] countries = countryManager.filterEuropeCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterNorthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterNorthAmericaCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterOceaniaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterOceaniaCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterSouthAmericaCountry() {
        /* TODO */
        Country[] countries = countryManager.filterSouthAmericaCountry();
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterMostPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterMostPopulousCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterLeastPopulousCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLeastPopulousCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterLargestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLargestAreaCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterSmallestAreaCountries() {
        /* TODO */
        Country[] countries = countryManager.filterSmallestAreaCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterHighestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterHighestGdpCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }

    public static void testFilterLowestGdpCountries() {
        /* TODO */
        Country[] countries = countryManager.filterLowestGdpCountries(5);
        System.out.println(CountryArrayManager.codeOfCountriesToString(countries));
    }
}
