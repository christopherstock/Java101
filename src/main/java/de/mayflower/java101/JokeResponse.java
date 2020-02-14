
    package de.mayflower.java101;

    import com.google.api.client.util.Key;

    /*******************************************************************************************************************
    *   Represents the JSON response body for a call to the International Chuck Norris Database
    *   for requesting a random joke from http://api.icndb.com/jokes/random.
    *******************************************************************************************************************/
    public class JokeResponse
    {
        @Key( "type" )
        public String type;

        @Key( "value" )
        public Value value;

        public static class Value
        {
            @Key( "id" )
            public int id;

            @Key( "joke" )
            public String joke;

            @Key( "categories" )
            public String[] categories;
        }
    }
