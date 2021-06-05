
package abrstractfactory;

public class FabricaNikon implements IFabricaDeCameras {
    
    @Override
    public ICameraFullFrame criarCameraFullFrame() {
        return new D650();
    }
    
    public ICameraCrop criarCameraCrop() {
        return new D3500();
    }
}
