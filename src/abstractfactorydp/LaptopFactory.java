package abstractfactorydp;

public class LaptopFactory extends AbstractDeviceFactory{

    @Override
    Device getGadget(DeviceType deviceType) {
        switch(deviceType){
            case HP:
                return new Hp("16GB","Intel","Nvidia");
            case DELL:
                return new Dell("12GB","AMD","Nvidia");
        }
        return null;
    }
}
