package com.zenkriztao.otaku.android.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.*
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.ramcosta.composedestinations.generated.NavGraphs
import com.zenkriztao.otaku.android.presentation.browse.BrowseScreen
import com.zenkriztao.otaku.android.presentation.mymanga.MyMangaScreen
import com.zenkriztao.otaku.android.presentation.theme.MangaTheme
import com.zenkriztao.otaku.android.presentation.theme.composables.BottomBarDestination
import com.zenkriztao.otaku.android.presentation.theme.composables.MangakuBottomBar

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MangaTheme {
                DestinationsNavHost(navGraph = NavGraphs.root)
            }
        }
    }
}

@Destination<RootGraph>(start = true)
@Composable
fun MainScreen(
    navigator: DestinationsNavigator
) {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    // Use Scaffold to organize the layout and add Material Design Bottom Bar
    Scaffold(
        bottomBar = {
            MangakuBottomBar(
                currentRoute = currentRoute,
                onSelect = {
                    navController.navigate(it) {
                        // Handle navigation with animations and preserve the state
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }

                        launchSingleTop = true
                        restoreState = true
                        // Apply transition animation for the navigation
                        animatingTransition()
                    }
                }
            )
        },
        backgroundColor = MaterialTheme.colors.background
    ) { padding ->
        NavHost(
            navController = navController,
            startDestination = BottomBarDestination.BROWSE.route,
            modifier = Modifier
                .padding(padding)
                .fillMaxSize() // Ensures full usage of the screen space
        ) {
            composable(route = BottomBarDestination.BROWSE.route) {
                BrowseScreen(navigator)
            }
            composable(route = BottomBarDestination.MY_MANGA.route) {
                MyMangaScreen(navigator)
            }
        }
    }
}

// Animation Function for Navigation Transitions
@Composable
fun animatingTransition() {
    val transition = androidx.compose.animation.core.animateFloatAsState(
        targetValue = 1f,
        animationSpec = tween(durationMillis = 300)
    )
    // Apply transition animation logic here
}

// Material Button with Animation
@Composable
fun AnimatedMaterialButton(onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .padding(16.dp)
            .animateContentSize() // Animate button size change
            .fillMaxWidth(),
        colors = ButtonDefaults.buttonColors(backgroundColor = MaterialTheme.colors.primary)
    ) {
        Text(text = "Click Me", color = Color.White)
    }
}

// Material Card with Animated Elevation
@Composable
fun AnimatedMaterialCard() {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .animateContentSize(), // Animate content size changes
        elevation = 8.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Card Title", style = MaterialTheme.typography.h6)
            Text("Card content goes here.")
        }
    }
}
