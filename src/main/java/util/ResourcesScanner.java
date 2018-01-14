package util;

import java.io.InputStream;

public abstract class ResourcesScanner<R> {
    public ResourcesScanner() {
    }

    public abstract R getAsResource(String var1, String var2, String var3, InputStream var4);

    public abstract void scan(String var1, IResourceScanned<R> var2);

    public final void scan(IResourceScanned<R> scanned, String... paths) {
        String[] arr$ = paths;
        int len$ = paths.length;

        for(int i$ = 0; i$ < len$; ++i$) {
            String path = arr$[i$];
            this.scan(path, scanned);
        }

    }
}
