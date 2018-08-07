package net.itgoo.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import net.itgoo.validator.RequiredValidator;
import net.itgoo.validator.Validator;
import net.itgoo.validator.ValidatorResult;
import net.itgoo.validator.Validators;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void valid(View view) {
        EditText nameEt = (EditText) findViewById(R.id.activity_main_name_et);
        EditText pwdEt = (EditText) findViewById(R.id.activity_main_password_et);

        Validators validators = new Validators();
        List<ValidatorResult> results = new ArrayList<>();
        results.addAll(validators.valid(nameEt.getText().toString(), new Validator[] {
                new RequiredValidator("用户名不能为空")
        }));
        results.addAll(validators.valid(pwdEt.getText().toString(), new Validator[] {
                new RequiredValidator("密码不能为空")
        }));

        if (results.size() > 0) {
            ValidatorResult result = results.get(0);
            Toast.makeText(this, result.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}
