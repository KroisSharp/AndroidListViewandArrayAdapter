package mik.easj.skole.androidlistviewandarrayadapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class studentActivity extends Activity {

    public static final String EXTRA_STUDENTNO = "student number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        Intent intent = getIntent();
        int studentNo = intent.getIntExtra(EXTRA_STUDENTNO,1);
        Student student = Student.studentlist[studentNo];

        TextView name = (TextView)findViewById(R.id.Name);
        name.setText(student.getName());

        TextView lastname = (TextView)findViewById(R.id.LastName);
        lastname.setText(student.getLastname());


    }
}
