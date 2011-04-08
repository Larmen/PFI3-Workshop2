package se.mah.k3.larmen.com.essemmess;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText edittext1 = (EditText) findViewById(R.id.editText1);
        final EditText edittext2 = (EditText) findViewById(R.id.editText2);
        final Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
        	public void onClick(View v){
        		//Perform action on click
        		Toast.makeText(Main.this, edittext2.getText().toString(), Toast.LENGTH_LONG).show();  
        		edittext1.setText("");
        		edittext2.setText("");
        	}   	
        	       });
        
        
        
        
    }
}