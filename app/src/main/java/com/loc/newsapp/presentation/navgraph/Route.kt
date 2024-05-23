package com.loc.newsapp.presentation.navgraph

sealed class Route (
    val route: String
) {
    object  OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomScreen : Route(route = "homeScreen")
    object SearchScreen: Route(route = "bookmarkScreen")
    object DetailsScreen : Route(route = "detailScreen")
    object AppStartNavigation : Route(route = "appStartNavigation")
    object NewsNavigation : Route(route = "newsNavigation")
    object NewsNavigatorScreen : Route(route = "newsNavigator")
}