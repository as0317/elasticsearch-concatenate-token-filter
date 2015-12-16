package elasticsearch.concatenate;

import java.util.Collection;

import org.elasticsearch.common.component.LifecycleComponent;
import org.elasticsearch.common.inject.Module;
import org.elasticsearch.plugins.Plugin;

public class ConcatenatePlugin extends Plugin {
    @Override
    public String name() {
        return "ConcatenatePlugin";
    }

    @Override
    public String description() {
        return "Plugin that provides a Token Filter that recombines all of the tokens in a token stream back into one.";
    }
}
