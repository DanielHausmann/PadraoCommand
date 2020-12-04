package remoteloader;

public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl rm = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garage = new GarageDoor();
        CeillingFan ceillingFan = new CeillingFan("Living Room");
        Stereo stereo = new Stereo("Living Room");

        //Luzes
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightsOffCommand livingRoomLightOff = new LightsOffCommand(livingRoomLight);
        rm.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightsOffCommand kitchenLightOff = new LightsOffCommand(kitchenLight);
        rm.setCommand(1, kitchenLightOn, kitchenLightOff);
        //Garagem
        GarageUpCommand garageUp = new GarageUpCommand(garage);
        GarageDownCommand garageDown = new GarageDownCommand(garage);
        rm.setCommand(2, garageUp, garageDown);
        //ventilador de teto
        CeillingFanHighCommand ceillingFanHigh = new CeillingFanHighCommand(ceillingFan);
        CeillingFanMediumCommand ceillingFanMedium = new CeillingFanMediumCommand(ceillingFan);
        CeillingFanLowCommand ceillingFanLow = new CeillingFanLowCommand(ceillingFan);
        CeillingFanOffCommand ceillingFanOff = new CeillingFanOffCommand(ceillingFan);
        rm.setCommand(3, ceillingFanHigh, ceillingFanOff);
        rm.setCommand(4, ceillingFanMedium, ceillingFanOff);
        rm.setCommand(5, ceillingFanLow, ceillingFanOff);
        //Stereo
        StereoOnWithCDCommand stereoWithCD = new StereoOnWithCDCommand(stereo);
        StereoOnWithDVDCommand stereoWithDVD = new StereoOnWithDVDCommand(stereo);
        StereoOnWithRadioCommand stereoWithRadio = new StereoOnWithRadioCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        rm.setCommand(6, stereoWithCD, stereoOff);
        rm.setCommand(7, stereoWithDVD, stereoOff);
        rm.setCommand(8, stereoWithRadio, stereoOff);

        System.out.println(rm);

        rm.onButtonWasPushed(0);
        rm.offButtonWasPushed(0);
        rm.onButtonWasPushed(1);
        rm.offButtonWasPushed(1);
        rm.onButtonWasPushed(2);
        rm.offButtonWasPushed(2);
        rm.onButtonWasPushed(3);
        rm.offButtonWasPushed(3);
        rm.onButtonWasPushed(4);
        rm.offButtonWasPushed(4);
        rm.onButtonWasPushed(5);
        rm.offButtonWasPushed(5);
        rm.onButtonWasPushed(6);
        rm.offButtonWasPushed(6);
        rm.onButtonWasPushed(7);
        rm.offButtonWasPushed(7);
        rm.onButtonWasPushed(8);
        rm.offButtonWasPushed(8);

    }

}
