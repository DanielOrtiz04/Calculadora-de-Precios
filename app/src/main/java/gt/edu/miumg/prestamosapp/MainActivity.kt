package gt.edu.miumg.prestamosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import gt.edu.miumg.prestamosapp.ui.theme.PrestamosAppTheme
import gt.edu.miumg.prestamosapp.views.HomeView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrestamosAppTheme {
                HomeView()
            }
        }
    }
}