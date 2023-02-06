package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view: HomeContract.View): HomeContract.Present {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    override fun retrieveFavoriteTransfers(){
        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object: HomeContract.OnResponseCallback{
            override fun onResponse(favoriteList: List<FavoriteTransfer>) {
                UserSingleton.getInstance().userName = "hola"

                val user = User.Builder()
                    .setUserName("hola")
                    .build()

                view.hideLoader()
                view.showFavoriteTransfers(favoriteList)
            }

        })

    }
}