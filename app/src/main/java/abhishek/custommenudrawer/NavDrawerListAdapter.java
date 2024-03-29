package abhishek.custommenudrawer;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class NavDrawerListAdapter extends BaseAdapter {
	
	private Context context;
    private String[] titles;

    public NavDrawerListAdapter(Context context, String[] titles){
		this.context = context;
        this.titles = titles;
	}

	@Override
	public int getCount() {
		return titles.length;
	}

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater)
                    context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.drawer_list_item, null);
        }
         

        TextView txtTitle = (TextView) convertView.findViewById(R.id.title);

        txtTitle.setText(titles[position]);
        

        
        return convertView;
	}

}
