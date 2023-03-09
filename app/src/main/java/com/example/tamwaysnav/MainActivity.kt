package com.example.tamwaysnav

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity(), UsersAdapter.ClickListener {

    private lateinit var rvUsers: RecyclerView
    private lateinit var usersAdapter: UsersAdapter;
    private lateinit var toolbar: Toolbar;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initData();
    }

    private fun initData(){
        rvUsers = findViewById(R.id.rvUsers)
        toolbar = findViewById(R.id.tbtoolbar)
        this.setSupportActionBar(toolbar)
        this.supportActionBar!!.title = ""
        initRecyclerView();
    }

    private fun initRecyclerView(){
        rvUsers.layoutManager = LinearLayoutManager(this)
        rvUsers.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        usersAdapter = UsersAdapter(this);
        rvUsers.adapter = usersAdapter;
        showData();


    }

    private fun populateUsers():List<UserModel>{

        var userList = ArrayList<UserModel>()
        userList.add(UserModel("NB Gate"))
        userList.add(UserModel("ABB Entrance"))
        userList.add(UserModel("NB 1st Floor"))
        userList.add(UserModel("NB 2nd Floor"))
        userList.add(UserModel("NB 3rd Floor"))
        userList.add(UserModel("NB 4th Floor"))
        userList.add(UserModel("NB 5th Floor"))
        userList.add(UserModel("NB 6th Floor"))
        userList.add(UserModel("NB 7th Floor"))
        userList.add(UserModel("ABB 1st Floor"))
        userList.add(UserModel("ABB 2nd Floor"))
        userList.add(UserModel("ABB 3rd Floor"))
        userList.add(UserModel("ABB 4th Floor"))
        userList.add(UserModel("ABB 5th Floor"))
        userList.add(UserModel("ABB 6th Floor"))

        return userList;
    }

    private fun showData(){
        usersAdapter.setData(populateUsers())
    }

    override fun clickedItem(userModel: UserModel) {
        Log.e("TAG", userModel.username);

        when(userModel.username){
            "NB Gate"->
                startActivity(Intent(this@MainActivity, SelectedOne::class.java))
            "ABB Entrance"->
                startActivity(Intent(this@MainActivity, Selected2::class.java))
            "NB 1st Floor"->
                startActivity(Intent(this@MainActivity, Selected3::class.java))
            "NB 2nd Floor"->
                startActivity(Intent(this@MainActivity, Selected4::class.java))
            "NB 3rd Floor"->
                startActivity(Intent(this@MainActivity, Selected5::class.java))
            "NB 4th Floor"->
                startActivity(Intent(this@MainActivity, Selected6::class.java))
            "NB 5th Floor"->
                startActivity(Intent(this@MainActivity, Selected7::class.java))
            "NB 6th Floor"->
                startActivity(Intent(this@MainActivity, Selected8::class.java))
            "NB 7th Floor"->
                startActivity(Intent(this@MainActivity, Selected9::class.java))


            else -> {
                Toast.makeText(this,"Wala pa", Toast.LENGTH_LONG).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search_menu,menu)
        var menuItem = menu!!.findItem(R.id.searchView)
        var searchView: SearchView = menuItem.actionView as SearchView
        searchView.maxWidth = Int.MAX_VALUE

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                usersAdapter.filter.filter(newText)
                return true;
            }

        })
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

}

