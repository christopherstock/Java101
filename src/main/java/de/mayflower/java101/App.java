
    package de.mayflower.java101;

    /*******************************************************************************************************************
    *   The main class that contains the main method.
    *******************************************************************************************************************/
    public class App
    {
        /***************************************************************************************************************
        *   Delivers the greeting for this app.
        *
        *   @return The app greeting string.
        ***************************************************************************************************************/
        public String getGreeting()
        {
            return "Hello world.";
        }

        /***************************************************************************************************************
        *   The main method that acts as the application's entry point.
        *
        *   @param args Arguments being propagated over the command line.
        ***************************************************************************************************************/
        public static void main( String[] args )
        {
            System.out.println( new App().getGreeting() );

            new AppFrame().show();
        }
    }
