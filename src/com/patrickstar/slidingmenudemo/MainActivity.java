package com.patrickstar.slidingmenudemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

/*
 * 首先需要导入项目中的slidingmenulibary.jar
 */

public class MainActivity extends FragmentActivity {

	private Button btnFirst;
	private Button btnSecond;
	private FrameLayout flayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flayout = (FrameLayout)findViewById(R.id.flayout);
        
        SlidingMenu menu = new SlidingMenu(this);
        menu.setMode(SlidingMenu.LEFT);  
        // 设置触摸屏幕的模式  
        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN); 
        //设置菜单界面与主界面中间分割条的宽度
        menu.setShadowWidthRes(R.dimen.shadow_width);  
        //分割条的背景图片
        menu.setShadowDrawable(R.drawable.shadow);  
  
        // 设置滑动菜单视图的宽度  
        menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);  
        // 设置渐入渐出效果的值  
        menu.setFadeDegree(0.35f);  
        /** 
         * SLIDING_WINDOW will include the Title/ActionBar in the content 
         * section of the SlidingMenu, while SLIDING_CONTENT does not. 
         */  
        menu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);  
        //为侧滑菜单设置布局  
        menu.setMenu(R.layout.leftmenu); 
    }

    @Override
    protected void onStart() {
    	super.onStart();
    	
    	btnFirst = (Button)findViewById(R.id.btnFirst);
    	btnFirst.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				flayout.removeAllViews();
				FirstFragement first = new FirstFragement();
				getFragmentManager().beginTransaction().add(R.id.flayout, first).commit();
				
			}
		});
    	btnSecond = (Button)findViewById(R.id.btnSecond);
    	btnSecond.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				flayout.removeAllViews();
				SecondFragement second = new SecondFragement();
				getFragmentManager().beginTransaction().add(R.id.flayout, second).commit();
				
			}
		});
    	
    }
}
