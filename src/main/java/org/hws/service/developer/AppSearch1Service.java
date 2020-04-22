package org.hws.service.developer;



import org.hws.pojo.DataDictionary;

import java.util.List;

public interface AppSearch1Service {
    List<DataDictionary> appStatus();
    List<DataDictionary> appFlatform();
}
