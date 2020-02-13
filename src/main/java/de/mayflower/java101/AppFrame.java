
    package de.mayflower.java101;

    import com.google.api.client.http.GenericUrl;
    import com.google.api.client.http.HttpRequest;
    import com.google.api.client.http.javanet.NetHttpTransport;
    import com.google.api.client.json.JsonFactory;
    import com.google.api.client.json.JsonObjectParser;
    import com.google.api.client.json.jackson.JacksonFactory;
    import com.google.api.client.testing.json.MockJsonFactory;
    import com.google.api.client.util.ObjectParser;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class AppFrame implements ActionListener
    {
        private JFrame  frame;
        private JPanel  panel;
        private JButton jokeButton;
        private JTextField textArea;

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

        public void show()
        {
            frame.setVisible( true );
        }

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

                System.out.println( response.type );

            }
            catch ( Throwable t )
            {
                t.printStackTrace();
            }
        }
    }
