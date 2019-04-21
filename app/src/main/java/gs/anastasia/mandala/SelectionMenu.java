package gs.anastasia.mandala;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class SelectionMenu extends AppCompatActivity {

    Button aboutMandala;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_menu);

        aboutMandala=(Button)findViewById(R.id.aboutMandala);
        aboutMandala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectionMenu.this, AboutMandala.class));
            }
        });
    }
}
