package com.cristianvillamil.platziwallet.ui.transfer.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "transfers")
data class TransferEntity(
    @ColumnInfo(name = "transaction_Id")
    @PrimaryKey(autoGenerate = true)
    val transactionId: Int = 0,
    @ColumnInfo(name = "user_Id")
    val userId: String,
    @ColumnInfo(name = "user_Name")
    val userName: String,
    @ColumnInfo(name = "transaction_Date")
    val transactionDate: String,
    @ColumnInfo(name = "transaction_Amount")
    val transactionAmount: String,
    @ColumnInfo(name = "receiver_User_Id")
    val receiverUserId: String
)
