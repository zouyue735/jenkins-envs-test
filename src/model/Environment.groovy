package model

class Environment implements Named, java.io.Serializable {

    private String name

    private Set<Class<? extends Module>> modules = []
    private Map<String, Component> components = [:]
    private Map<String, Configuration> configurations = [:]

    Environment(String name) {
        this.name = name
    }

    @Override
    String name() {
        return name
    }

    def registerModules(Collection<Class<? extends Module>> modules) {
        this.modules.addAll(modules)
    }

    def registerComponents(Collection<Component> components) {
        
    }

    @Override
    String toString() {
        return "modules: " + modules + ", components: " + components + ", configurations: " + configurations
    }
}