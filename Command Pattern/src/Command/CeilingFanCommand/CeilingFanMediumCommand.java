package Command.CeilingFanCommand;

import CeilingFan.CeilingFan;

/**
 * Created by hiro on 17-2-6.
 */
public class CeilingFanMediumCommand extends CeilingFanCommand {

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
}
