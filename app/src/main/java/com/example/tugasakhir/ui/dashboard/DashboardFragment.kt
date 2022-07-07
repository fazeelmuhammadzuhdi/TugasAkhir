package com.example.tugasakhir.ui.dashboard

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tugasakhir.*
import com.example.tugasakhir.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.gambar1.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), MainActivity::class.java)
            startActivity(intent)
        }

        binding.ly8.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), PendaftaranActivity::class.java)
            startActivity(intent)
        }

        binding.ly7.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), ProfilActivity::class.java)
            startActivity(intent)
        }
        binding.ly5.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), PerbandinganBindingActivity::class.java)
            startActivity(intent)
        }

        binding.orang.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), ProfilActivity::class.java)
            startActivity(intent)
        }

        binding.ly4.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), KalkulatorActivity::class.java)
            startActivity(intent)
        }

        binding.ly3.setOnClickListener {
            val intent = Intent(this@DashboardFragment.requireContext(), MainActivity::class.java)
            startActivity(intent)
        }
        return root
    }



    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}