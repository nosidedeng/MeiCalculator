package cn.noside.meicalculator;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView iv = new ImageView(this);
        iv.setImageResource(R.drawable.logo_v4_2);


        WindowManager wm=(WindowManager)getApplicationContext().getSystemService(Context.WINDOW_SERVICE);
        WindowManager.LayoutParams wmParams = new WindowManager.LayoutParams();
        wmParams.type=2002;  //type是关键，这里的2002表示系统级窗口，你也可以试试2003。
        wmParams.format=1;
        /**
         *这里的flags也很关键
         *代码实际是wmParams.flags |= FLAG_NOT_FOCUSABLE;
         *40的由来是wmParams的默认属性（32）+ FLAG_NOT_FOCUSABLE（8）
         */
        wmParams.flags=40;
        wmParams.width=40;
        wmParams.height=40;
        wm.addView(iv, wmParams);//创建View

    }


}
