class Notebook {
    private String model;
    private String processorModel;
    private int ram;
    private int hdd;
    private double cpuFrequency;
    private double price;

    public Notebook(String model, String processorModel, int ram, int hdd, double cpuFrequency, double price) {
        this.model = model;
        this.processorModel = processorModel;
        this.ram = ram;
        this.hdd = hdd;
        this.cpuFrequency = cpuFrequency;
        this.price = price;
    }

    public String getModel() { return model; }
    public String getProcessorModel() { return processorModel; }
    public int getRam() { return ram; }
    public int getHdd() { return hdd; }
    public double getCpuFrequency() { return cpuFrequency; }
    public double getPrice() { return price; }

}