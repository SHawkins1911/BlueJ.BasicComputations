 
import static java.lang.Math.PI;
import java.util.Random;

public class NormalizeAngle {
       NormalizeAngle n = new NormalizeAngle(); 
    public Integer normalizeValueUsingModulo(Integer angle){
        angle = angle % 360;
        angle = (angle + 360) % 360;
        if (angle > 180)
            angle -= 360;
        return angle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int angle = integer;
        int y =  360;
        int normalized = Math.floorMod(angle, y);
        System.out.println(normalized);
        
        return normalized;
    }

    public static void main(String[] args){
        
    }
}
