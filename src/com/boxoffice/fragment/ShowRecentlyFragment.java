package com.boxoffice.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.boxoffice.R;

public class ShowRecentlyFragment extends Fragment{
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v=View.inflate(getActivity(), R.layout.fragment_boxoffice, null);

		return v;
		
	}

}
