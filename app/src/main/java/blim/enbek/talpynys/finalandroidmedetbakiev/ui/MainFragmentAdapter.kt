package blim.enbek.talpynys.finalandroidmedetbakiev.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import blim.enbek.talpynys.domain.model.Chapters
import blim.enbek.talpynys.finalandroidmedetbakiev.databinding.AdapterItemBinding

class MainFragmentAdapter() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var allChapters: List<Chapters.Chapter>

    inner class ViewHolder(var binding: AdapterItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun initContent(
            chapter: Chapters.Chapter
        ) {
            binding.textView.text = chapter.nameArabic
        }
    }

    fun submitList(list: List<Chapters.Chapter>) {
        allChapters = list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = AdapterItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as MainFragmentAdapter.ViewHolder
        viewHolder.initContent(allChapters[position])
    }

    override fun getItemCount(): Int = allChapters.size
}