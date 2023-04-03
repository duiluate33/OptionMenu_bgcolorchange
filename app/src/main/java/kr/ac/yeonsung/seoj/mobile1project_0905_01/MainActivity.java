package kr.ac.yeonsung.seoj.mobile1project_0905_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout rootLayout;
    Button btn1; //메뉴 실행에 따라 움직이는 버튼
    int deg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rootLayout = findViewById(R.id.root_layout);
        btn1 = findViewById(R.id.btn1);
    }
//res폴더에 만든 directory = file과 같음
    //메뉴인플레이터를 쓰게 되면 옵션메뉴에 등록할 수 있으면서 사용도 가능
    //인플레이터 참조변수 선언
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu); //객체 생성에서 메뉴에 등록함
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //return break; 아님
            case R.id.item_red:
                rootLayout.setBackgroundColor(Color.RED);
                //rootLayout.setBackgroundColor(Color.rgb(0,0,255));
                return true;

            case R.id.item_yellow:
                rootLayout.setBackgroundColor(Color.YELLOW);
                return true;

            case R.id.item_blue:
                rootLayout.setBackgroundColor(Color.BLUE);
                return true;

            case R.id.item_rotation:
                deg += 45; //버튼 누를때마다 각도 변경
                btn1.setRotation(deg);
                //btn1.setRotation(45);
                return true;

            case R.id.item_size:
                btn1.setScaleX(2);
                return true;

            case R.id.item_origin:
                btn1.setRotation(0);
                btn1.setScaleX(1);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}