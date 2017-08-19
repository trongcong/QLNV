package exampleandroidnc.mytestfinal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class ChiTietActivity extends AppCompatActivity {

    ListView lvChitiet;
    CustomObj customObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

        lvChitiet = (ListView) findViewById(R.id.lvChiTiet);

        customObj = new CustomObj(this,android.R.layout.simple_list_item_1,
                MainActivity.arrObj);
        lvChitiet.setAdapter(customObj);
    }
}
