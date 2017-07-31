package contactscreen.android.acadgild.com.contactscreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ContactScreenActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_screen);

        String myData = "content://contacts/people/";
        Intent myActivity2 = new Intent(Intent.ACTION_VIEW, Uri.parse( myData) );
        startActivity(myActivity2);


    }
}
