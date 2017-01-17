package apps.bkh.bootstrapandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by BKH on 11/01/2017.
 */

public class TodoActivity extends Activity {

    ListView lvBoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        lvBoot = (ListView) findViewById(R.id.lvBoot);

        TodoObject ob1 = new TodoObject("Doing bootstrap", "hello");
        ob1.setChecked(true);

        TodoObject ob2 = new TodoObject("Doing todo", "hello");
        ob2.setChecked(false);


        ArrayList<TodoObject> todoObjects = new ArrayList<>();
        todoObjects.add(ob1);
        todoObjects.add(ob2);

        TodoAdapter adapter = new TodoAdapter(this, todoObjects);
        lvBoot.setAdapter(adapter);
    }
}
