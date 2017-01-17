package apps.bkh.bootstrapandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.List;

/**
 * Created by BKH on 11/01/2017.
 */

public class TodoAdapter extends ArrayAdapter<TodoObject> {

    private Context context;
    private List<TodoObject> objects;

    public TodoAdapter(Context context, List<TodoObject> objects) {
        super(context, R.layout.todo_row, objects);
        this.context= context;
        this.objects = objects;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.todo_row, parent, false);

        TodoObject currentObject = objects.get(position);

        TextView tvLabel = (TextView) rowView.findViewById(R.id.tvLabel);
        tvLabel.setText(currentObject.getValue1());

        CheckBox cbTodo = (CheckBox) rowView.findViewById(R.id.cbTodo);
        cbTodo.setChecked(currentObject.isChecked());
        return rowView;
    }


}
