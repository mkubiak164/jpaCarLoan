package com.capgemini.types;

public class EmployeeSearchCriteria {

    private Integer officeId;
    private Integer carId;
    private String position;

    /**
     * Metoda pozwalająca wyszukać pracowników wg kryteriów
     * @param officeId - szukanie wg placówki
     * @param carId - szukanie wg auta którym sie zajmują
     * @param position - szukanie wg zajmowanego stanowiska
     */

    public EmployeeSearchCriteria(Integer officeId, Integer carId, String position) {
        this.officeId = officeId;
        this.carId = carId;
        this.position = position;
    }

    public Integer getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Integer officeId) {
        this.officeId = officeId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
