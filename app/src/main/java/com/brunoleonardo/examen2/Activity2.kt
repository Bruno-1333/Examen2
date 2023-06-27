package com.brunoleonardo.examen2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.brunoleonardo.examen2.databinding.Activity2Binding

class Activity2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    var matiereCourrante : Matiere = Matiere(ArrayList<Matiere>(), "")
    var carnetNotes : CarnetNotes = CarnetNotes()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.listeMatiers.setOnItemClickListener { parent, view, position, id ->
            matiereCourrante.matiere = binding.listeMatiers.getItemAtPosition(position).toString()
            binding.txtrecep.text = matiereCourrante.toString()

            binding.listeMatiers.setOnItemClickListener { parent, view, position, id ->
                matiereCourrante.matiere = binding.listeMatiers.getItemAtPosition(position).toString()
                binding.txtrecep.text = matiereCourrante.toString()
            }

            binding.btnAjouter.setOnClickListener {
                carnetNotes.ajouterMatiere(matiereCourrante)
                matiereCourrante = Matiere(ArrayList<String>(), "")
                Toast.makeText(this, "Matiere ajoutée", Toast.LENGTH_SHORT).show()

            binding.btnConsulter.setOnClickListener {
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
            }


    }
}



