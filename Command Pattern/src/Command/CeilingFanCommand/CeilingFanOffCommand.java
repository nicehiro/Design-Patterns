package Command.CeilingFanCommand;

import CeilingFan.CeilingFan;

/**
 * Created by hiro on 17-2-6.
 */
public class CeilingFanOffCommand extends CeilingFanCommand {
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }
}
