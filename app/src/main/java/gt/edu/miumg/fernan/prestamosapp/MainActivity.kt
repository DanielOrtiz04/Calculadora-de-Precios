package gt.edu.miumg.fernan.prestamosapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import gt.edu.miumg.fernan.prestamosapp.ui.theme.PrestamosAppTheme
import gt.edu.miumg.fernan.prestamosapp.views.HomeView

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