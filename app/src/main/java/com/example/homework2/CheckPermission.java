package com.example.homework2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CheckPermission extends AppCompatActivity {

    EditText iD;
    Button checkButt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_permission);

        iD = findViewById(R.id.idedittext);
        checkButt = findViewById(R.id.checkbutton);

        checkButt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String idStr = iD.getText().toString();
                AlertDialog.Builder dialog = new AlertDialog.Builder(CheckPermission.this);
                dialog.setTitle("ผลการตรวจสอบสิทธิเลือกตั้ง");
                dialog.setPositiveButton("OK", null);
                if (idStr.length() == 13) {
                    if (idStr.matches("1111111111111") || idStr.matches("2222222222222")) {
                        dialog.setMessage("คุณเป็นผู้มีสิทธิเลือกตั้ง");
                        dialog.show();
                    } else {
                        dialog.setMessage("คุณไม่มีสิทธิเลือกตั้ง");
                        dialog.show();
                    }
                } else {
                    Toast.makeText(CheckPermission.this, "กรุณากรอกหมายเลขบัตรประชาชน 13 หลัก", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}