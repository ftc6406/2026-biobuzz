package org.firstinspires.ftc.teamcode;

import android.os.Environment;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import java.util.HashMap;


@TeleOp(name = "AutoConfigurator")
public class ConfigurationUi extends OpMode {
    private static final String DIRECTORY = (
            Environment.getExternalStorageDirectory().getAbsolutePath() + "/ftc/"
    );

    private static HashMap<Class<? extends BaseConfig>, ? extends BaseConfig> configs = new HashMap<>();

    static {
//        configs.put(AllianceColor.class, null);
    }
    public ConfigurationUi() {

    }

    public static BaseConfig readConfigs(Class<BaseConfig> configClass) {


        return null;

    }

    @Override
    public void init() {


    }

    @Override
    public void loop() {

    }

}
