package pl.jaceklaskowski.guice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class App
{
    @Inject @Named("port") public int port;

    public int getPort() {
        return port;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World at " + new App().getPort() + "!" );
    }
}
