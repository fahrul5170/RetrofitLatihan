package id.fahrulrazi.retrofitlatihan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PostAdapter(val postModel: MutableList<PostModel>):RecyclerView.Adapter<PostViewHollder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHollder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.card_posts, parent, false)
        return PostViewHollder(view)
    }

    override fun onBindViewHolder(holder: PostViewHollder, position: Int) {
       return holder.bindView(postModel[position])
    }

    override fun getItemCount(): Int {
       return postModel.size
    }
}

class PostViewHollder(itemView: View): RecyclerView.ViewHolder (itemView){
    private val tvTitle: TextView = itemView.findViewById(R.id.tvTitle)
    private val tvBody: TextView = itemView.findViewById(R.id.tvBody)

    fun bindView(postModel: PostModel){
        tvTitle.text = postModel.title
        tvBody.text = postModel.body
    }
}