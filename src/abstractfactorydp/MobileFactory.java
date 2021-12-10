package abstractfactorydp;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch(deviceType){
            case SAMSUNG:
                return new Samsung("12GB","Intel");
            case ONEPLUS:
                return new Oneplus("8gb","Qualcom");
        }
        return null;
    }
}
