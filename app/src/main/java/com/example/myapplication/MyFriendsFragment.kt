package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman: ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("Samsul","Laki-Laki","samsul@stimata.ac.id","08889898923","Malang"))
        listTeman.add(MyFriend("Supri","Laki-Laki","Supri@gmail.com","08892323123","Kab.Malang"))
        listTeman.add(MyFriend("Refi","Laki-Laki","Refi@gmail.com","08822323123","Kab.Malang"))
        listTeman.add(MyFriend("Rani","Perempuan","Rani@gmail.com","08812323123","Bandung"))
        listTeman.add(MyFriend("Nada","Perempuan","Nada@gmail.com","08892333123","Bandung"))
        listTeman.add(MyFriend("Jupri","Laki-Laki","Jupri@gmail.com","08799232223","Kab.Malang"))
        listTeman.add(MyFriend("Sulis","Perempuan","Sulis@gmail.com","08799232223","Kab.Malang"))
        listTeman.add(MyFriend("Nova","Laki-Laki","Nova@gmail.com","08799232223","Kab.Malang"))
        listTeman.add(MyFriend("Mei","Perempuan","Mei@gmail.com","08799232223","Kab.Malang"))
        listTeman.add(MyFriend("Sasa","Perempuan","Sasa@gmail.com","08799232223","Surabya"))

    }

    private fun tampilTeman(){
        rv_listMtyFriends.layoutManager=LinearLayoutManager(activity)
        rv_listMtyFriends.adapter=MyFriendAdapter(activity!!,listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}