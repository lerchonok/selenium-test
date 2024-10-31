package readConfig;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public interface ConfigProvider {
    Config config = readConfig();

    static Config readConfig(){
        return ConfigFactory.load("app.conf");
    }

    String URL = readConfig().getString("url");
    String EMAIL = readConfig().getString("userParams.email");
    String PASSWORD = readConfig().getString("userParams.password");
    String NAME = readConfig().getString("userParams.name");
}

