package lockdown.org.listviewdemoapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    ListView lvCourses;
    public void onCreate(Bundle b)
    {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        lvCourses = findViewById(R.id.lvCourses);
        ArrayList al = new ArrayList();
        al.add("Java ");
        al.add("Android ");
        al.add("Machine Learning ");
        al.add("Hadoop ");
        al.add("Advanced Java ");

        ArrayAdapter aa = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,al);
        lvCourses.setAdapter(aa);
        lvCourses.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                TextView tv = (TextView)view;
                String data = tv.getText().toString();
                Toast.makeText(MainActivity.this,"Selected Course : "+data,Toast.LENGTH_LONG).show();
            }
        });
    }
}