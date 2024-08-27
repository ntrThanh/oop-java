package hus.oop.lab8.countrymanager.countryarraymanager;

public class EuropeCountry extends Country {
    private int population;
    private double area;
    private double gdp;

    public EuropeCountry(String code,
                         String name,
                         int population,
                         double area,
                         double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "EuropeCountry" + '[' +
                "population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ']';
    }
}
