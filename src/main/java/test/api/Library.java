package test.api;

/**
 * Test library @{code Class}.
 * @author sverre
 */
public class Library {

    /**
     * Some library method takes in a @{code String} value.
     * <p>
     * The OpenJDK from AdoptOpenJDK gives the following error:
     * <p>
     * error: tag not supported in the generated HTML version: tt
     * @param value
     *            a value
     * @return <tt>true</tt>
     */
    public boolean someLibraryMethod(String value) {
        return true;
    }

    /**
     * This method Javadoc from distribution OpenJDK complains:
     * <p>
     * warning - Parameter "value" is documented more than once.
     * <p>
     * The OpenJDK from AdoptOpenJDK has a different warning:
     * <p>
     * warning: @param "value" has already been specified
     * @param value
     *            some value
     * @param value
     */
    public void distributionJavaComplains(String value) {
    }

    /**
     * My distribution OpenJDK complains about this:
     * <p>
     * warning - Tag @author cannot be used in method documentation.
     * @author sverre
     */
    public void authorInMethod() {
    }
}
