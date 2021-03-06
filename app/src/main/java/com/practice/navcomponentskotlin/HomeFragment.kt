package com.practice.navcomponentskotlin


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bt_student.setOnClickListener()
        {
            //navigate via destination id
            it.findNavController().navigate(R.id.studentFragment)
        }

        bt_teacher.setOnClickListener {
            //navigate using action id
            it.findNavController().navigate(R.id.action_homeFragment_to_teacherFragment)
        }
    }


}
