
package abrstractfactory;

public class AbrstractFactory {

    public static void main(String[] args) {
        IFabricaDeCameras cam_Canon = new FabricaCanon();
        
        ICameraFullFrame Caml = cam_Canon.criarCameraFullFrame();
        
        Caml.exibirInfoCameraFullFrame();
        
        ICameraCrop Cam2 = cam_Canon.criarCameraCrop();
        
        Cam2.exibirInfoCameraCrop();
        
        IFabricaDeCameras cam_Nikon = new FabricaNikon();
        
        ICameraCrop Cam3 = cam_Nikon.criarCameraCrop();
        
        Cam3.exibirInfoCameraCrop();
        
        ICameraFullFrame Cam4 = cam_Nikon.criarCameraFullFrame();
        
        Cam4.exibirInfoCameraFullFrame();
    }
    
}
