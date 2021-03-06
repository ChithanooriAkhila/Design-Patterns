package abstractfactorydp;

public class Oneplus extends Device{
    private String ram;
    private String processor;
    public Oneplus(String ram, String processor){
        this.ram=ram;
        this.processor=processor;
    }
    @Override
    public String getDetails() {
        return "Oneplus configuration is: " + this.ram + " and processor type is: " + this.processor;
    }

    @Override
    public String toString(){
        return "Oneplus{" + "ram='" +ram +'\'' + " ,processor='" +processor +'\'';
    }
}
