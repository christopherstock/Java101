
    package de.mayflower.java101;

    import com.google.api.client.util.Key;

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
