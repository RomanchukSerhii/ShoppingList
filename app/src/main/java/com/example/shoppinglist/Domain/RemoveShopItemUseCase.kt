package com.example.shoppinglist.Domain

class RemoveShopItemUseCase(private val shopListRepository: ShopListRepository){
    fun removeShopItem(shopItem: ShopItem){
        shopListRepository.removeShopItem(shopItem)
    }
}