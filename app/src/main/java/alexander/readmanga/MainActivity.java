package alexander.readmanga;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Person myPerson = new Person("Александр", 21);

        String[] arr ={"Action", "Adventure", "Drama", "Sci-fi", "Supernatural"};

        final Manga firstManga = new Manga("Flower-dream", arr, 1196, "53723124", "ad/asdqearvcw", 141642013, 2,"Flower Dream");

        Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(myPerson.toString());
            }
        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println(firstManga.toString());
            }
        });
    }
}
