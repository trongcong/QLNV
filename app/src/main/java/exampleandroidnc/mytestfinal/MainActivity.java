package exampleandroidnc.mytestfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

import static exampleandroidnc.mytestfinal.R.id.radioGT;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Obj> arrObj = new ArrayList<>();
    EditText edTen, edDiaChi, edNgaySinh, edSoDienThoai;
    Button btnCancel, btnSave;
    String GT = "";
    private RadioGroup radioGTGroup;
    private RadioButton radioGTButton;
    private RadioButton radioNam;
    private RadioButton radioNu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

//        radioNam.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                GT = radioNam.getText().toString();
//                Toast.makeText(MainActivity.this, GT, Toast.LENGTH_SHORT).show();
//            }
//        });
//        radioNu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                GT = radioNu.getText().toString();
//                Toast.makeText(MainActivity.this, GT, Toast.LENGTH_SHORT).show();
//            }
//        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // get selected radio button from radioGroup
                int selectedId = radioGTGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                radioGTButton = (RadioButton) findViewById(selectedId);
                Toast.makeText(MainActivity.this, radioGTButton.getText(), Toast.LENGTH_SHORT).show();

                //Intent i=new Intent(MainActivity.this, ChiTietActivity.class);

                arrObj.add(new Obj(edTen.getText().toString(), edDiaChi.getText().toString(),
                        edNgaySinh.getText().toString(), radioGTButton.getText().toString(),
                        edSoDienThoai.getText().toString()));

                startActivity(new Intent(MainActivity.this, ChiTietActivity.class));

                Log.d("arr", radioGTButton.getText() + "");
                edSoDienThoai.setText("");
                edNgaySinh.setText("");
                edDiaChi.setText("");
                edTen.setText("");
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edSoDienThoai.setText("");
                edNgaySinh.setText("");
                edDiaChi.setText("");
                edTen.setText("");
            }
        });
    }

    private void initView() {
        radioNam = (RadioButton) findViewById(R.id.radioNam);
        radioNu = (RadioButton) findViewById(R.id.radioNu);
        edTen = (EditText) findViewById(R.id.edTen);
        edDiaChi = (EditText) findViewById(R.id.edDiaChi);
        edNgaySinh = (EditText) findViewById(R.id.edNgaySinh);
        edSoDienThoai = (EditText) findViewById(R.id.edDienThoai);
        btnCancel = (Button) findViewById(R.id.btnCancel);
        btnSave = (Button) findViewById(R.id.btnSave);
        radioGTGroup = (RadioGroup) findViewById(radioGT);
    }
}
