package com.brunoleonardo.examen2

public class CarnetNotes {
    public fun calculerMoyenne(matiere: List<Double>): String {
        val moyenneMatiere = matiere.average()
        val moyenne: String = if (moyenneMatiere < 60) {
        "Échec"
        } else if (moyenneMatiere < 70) {
        "F"
        } else if (moyenneMatiere < 80) {
        "C"
        } else if (moyenneMatiere < 90) {
        "B"
        } else {
        "A"
        }
        val totalMoyenne = moyenneMatiere + (matiere.size * 2.0)
        return "$moyenne ($totalMoyenne)"
    }

    fun ajouterMatiere(matiere: List<Double>, note: Double) {
        matiere.add(Matiere(matiere, note))
    }
}