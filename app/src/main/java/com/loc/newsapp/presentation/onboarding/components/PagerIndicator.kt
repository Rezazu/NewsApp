package com.loc.newsapp.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.loc.newsapp.presentation.Dimens.IndicatorSize
import com.loc.newsapp.ui.theme.BlueGray

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    pageSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = BlueGray
) {
    Row(
        modifier = Modifier
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Start
    ) {
        repeat(pageSize) { iteration ->
            Box(
                modifier = modifier
                    .padding(2.dp)
                    .clip(CircleShape)
                    .background(if (selectedPage == iteration) selectedColor else unselectedColor)
                    .size(IndicatorSize),
            )
        }
    }
}