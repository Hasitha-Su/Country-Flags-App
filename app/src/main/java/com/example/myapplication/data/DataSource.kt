import com.example.myapplication.R
import com.example.myapplication.model.Country

/**
 * An object to generate a static list of Countries
 */
object DataSource {

   val dogs: List<Country> = listOf(
      Country(
         R.drawable.argentina,
         "Argentina",

      ),
      Country(
         R.drawable.australia,
         "Australia",
      )
   )
}