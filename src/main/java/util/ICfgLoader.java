package util;


import java.util.List;

public interface ICfgLoader<P> {
    List<CfgDTO> load(P var1);
}
