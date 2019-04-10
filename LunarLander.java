public class LunarLander{
    public static void main(String... args){
        final int Starthoehe = Integer.parseInt(args[0]);
        final int Masse = Integer.parseInt(args[1]);
        final int Schubkraft = Integer.parseInt(args[2]);

        final double gravity = 1.62519;

        double altitude = (gravity * Starthoehe * Masse) / Schubkraft;
        //altitude_ff is new altitude for freefall-altitude
        double altitude_ff = Starthoehe - altitude;
        double freefall = Math.sqrt(altitude_ff*2/gravity);
        //Firing_time in sec
        double firing_time = (freefall/altitude_ff*Starthoehe)-freefall;
        double max_speed = gravity*freefall;

        System.out.println(String.format( "%.1f", freefall));
        System.out.println(String.format( "%.1f", firing_time));
        System.out.println(String.format( "%.2f", max_speed));
        System.out.println(String.format( "%.1f", altitude));    
        }
}
