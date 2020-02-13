
    package de.mayflower.java101;

    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.JTextField;

    public class AppFrame
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
    }
