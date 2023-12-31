package com.example.youxmap.ui.mypage

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.youxmap.databinding.FragmentMyPageBinding
import com.example.youxmap.ui.quiz.QuizWrongActivity

class MyPageFragment : Fragment() {

    private var _binding: FragmentMyPageBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myPageViewModel =
            ViewModelProvider(this).get(MyPageViewModel::class.java)

        _binding = FragmentMyPageBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textNotifications
//        myPageViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }

        binding.cvMyWrong.setOnClickListener {
            //오답노트 페이지로 이동
            val i = Intent(requireContext(), QuizWrongActivity::class.java)
            startActivity(i)
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}