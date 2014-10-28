package chinotech_pc_repair.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static android.view.View.OnClickListener;


public class ChinoFacts extends Activity {

    public static final String TAG = ChinoFacts.class.getSimpleName();
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);


        // Declare our view variables and assign them the view from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.FactsTextView);
        final Button showFactButton = (Button) findViewById(R.id.ShowFactsButton);
        final RelativeLayout relativelayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listner = new OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mFactBook.getfact();
                //Update the label with our dynamic fact
                factLabel.setText(fact);

                int color = mColorWheel.getColor();
                relativelayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(Listner);

        //Toast.makeText(this, "Yay! Our Activity was created", Toast.LENGTH_LONG).show();
        Log.d(TAG,"We're logging from the onCreate() method!");

    }
}
