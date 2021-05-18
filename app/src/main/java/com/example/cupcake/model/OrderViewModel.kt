package com.example.cupcake.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class OrderViewModel: ViewModel() {
    private var _quantity = MutableLiveData<Int>(0)
    public val quantity :LiveData<Int> get() = _quantity

    private var _flavor = MutableLiveData<String>("")
    public val flavor :LiveData<String> get() = _flavor

    private var _date = MutableLiveData<String>("")
    public val date :LiveData<String> get() = _date

    private var _price = MutableLiveData<Double>(0.0)
    public val price :LiveData<Double> get() = _price

    fun setQuantity(numCupcakes: Int)
    {
        _quantity.value = numCupcakes
    }

    fun setFlavor(flavor: String)
    {
        _flavor.value = flavor
    }

    fun setDate(pickupDate: String)
    {
        _date.value = pickupDate
    }
}