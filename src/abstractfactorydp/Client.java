package abstractfactorydp;

public class Client {
    public static void main(String[] args) {
        Device dell=FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());
        Device samsung=FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getGadget(DeviceType.SAMSUNG);
        System.out.println(samsung.getDetails());
        System.out.println(samsung.toString());
    }
}
