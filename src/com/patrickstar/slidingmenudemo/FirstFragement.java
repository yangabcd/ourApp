package com.patrickstar.slidingmenudemo;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FirstFragement extends Fragment {

	private Button btnShow;
	private TextView tv1;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		return inflater.inflate(R.layout.first, null);
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		tv1 = (TextView)getActivity().findViewById(R.id.tv1);
		btnShow = (Button)getActivity().findViewById(R.id.btn);
		btnShow.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				tv1.setText("hello");
				
			}
		});
	}
}
