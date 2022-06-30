public class Converter {
    Converter(){
    }
    void converter(int stepsSum){
        double distance = stepsSum*0.0075;
        double kiloCalories = stepsSum *50 / 1000;
        System.out.println("distance: "+distance +" km");
        System.out.println("KiloCalories: "+kiloCalories);
    }
}