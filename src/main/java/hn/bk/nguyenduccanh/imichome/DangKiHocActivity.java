package hn.bk.nguyenduccanh.imichome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class DangKiHocActivity extends Activity {
    Spinner spKhoaHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ki_hoc);
        spKhoaHoc=findViewById(R.id.sp_dangki);
        List<String> list = new ArrayList<>();
        list.add("Lựa chọn khóa học");
        list.add("Lập trình Android");
        list.add("Lập trình Node Js");
        list.add("Lập trình Kotlin");
        list.add("Lập trình IOS");
        list.add("Lập trình Web với J2EE");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spKhoaHoc.setAdapter(adapter);
        spKhoaHoc.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void onRadioButton(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rbDangKiHoc:
                if (checked)

                    break;
            case R.id.rbHocThu:
                if (checked)

                    break;

        }
    }
}
