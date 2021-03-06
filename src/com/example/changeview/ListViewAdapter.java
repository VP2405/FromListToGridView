package com.example.changeview;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListViewAdapter extends ArrayAdapter<Component> {

	public ListViewAdapter(Context context, int textViewResourceId, List<Component> objects) {
		super(context, textViewResourceId, objects);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View curView = convertView;
		
		if (curView == null) {
		    LayoutInflater vi = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		    curView = vi.inflate(R.layout.component_list, null);
		}    
		
		Component cp = getItem(position);
		
		//sets the layouts for the item
		TextView title = (TextView) curView.findViewById (R.id.title);
		TextView subtitle = (TextView) curView.findViewById (R.id.subtitle);
		
		//sets the title and the subtitle for the current component
		title.setText(cp.getTitle());
		subtitle.setText(cp.getSubtitle());
		
		return curView;

	}
	
}
