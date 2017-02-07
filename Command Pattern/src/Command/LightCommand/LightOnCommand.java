package Command.LightCommand;

import Command.Command;
import Light.Light;

/**
 * Created by hiro on 17-2-6.
 */
public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
         light.off();
    }
}
