class Loader {

    Set<Class<? extends Module>> loadModules() {
        def modulesJson = readJSON text: libraryResource 'modules.json'
        Set<Class<? extends Module>> modules = []
        for (String moduleName : modulesJson) {
            modules.add(Class.forName(moduleName))
        }
        return modules
    }

    Set<Component> loadComponents() {

    }

    Set<Configuration> loadConfigurations() {

    }
}