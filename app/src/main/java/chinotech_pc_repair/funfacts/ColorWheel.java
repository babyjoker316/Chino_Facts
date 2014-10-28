package chinotech_pc_repair.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Chino on 10/13/2014.
 */
public class ColorWheel {
    // member variable properties about the objects)
    public String[] mColors = {

            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    //method (abilities: things the object can do)
    public int getColor() {



        String color = "";

        // Randomly select a fact
        Random randomGenerator = new Random(); // Construct a new number generator
        int randomnumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomnumber];
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
