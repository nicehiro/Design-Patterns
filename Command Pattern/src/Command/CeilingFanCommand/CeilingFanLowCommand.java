package Command.CeilingFanCommand;

import CeilingFan.CeilingFan;

/**
 * Created by hiro on 17-2-6.
 */
public class CeilingFanLowCommand extends CeilingFanCommand {
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
