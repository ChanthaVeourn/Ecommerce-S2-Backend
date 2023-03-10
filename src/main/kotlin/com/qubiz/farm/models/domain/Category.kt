package com.qubiz.farm.models.domain

import com.qubiz.farm.base.BaseEntity
import javax.persistence.*

@Entity
data class Category(
    var name: String? = null,
    var imageFileName: String? = null,
    @ManyToMany(fetch = FetchType.LAZY)
    var products: MutableList<Product>? = null
) : BaseEntity()
