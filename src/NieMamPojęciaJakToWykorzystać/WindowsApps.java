package NieMamPojęciaJakToWykorzystać;

import java.io.IOException;

public class WindowsApps {




    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}
// Uruchomienie obiektu o tej klasie:


