package com.test.checkbox2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        CheckBox enableBox = (CheckBox) findViewById(R.id.enabled);

        enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked) {
                    Toast.makeText(getApplicationContext(), "Включено", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Выключено", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

//Слушатель OnCheckedChangeListener определен в базовом классе CompoundButton и определяет один метод - onCheckedChanged.
// Первый параметр этого метода buttonView - сам измененный флажок CheckBox. А второй параметр isChecked указывает, отмечен ли флажок.
//
//При изменении состояния флажка будет выводиться во всплывающем окне соответствующее уведомление