package com.example.kanazawaapp_2019.Model

class SnackModel{
    var name: String = ""
    var comment: String = ""

    constructor(){}

    constructor(name: String, comment: String){
        this.name = name
        this.comment = comment
    }
}