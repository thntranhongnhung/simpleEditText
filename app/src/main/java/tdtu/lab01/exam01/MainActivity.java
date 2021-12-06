package tdtu.lab01.exam01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
//518H0043 - Trần Hồng Nhung
public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText.addTextChangedListener(enterTextWatcher);
        if(editText.getText().toString().equals("OFF")){
            button.setEnabled(false);
        }
        if(editText.getText().toString().equals("ON")){
            button.setEnabled(true);
        }
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString().equals("")){
                    Toast.makeText(MainActivity.this,"Vui long nhap thong tin",Toast.LENGTH_LONG).show();

                }

                else {


                    textView.setText(editText.getText().toString());
                    editText.setText("");
                }


            }
        });
    }
    private TextWatcher enterTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {


        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            if(editText.getText().toString().equals("OFF")){
                button.setEnabled(false);
            }
            if(editText.getText().toString().equals("ON")){
                button.setEnabled(true);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };
}