package hn.bk.nguyenduccanh.imichome;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickChuyenDoi(View view) {
       
        if (view.getId()==R.id.lnDanhSach){
            Intent i = new Intent(MainActivity.this,DanhSachKhoaHocActivity.class);
            startActivity(i);
        } else if (view.getId()==R.id.lnDangKi){
            Intent i = new Intent(MainActivity.this,DangKiHocActivity.class);
            startActivity(i);}
        else if (view.getId()==R.id.lnGiangVien){
            Intent i = new Intent(MainActivity.this,GiangVienActivity.class);
            startActivity(i);}
        else if (view.getId()==R.id.lnHoiDap){
            Intent i = new Intent(MainActivity.this,HoiDapActivity.class);
            startActivity(i);}
        else if (view.getId()==R.id.lnThongTin){
            Intent i = new Intent(MainActivity.this,ThongTinCaNhanActivity.class);
            startActivity(i);}
    }
}
