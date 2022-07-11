package com.example.shoppinglist.Domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository){
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}