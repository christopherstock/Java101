
    package de.mayflower.java101;

    import com.google.api.client.http.GenericUrl;
    import com.google.api.client.http.HttpRequest;
    import com.google.api.client.http.HttpRequestFactory;
    import com.google.api.client.http.HttpResponse;
    import com.google.api.client.http.javanet.NetHttpTransport;

    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import java.net.http.HttpClient;

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
                HttpResponse response = request.execute();

                System.out.println( new String( response.getContent().readAllBytes() ) );
            }
            catch ( Throwable t )
            {
                t.printStackTrace();
            }
        }
    }
