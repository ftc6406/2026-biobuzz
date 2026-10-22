public class ConfigKey<T extends BaseConfig> {
    private final Class<T> TYPE;

    public Config(Class<T> typeClass) {
        TYPE = typeClass;

    }

    public Class<T> getType() {
        return TYPE;

    }

}