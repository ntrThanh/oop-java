package test.exam.countrymanager;

import java.util.ArrayList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int length) {
        countries = new Country[length];
        this.length = 0;
    }

    public Country[] getCountries() {
        return countries;
    }

    public int getLength() {
        return length;
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
        Country[] newArray = new Country[this.countries.length * 2];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if (index < 0 || index > this.length) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }
        for (int i = this.length; i > index; i++) {
            countries[i] = countries[i - 1];
        }
        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if (index < 0 || index > this.length) {
            return false;
        }
        for (int i = index; i < this.length; i++) {
            countries[i] = countries[i + 1];
        }
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if (index < 0 || index > this.length) {
            return null;
        }

        return this.countries[index];
    }

    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int index = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[index].getPopulation() > newArray[j].getPopulation()) {
                    index = j;
                }
            }

            if (index != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[index];
                newArray[index] = temp;
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length; i++) {
            int index = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[index].getPopulation() < newArray[j].getPopulation()) {
                    index = j;
                }
            }

            if (index != i) {
                Country temp = newArray[i];
                newArray[i] = newArray[index];
                newArray[index] = temp;
            }
        }

        return newArray;
    }

    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (Double.compare(newArray[i].getArea(), newArray[j].getArea()) > 0) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByDecreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = i + 1; j < newArray.length; j++) {
                if (Double.compare(newArray[i].getArea(), newArray[j].getArea()) < 0) {
                    Country temp = newArray[i];
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }

        return newArray;
    }

    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int number = newArray.length;
        for (int i = 0; i < number; ++i) {
            Country key = newArray[i];
            int j = i - 1;

            while(j >= 0 &&
                    Double.compare(newArray[j].getGdp(), key.getGdp()) > 0) {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }

            newArray[j + 1] = key;
        }

        return newArray;
    }

    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);

        int number = newArray.length;
        for (int i = 0; i < number; ++i) {
            Country key = newArray[i];
            int j = i - 1;

            while(j >= 0 &&
                    Double.compare(newArray[j].getGdp(), key.getGdp()) > 0) {
                newArray[j + 1] = newArray[j];
                j -= 1;
            }

            newArray[j + 1] = key;
        }

        return newArray;
    }

    public static String codeOfCountryToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        for (int i = 0; i < countries.length; i++) {
            Country country = countries[i];
            if (country != null) {
                codeOfCountries.append(country.getCode()).append(" ");
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
        System.out.println(countriesString.toString().trim() + "]");
    }

    public EuropeCountry[] filterAfricaCountry() {
        List<EuropeCountry> list = new ArrayList<>();

        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                list.add((EuropeCountry) countries[i]);
            }
        }
        EuropeCountry[] resultArray = new EuropeCountry[list.size()];
        return list.toArray(resultArray);
    }

    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> list = new ArrayList<>();

        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof AsiaCountry) {
                list.add((AsiaCountry) countries[i]);
            }
        }
        AsiaCountry[] resultArray = new AsiaCountry[list.size()];
        return list.toArray(resultArray);
    }

    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> list = new ArrayList<>();

        for (int i = 0; i < this.length; i++) {
            if (countries[i] instanceof EuropeCountry) {
                list.add((EuropeCountry) countries[i]);
            }
        }
        EuropeCountry[] resultArray = new EuropeCountry[list.size()];
        return list.toArray(resultArray);
    }
}
