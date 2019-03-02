package model

abstract class Module implements Named, java.io.Serializable {

    @Override
    String name() {
        return getClass().getSimpleName()
    }
}