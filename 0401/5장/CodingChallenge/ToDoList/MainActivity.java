package kr.co.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText taskEditText;
    private Button addTaskButton;
    private LinearLayout taskListLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taskEditText = findViewById(R.id.taskEditText);
        addTaskButton = findViewById(R.id.addTaskButton);
        taskListLayout = findViewById(R.id.taskListLayout);

        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taskText = taskEditText.getText().toString().trim();
                if (!taskText.isEmpty()) {
                    addTask(taskText);
                    taskEditText.setText("");
                }
            }
        });
    }

    private void addTask(String taskText) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText(taskText);
        checkBox.setChecked(false); // 초기 상태는 미완료로 설정

        // 체크 박스 클릭 시 완료/미완료 상태 전환
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox clickedCheckBox = (CheckBox) v;
                boolean isChecked = clickedCheckBox.isChecked();
                // 여기에서 완료 또는 미완료 상태에 대한 처리를 추가할 수 있습니다.
            }
        });

        taskListLayout.addView(checkBox);
    }
}
