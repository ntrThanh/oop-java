package hus.oop.lab8.countrymanager.countryarraymanager;

import java.util.ArrayList;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i-1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population 
     *  using selection sort algorithm.
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        int index;

        for (int i = 0; i < length - 1; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[index].getPopulation() > newArray[j].getPopulation()) {
                    index = j;
                }
            }

            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population 
     *  using selection sort algorithm.
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        /* TODO */
        int index;

        for (int i = 0; i < length - 1; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if (newArray[index].getPopulation() < newArray[j].getPopulation()) {
                    index = j;
                }
            }

            Country temp = newArray[i];
            newArray[i] = newArray[index];
            newArray[index] = temp;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() > newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area 
     *  using bubble sort algorithm.
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[i].getArea() < newArray[j].getArea()) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  using insertion sort algorithm.
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < length; i++) {
            Country tempCountry = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() > tempCountry.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }

            newArray[j + 1] = tempCountry;
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP 
     *  sing insertion sort algorithm.
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        
        /* TODO */
        for (int i = 0; i < length; i++) {
            Country tempCountry = newArray[i];
            int j = i - 1;

            while (j >= 0 && newArray[j].getGdp() < tempCountry.getGdp()) {
                newArray[j + 1] = newArray[j];
                j = j - 1;
            }

            newArray[j + 1] = tempCountry;
        }

        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        /* TODO */
        ArrayList<AfricaCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AfricaCountry) {
                listCountries.add((AfricaCountry) countries[i]);
            }
        }
        AfricaCountry[] arrayCountries = new AfricaCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public AsiaCountry[] filterAsiaCountry() {
        /* TODO */
        ArrayList<AsiaCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                listCountries.add((AsiaCountry) countries[i]);
            }
        }
        AsiaCountry[] arrayCountries = new AsiaCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public EuropeCountry[] filterEuropeCountry() {
        /* TODO */
        ArrayList<EuropeCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                listCountries.add((EuropeCountry) countries[i]);
            }
        }
        EuropeCountry[] arrayCountries = new EuropeCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        /* TODO */
        ArrayList<NorthAmericaCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof NorthAmericaCountry) {
                listCountries.add((NorthAmericaCountry) countries[i]);
            }
        }
        NorthAmericaCountry[] arrayCountries = new NorthAmericaCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        /* TODO */
        ArrayList<OceaniaCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof OceaniaCountry) {
                listCountries.add((OceaniaCountry) countries[i]);
            }
        }
        OceaniaCountry[] arrayCountries = new OceaniaCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        /* TODO */
        ArrayList<SouthAmericaCountry> listCountries = new ArrayList<>();
        for (int i = 0; i < countries.length; i++) {
            if (countries[i] instanceof SouthAmericaCountry) {
                listCountries.add((SouthAmericaCountry) countries[i]);
            }
        }
        SouthAmericaCountry[] arrayCountries = new SouthAmericaCountry[listCountries.size()];
        return listCountries.toArray(arrayCountries);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByIncreasingPopulation();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByDecreasingPopulation();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByIncreasingArea();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByDecreasingArea();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByIncreasingGdp();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        /* TODO */
        Country[] arrCountries = sortByDecreasingGdp();
        Country[] outArrayCountries = new Country[howMany];

        if (howMany <= this.length) {
            for (int i = 0; i < outArrayCountries.length; i++) {
                outArrayCountries[i] = arrCountries[i];
            }
            return outArrayCountries;
        }

        return arrCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }
        
        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
