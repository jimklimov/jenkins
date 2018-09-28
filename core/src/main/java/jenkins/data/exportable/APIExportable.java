package jenkins.data.exportable;

import javax.annotation.CheckForNull;

/**
 * @author Antonio Muniz
 */
public interface APIExportable<T extends APIResource> {
    @CheckForNull
    default T toResource() {
        return null;
    }
}