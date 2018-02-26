package mik.easj.skole.androidlistviewandarrayadapter;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class StudentCategoriActivity extends ListActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_student_categori);


        ListView listView = getListView();
        TextView header = new TextView(this);

        header.setTextSize(header.getTextSize() * 1.1f);
        header.setText("Student Liste");
        listView.addHeaderView(header);

        StudentAdapter adapter = new StudentAdapter(this, R.layout.student_item, Student.studentlist);
        listView.setAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(StudentCategoriActivity.this,studentActivity.class);
        intent.putExtra(studentActivity.EXTRA_STUDENTNO, id);
        startActivity(intent);

    }

}
