package org.firstinspires.ftc.teamcode;

import android.os.Environment;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

@TeleOp(name = "AutoConfigurator")
public class ConfigurationUi extends OpMode {
    private static final String PATH = (
        Environment.getExternalStorageDirectory().getAbsolutePath() + "/ftc/"
    );

    private static HashMap<Class<? extends BaseConfig>, ? extends BaseConfig> configs = new HashMap<>();

    static {
//        configs.put(AllianceColor.class, null);
    }

    private static boolean deleteConfig() {
        
    }

    private static setConfig(
        Class<? extends BaseConfig> configKey
        ? extends BaseConfig
    ) {

    }

    private static void saveConfigFile() throws IOException{
        FileOutputStream file = new FileInputStream(PATH);
        ObjectInputStream configStreamOut = new ObjectInputStream(file);

        configStreamOut.writeObject(configs);
        
        configStreamOut.close();
        file.close();        

    }

    private static void loadConfigFile() throws IOException {
        FileInputStream file = new FileInputStream(PATH);
        ObjectInputStream configStreamIn = new ObjectInputStream(file);

        configs = (
            (HashMap<Class<? extends BaseConfig>, ? extends BaseConfig>) configStreamIn.readObject()
        );

        configStreamIn.close();
        file.close();
        
    }

    public static BaseConfig readConfigs(Class<BaseConfig> configClass) {
        return configs.get(configClass);

    }

    @Override
    public void init() {
        telemetry.addLine();

    }

    @Override
    public void loop() {

    }

}
