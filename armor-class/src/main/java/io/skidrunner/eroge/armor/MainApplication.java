package io.skidrunner.eroge.armor;
import com.jme3.app.SimpleApplication;

public class MainApplication extends SimpleApplication {

	@Override
	public void simpleInitApp() {
		rootNode.attachChild(assetManager.loadModel("Scenes/TestLevel/TestLevel.obj"));
	}
	
}
