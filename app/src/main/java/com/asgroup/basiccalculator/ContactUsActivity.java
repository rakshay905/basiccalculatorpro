package com.asgroup.basiccalculator;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ContactUsActivity extends AppCompatActivity {

    private TextView contactEmail;
    private ImageView fb, insta;
    private String[] emails = new String[2];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        contactEmail = findViewById(R.id.contact_email);
        fb = findViewById(R.id.fb_img);
        insta = findViewById(R.id.insta_img);


        String email = getString(R.string.email);
        final String facebook = getString(R.string.facebook);
        final String instagram = getString(R.string.insta);

        emails[0] = email;

        contactEmail.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new AppUtils(ContactUsActivity.this).composeEmail(emails, "Calculator Pro: Contact", "");
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(facebook));
                startActivity(intent);

            }
        });

        insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(instagram));
                startActivity(intent);

            }
        });




    }
}
