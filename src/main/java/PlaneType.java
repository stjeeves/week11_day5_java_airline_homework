public enum PlaneType {
    BOEING747(1200, 250),
    BOEING737(1000, 150),
    AIRBUSA380(1150, 200);

    private final int weight;
    private final int capacity;

    PlaneType(int weight, int capacity){
        this.weight = weight;
        this.capacity = capacity;
    }

    public int getWeight(){
        return weight;
    }

    public int getCapacity(){
        return capacity;
    }

}

