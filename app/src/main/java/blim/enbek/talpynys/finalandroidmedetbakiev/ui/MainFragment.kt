package blim.enbek.talpynys.finalandroidmedetbakiev.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import blim.enbek.talpynys.finalandroidmedetbakiev.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private var binding: FragmentMainBinding? = null
    private val viewModel:MainFragmentViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.chapters.observe(viewLifecycleOwner, Observer {
            val adapter = MainFragmentAdapter()
            adapter.submitList(it!!.chapters)
            binding?.rcView?.adapter = adapter
        })
    }



}