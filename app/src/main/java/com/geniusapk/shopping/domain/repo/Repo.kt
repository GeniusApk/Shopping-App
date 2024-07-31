package com.geniusapk.shopping.domain.repo

import android.net.Uri
import com.geniusapk.shopping.common.ResultState
import com.geniusapk.shopping.domain.models.CategoryDataModels
import com.geniusapk.shopping.domain.models.UserData
import com.geniusapk.shopping.domain.models.UserDataParent
import kotlinx.coroutines.flow.Flow

interface Repo {
    fun registerUserWithEmailAndPassword(userData: UserData):Flow<ResultState<String>>
    fun loginUserWithEmailAndPassword(userData: UserData):Flow<ResultState<String>>
    fun getuserById(uid:String): Flow<ResultState<UserDataParent>>
    fun upDateUserData(userDataParent: UserDataParent):Flow<ResultState<String>>
    fun userProfileImage(uri: Uri):Flow<ResultState<String>>
    fun getCategoriesInLimited (): Flow<ResultState<List<CategoryDataModels>>>

}