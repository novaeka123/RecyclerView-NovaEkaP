package com.example.myapplication

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.ScrollingTabContainerView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.my_friends_item.*
import java.security.AccessControlContext

class MyFriendAdapter(private val context: Context, private val item: ArrayList<MyFriend>):
    RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)=ViewHolder (
        LayoutInflater.from(context).inflate(R.layout.my_friends_item,parent,false)
    )

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(item.get(position))
    }
    class ViewHolder(override val containerView:View):
            RecyclerView.ViewHolder(containerView),LayoutContainer{
                fun bindItem(item:MyFriend){
                    txtFriensName.text=item.nama
                    txtFriendsEmail.text=item.email
                    txtFriendsTelp.text=item.telp
                }
            }
}