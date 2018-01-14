package util;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractFileResourceScanner<R> extends ResourcesScanner<R> {
    private static Logger log = LoggerFactory.getLogger(AbstractFileResourceScanner.class);

    public AbstractFileResourceScanner() {
    }

    public final void scan(String path, IResourceScanned<R> scanned) {
        URL url = null;

        try {
            url = (new File(path)).toURI().toURL();
            log.info("Start scan the resources from " + url);
            this.handleResource(url, path, scanned);
            log.info("End scan the resources from " + url);
        } catch (IOException var5) {
            throw new RuntimeException("Exception occurs when scan resource from " + url + ".cause by " + var5.getMessage());
        }
    }

    abstract void handleResource(URL var1, String var2, IResourceScanned<R> var3) throws IOException;

    public String normalize(String sourcePath) {
        return sourcePath;
    }
}
