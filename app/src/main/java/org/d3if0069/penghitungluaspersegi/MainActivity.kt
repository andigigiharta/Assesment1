package org.d3if0069.penghitungluaspersegi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.d3if0069.penghitungluaspersegi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tambahkan aksi pada tombol Hitung
        binding.hitungButton.setOnClickListener {
            hitungLuas()
        }
    }

    private fun hitungLuas() {
        // Ambil nilai sisi dari EditText
        val sisi = binding.sisiEditText.text.toString().toDoubleOrNull()

        if (sisi == null) {
            // Jika input kosong atau tidak valid, tampilkan pesan kesalahan
            binding.hasilTextView.text = "Masukkan nilai sisi yang valid"
        } else {
            // Hitung luas dan tampilkan hasilnya
            val luas = sisi * sisi
            binding.hasilTextView.text = "Luas: $luas"
        }
    }
}

