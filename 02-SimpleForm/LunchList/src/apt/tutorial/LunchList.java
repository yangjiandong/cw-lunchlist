package apt.tutorial;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;

public class LunchList extends Activity {
    //Restaurant r = new Restaurant();
    List<Restaurant>model=new ArrayList<Restaurant>();
    ArrayAdapter<Restaurant>adapter=null;

    RadioGroup types;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button save = (Button) findViewById(R.id.save);

        save.setOnClickListener(onSave);
        ListView list = (ListView)findViewById(R.id.restaurants);
        adapter = new ArrayAdapter<Restaurant>(this, android.R.layout.simple_list_item_1, model);
        list.setAdapter(adapter);
    }

    private View.OnClickListener onSave = new View.OnClickListener() {
        public void onClick(View v) {
            EditText name = (EditText) findViewById(R.id.name);
            EditText address = (EditText) findViewById(R.id.addr);
            Restaurant r = new Restaurant();

            r.setName(name.getText().toString());
            r.setAddress(address.getText().toString());

            types = (RadioGroup) findViewById(R.id.types);
            switch (types.getCheckedRadioButtonId()) {
            case R.id.sit_down:
                r.setType("sit_down");
                break;

            case R.id.take_out:
                r.setType("take_out");
                break;

            case R.id.delivery:
                r.setType("掌握");
                break;
            }

            //System.out.println(r);
            adapter.add(r);
        }
    };
}