package com.trackerteer.simpletest.screens

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.trackerteer.simpletest.R
import com.trackerteer.simpletest.databinding.ActivityMainBinding
import com.trackerteer.simpletest.utilities.ItemAdapter
import com.trackerteer.simpletest.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var mItemAdapter: ItemAdapter
    private val mMainViewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initConfig()
    }

    private fun initConfig() {
        initBinding()
        initAdapter()
    }

    private fun initBinding() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.lifecycleOwner = this
        mBinding.viewModel = mMainViewModel
    }

    private fun initAdapter() {
        mItemAdapter = ItemAdapter()
        mBinding.recyclerView.adapter = mItemAdapter
    }
}