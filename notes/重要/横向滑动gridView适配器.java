package adapter_putil;

/**
 * Created by Administrator on 2016/3/29.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.qf.vvideo.R;

import java.util.List;

import Path_Bean.XiLie_HGridView_bean;

/**GirdView 数据适配器*/
public class XiLie_hGridView_Adapter extends BaseAdapter {
    private Context context;
    private List<XiLie_HGridView_bean> list;
    public XiLie_hGridView_Adapter(Context _context, List<XiLie_HGridView_bean> _list) {
        this.list = _list;
        this.context = _context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.xilie_hgridview_layout, null);
        TextView tvCity = (TextView) convertView.findViewById(R.id.tvCity);
        XiLie_HGridView_bean city = list.get(position);

        tvCity.setText(city.getCityName());
        return convertView;
    }
}


