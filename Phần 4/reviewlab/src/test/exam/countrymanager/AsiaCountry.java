package test.exam.countrymanager;

public class AsiaCountry extends Country {
    private int population;
    private double area;
    private double gdp;

    public AsiaCountry(String code, String name, int population, double area, double gdp) {
        super(code, name);
        this.population = population;
        this.area = area;
        this.gdp = gdp;
    }

    @Override
    public int getPopulation() {
        return population;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getGdp() {
        return gdp;
    }

    @Override
    public String toString() {
        return "AsiaCountry" + '[' + "name=" + name +
                ", population=" + population +
                ", area=" + area +
                ", gdp=" + gdp +
                ']';
    }
}
