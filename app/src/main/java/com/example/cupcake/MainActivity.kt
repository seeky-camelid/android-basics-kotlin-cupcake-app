/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.cupcake

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
/**
 * Activity for cupcake order flow.
 * This code uses a parameterized constructor AppCompatActivity(@LayoutRes int contentLayoutId) which
 * takes in a layout that will be inflated as part of super.onCreate(savedInstanceState).
 */
class MainActivity : AppCompatActivity(R.layout.activity_main)
{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Get a hold of the navController associated with this nav host
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        // Show a title in the app bar based off of the destination's label, and display the Up button
        // whenever you're not on a top-level destination.
        setupActionBarWithNavController(navController)
    }
}