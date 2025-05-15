package br.senai.sp.jandira.profile.service

import br.senai.sp.jandira.profile.model.Character
import br.senai.sp.jandira.profile.model.Result
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {

    @GET("character")
    fun listAll(): Call<Result>

    @GET("character/{id}")
    fun findById(@Path("id")id: Int): Call<Character>


}