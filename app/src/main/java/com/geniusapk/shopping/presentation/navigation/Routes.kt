package com.geniusapk.shopping.presentation.navigation

import com.geniusapk.shopping.domain.models.ProductDataModels
import kotlinx.serialization.Serializable


sealed class SubNavigation {
    @Serializable
    object LoginSingUpScreen : SubNavigation()

    @Serializable
    object MainHomeScreen : SubNavigation()

}

sealed class Routes {
    @Serializable
    object LoginScreen

    @Serializable
    object SingUpScreen

    @Serializable
    object HomeScreen

    @Serializable
    object ProfileScreen

    @Serializable
    object WishListScreen

    @Serializable
    object CartScreen


    @Serializable
    object CheckoutScreen

    @Serializable
    object PayScreen

    @Serializable
    object SeeAllProductsScreen

    @Serializable
    data class EachProductDetailsScreen(
        val productID : String
    )


}