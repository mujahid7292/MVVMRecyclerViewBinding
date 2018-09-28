package sand.www.newmvvmrecyclerviewbinding.RvAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import sand.www.newmvvmrecyclerviewbinding.Model.News;
import sand.www.newmvvmrecyclerviewbinding.R;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.MyViewHolder> {

    private ArrayList<News> arrayListNews;

    public RvAdapter(ArrayList<News> arrayListNews) {
        this.arrayListNews = arrayListNews;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.single_news,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        News news = arrayListNews.get(position);
        holder.txtTitle.setText(news.getTitle());
        holder.txtDescription.setText(news.getDescription());
    }

    @Override
    public int getItemCount() {
        return arrayListNews.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtTitle,txtDescription;
        public MyViewHolder(View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            txtDescription = itemView.findViewById(R.id.txtDescription);
        }
    }
}
