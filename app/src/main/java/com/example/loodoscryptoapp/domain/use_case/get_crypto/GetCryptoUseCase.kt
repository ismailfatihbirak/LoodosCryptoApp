package com.example.loodoscryptoapp.domain.use_case.get_crypto

import android.util.Log
import com.example.loodoscryptoapp.domain.model.Root
import com.example.loodoscryptoapp.domain.repository.CryptoRepo
import com.example.loodoscryptoapp.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.lang.Exception
import javax.inject.Inject


class GetCryptoUseCase @Inject constructor(private val repository : CryptoRepo) {
    fun executeGetCrypto() : Flow<Resource<List<Root>>> = flow{
        try {
            emit(Resource.Loading())
            val cryptoList = repository.getCrypto()
            emit(Resource.Success(cryptoList))
        }catch (e : Exception){
            emit(Resource.Error(e.message.toString()))
        }
    }
}








