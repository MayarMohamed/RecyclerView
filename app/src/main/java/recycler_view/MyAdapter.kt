package recycler_view

import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class MyAdapter(private val items: List<Item>): RecyclerView.Adapter<MyAdapter.ViewHolder>()
{
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val imageView = itemView.findViewById<ImageView>(R.id.imageView)
        val textView : TextView = itemView.findViewById(R.id.textView)
    }
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int):ViewHolder
    {
        val view= LayoutInflater.from(parent.context).
        inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder,position: Int)
    {
        val item = items[position]
        holder.imageView.setImageResource(item.imageResId)
        holder.textView.text=item.text
    }
    override fun getItemCount() =items.size
}