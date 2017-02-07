package Command.CeilingFanCommand;

import CeilingFan.CeilingFan;
import Command.Command;

/**
 * Created by hiro on 17-2-6.
 */
public class CeilingFanCommand implements Command {

    int prevSpeed;
    CeilingFan ceilingFan;

    public CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
