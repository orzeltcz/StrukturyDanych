package task1;

import oracle.jrockit.jfr.StringConstantPool;

import java.util.ArrayList;
import java.util.List;

public class Country {
    private String countryName;
    private List<City> cities = new ArrayList<>();



    public void setCities(City ct) {
        cities.add(ct);
        this.countryName = ct.getCountry();
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (City ct: cities)  {
            if (ct.getCountry().equals("Polska"))
                sb.append(ct.getName()+" "+ct.getState()+"\n");

        }

        return sb.toString();
    }
}
