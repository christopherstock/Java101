
    package de.mayflower.java101;

    import com.google.api.client.http.GenericUrl;
    import com.google.api.client.http.HttpRequest;
    import com.google.api.client.http.javanet.NetHttpTransport;
    import com.google.api.client.json.JsonObjectParser;
    import com.google.api.client.json.jackson.JacksonFactory;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    /*******************************************************************************************************************
    *   The Application frame contains all UI Components the application makes use of.
    *******************************************************************************************************************/
    public class AppFrame implements ActionListener
    {
        /** The application's UI frame. */
        private JFrame  frame;
        /** The UI panel being contained in the application's UI frame. */
        private JPanel  panel;
        /** The button that shall request a joke on being clicked. */
        private JButton jokeButton;
        /** The text field that shows the joke after being requested. */
        private JTextField textArea;

        /***************************************************************************************************************
        *   Creates all UI components for the app.
        ***************************************************************************************************************/
        public AppFrame()
        {
            frame = new JFrame();
            frame.setTitle( "Java 101" );
            frame.setLocation( 50, 150 );
            frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

            jokeButton = new JButton();
            jokeButton.setText( "Request Joke" );
            jokeButton.addActionListener( this );

            textArea = new JTextField();
            textArea.setColumns( 100 );
            textArea.setAutoscrolls( true );

            panel = new JPanel();
            panel.add( jokeButton );
            panel.add( textArea );

            frame.add( panel );
            frame.pack();
        }

        /***************************************************************************************************************
        *   Shows the application's UI frame.
        ***************************************************************************************************************/
        public void show()
        {
            frame.setVisible( true );
        }

        /***************************************************************************************************************
        *   Being invoked when the 'Request Joke' button is clicked.
        *
        *   @param e The ActionEvent instance that contains all information about the button click event.
        ***************************************************************************************************************/
        @Override
        public void actionPerformed( ActionEvent e )
        {
            System.out.println( "Button clicked - Request a Joke!" );

            try
            {
                GenericUrl url = new GenericUrl( "http://api.icndb.com/jokes/random" );
                HttpRequest request = new NetHttpTransport().createRequestFactory().buildGetRequest( url );
                request.setParser( new JsonObjectParser( new JacksonFactory() ) );
                JokeResponse response = request.execute().parseAs( JokeResponse.class );

                textArea.setText( response.value.joke );
            }
            catch ( Throwable t )
            {
                t.printStackTrace();
            }
        }
    }
