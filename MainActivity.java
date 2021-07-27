//Viia Mäntymäki
//lähteet: https://www.youtube.com/watch?v=GoXwIVyNvX0&t=9915s


public class MainActivity extends AppCompatActivity {

   private Spinner FinnTheaterSpinner;
   private Spinner FinnTimeSpinner;
   private Spinner FinnMovieSpinner;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       FinnTheaterSpinner = findViewById(R.id.FinnTheaterSpinner);

       ArrayList<String> Finn = new ArrayList<>();
       Finn.add("Theater");
       Finn.add("Espoo");
       Finn.add("Helsinki");
       Finn.add("Vantaa");
       Finn.add("Tampere");

       ArrayAdapter<String> FinnTheaterAdapter = new ArrayAdapter<>(
               this,
               android.R.layout.simple_spinner_dropdown_item,
               Finn
       );
       FinnTheaterSpinner.setAdapter(FinnTheaterAdapter);


       FinnTimeSpinner = findViewById(R.id.FinnTimeSpinner);

       ArrayList<String> Finntime = new ArrayList<>();
       Finntime.add("      Date and time");
       Finntime.add("Wed, 24.3.2021, 11.30 ");
       Finntime.add("Thu, 25.3.2021, 12.30");
       Finntime.add("Fri, 26.32021, 16.30 ");

       ArrayAdapter<String> FinnTimeAdapter = new ArrayAdapter<>(
               this,
               android.R.layout.simple_spinner_dropdown_item,
               Finntime
       );
       FinnTimeSpinner.setAdapter(FinnTimeAdapter);


       FinnMovieSpinner = findViewById(R.id.FinnMovieSpinner);

       ArrayList<String> Finnmovie = new ArrayList<>();
       Finnmovie.add("All movies");
       Finnmovie.add("Extinct ");
       Finnmovie.add("Follow me");
       Finnmovie.add("Parasite");

       ArrayAdapter<String> FinnMovieAdapter = new ArrayAdapter<>(
               this,
               android.R.layout.simple_spinner_dropdown_item,
               Finnmovie
       );

       FinnMovieSpinner.setAdapter(FinnMovieAdapter);

   }
}
