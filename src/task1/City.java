package task1;

public class City {
   private String name;
    private Integer amountOfCitizens;
    private String state;
    private String country;

    public City(String name, Integer amountOfCitizens, String state, String country) throws Exception {
        if(name.equals("")) throw new Exception();
        this.name = name;
        this.amountOfCitizens = amountOfCitizens;
        this.state = state;
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmountOfCitizens() {
        return amountOfCitizens;
    }

    public void setAmountOfCitizens(Integer amountOfCitizens) {
        this.amountOfCitizens = amountOfCitizens;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
