package com.brunoleonardo.examen2

import java.io.Serializable
import java.util.ArrayList

public class Matiere(val matiere: Matiere, val note: Double) : Serializable {

    override fun toString(): String {
        return "Matiere(nom='$matiere', note=$note)"
    }
}








