import CeilingFan.CeilingFan;
import Command.CeilingFanCommand.CeilingFanHighCommand;
import Command.CeilingFanCommand.CeilingFanOffCommand;
import Command.LightCommand.LightOffCommand;
import Command.LightCommand.LightOnCommand;
import Light.Light;

/**
 * Created by hiro on 17-2-6.
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen Room");

        CeilingFan ceilingFan = new CeilingFan("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRommLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanHighCommand livingRoomCeilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOffCommand livingRoomCeilingFanOff = new CeilingFanOffCommand(ceilingFan);

        System.out.println(remoteControl);

        remoteControl.setCommand(0, livingRoomLightOn, livingRommLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, livingRoomCeilingFanHigh, livingRoomCeilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed(0);

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);

        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed(2);
    }
}
