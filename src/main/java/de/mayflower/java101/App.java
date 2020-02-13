
    package de.mayflower.java101;

    public class App
    {
        public String getGreeting()
        {
            return "Hello world.";
        }

        public static void main( String[] args )
        {
            System.out.println( new App().getGreeting() );

            new AppFrame().show();
        }
    }
