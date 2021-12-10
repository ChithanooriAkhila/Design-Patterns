package abstractfactorydp;

public class Dell extends Device{
    private String ram;
    private String processor;
    private String gpu;
    public Dell(String ram, String processor, String gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=gpu;
    }
    @Override
    public String getDetails() {
        return "Dell configuration is: " + this.ram + " and processor type is: " + this.processor + " and gpu type is: " + this.gpu ;
    }

    @Override
    public String toString(){
        return "Dell{" + "ram='" +ram +'\'' + " ,processor='" +processor +'\'';
    }
}
