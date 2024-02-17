package org.sel.usoltsev_drawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.navigation.NavigationView
import org.sel.usoltsev_drawer.databinding.ActivityMainBinding
    private lateinit var binding: ActivityMainBinding
    private lateinit var navContr: NavController
    private lateinit var conf: AppBarConfiguration
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navContr = findNavController(R.id.fragmentContainerView)
        conf=AppBarConfiguration(
            setOf(
                R.id.item1,
                R.id.item2,
                R.id.item3,
            ), binding.drawer
        )
        setupActionBarWithNavController(navContr, conf)
        binding.navView
    }

}