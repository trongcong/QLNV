package exampleandroidnc.mytestfinal;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by trong on 23-10-2015 by Congnt.
 */
public class CustomObj extends ArrayAdapter<Obj> {
    Context context;
    ArrayList<Obj> arrTT;

    public CustomObj(Context context, int resource, ArrayList<Obj> arrTT) {
        super(context, resource, arrTT);
        this.context = context;
        this.arrTT = arrTT;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.custom, parent, false);


        TextView tvTen = (TextView) rowView.findViewById(R.id.tvTen);
        TextView tvDiaChi = (TextView) rowView.findViewById(R.id.tvDiaChi);
        TextView tvSDT = (TextView) rowView.findViewById(R.id.tvSDT);
        TextView tvNgaySinh = (TextView) rowView.findViewById(R.id.tvNgaySinh);
        TextView tvGioiTinh = (TextView) rowView.findViewById(R.id.tvGioiTinh);
        ImageView imgTT = (ImageView) rowView.findViewById(R.id.imgTT);

        tvTen.setText(arrTT.get(position).getTen().toString());
        tvDiaChi.setText(arrTT.get(position).getDiachi().toString());
        tvSDT.setText(arrTT.get(position).getSodienthoai().toString());
        tvNgaySinh.setText(arrTT.get(position).getNgaysinh().toString());
        tvGioiTinh.setText(arrTT.get(position).getGioitinh().toString());

        imgTT.setImageResource(R.drawable.std);

        return rowView;
    }
}
