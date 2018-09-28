package sand.www.newmvvmrecyclerviewbinding;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import sand.www.newmvvmrecyclerviewbinding.Model.News;
import sand.www.newmvvmrecyclerviewbinding.RvAdapter.RvAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RvAdapter mAdapter;
    private LinearLayoutManager mLinearLayOut;
    private ArrayList<News> newsArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        newsArrayList = new ArrayList<>();
        mAdapter = new RvAdapter(newsArrayList);
        mLinearLayOut = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLinearLayOut);
        recyclerView.setAdapter(mAdapter);
        //WithoutMVVMRecyclerViewBinding

        setDataInRv();
    }

    private void setDataInRv() {
        News news1 = new News("This Is Title 1",
                "This Is Description 1");
        News news2 = new News("This Is Title 2",
                "This Is Description 2");
        News news3 = new News("This Is Title 3",
                "This Is Description 3");
        News news4 = new News("This Is Title 4",
                "This Is Description 4");
        News news5 = new News("This Is Title 5",
                "This Is Description 5");
        News news6 = new News("This Is Title 6",
                "This Is Description 6");

        newsArrayList.add(news1);
        newsArrayList.add(news2);
        newsArrayList.add(news3);
        newsArrayList.add(news4);
        newsArrayList.add(news5);
        newsArrayList.add(news6);

    }
}
