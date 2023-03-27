public class CarBuilder {
    private Car car;

    public CarBuilder() {
        this.car = new Car();
    }

    public Car build() {
        if(this.car.getModel().equals("")) {
            throw new IllegalArgumentException("Model is invalid");
        }

        if(this.car.getManufacturer().equals("")) {
            throw new IllegalArgumentException("Manufacturer is invalid");
        }

        if(this.car.getFuelType().equals("")) {
            throw new IllegalArgumentException("Fuel type is invalid");
        }

        if(this.car.getDoorsNumber() == 0) {
            throw new IllegalArgumentException("Number of doors is invalid");
        }
        return this.car;
    }

    public CarBuilder setModel(String model) {
        this.car.setModel(model);
        return this;
    }

    public CarBuilder setManufacturer(String manufacturer) {
        this.car.setManufacturer(manufacturer);
        return this;
    }

    public CarBuilder setManufacturerYear(String manufacturerYear) {
        this.car.setManufacturerYear(manufacturerYear);
        return this;
    }

    public CarBuilder setFuelType(String fuelType) {
        this.car.setFuelType(fuelType);
        return this;
    }

    public CarBuilder setTankCapacity(Double tankCapacity) {
        this.car.setTankCapacity(tankCapacity);
        return this;
    }

    public CarBuilder setMileage(Double mileage) {
        this.car.setMileage(mileage);
        return this;
    }

    public CarBuilder setColor(String color) {
        this.car.setColor(color);
        return this;
    }

    public CarBuilder setDoorsNumber(Integer doorsNumber) {
        this.car.setDoorsNumber(doorsNumber);
        return this;
    }
}
