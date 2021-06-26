package com.dcht69.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class ResultLogin extends AppCompatActivity {
    private Menu mnuComment;
    private TextView txtUserName;
    private TextView txtEmail;
    private Account account;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_login);
        Intent intent = getIntent();
        account = new Account();
        account = (Account) intent.getSerializableExtra("login");

        addControl();
    }

    private void addControl() {
        txtEmail = findViewById(R.id.txtEmail);
        txtUserName = findViewById(R.id.txtUserName);
        txtUserName.setText(account.getUserName());
        txtEmail.setText(account.getEmail());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_bar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.mnuComment) ;
        {
            startActivity(new Intent(ResultLogin.this, CommentActivity.class));

        }
        return super.onOptionsItemSelected(item);
    }
}