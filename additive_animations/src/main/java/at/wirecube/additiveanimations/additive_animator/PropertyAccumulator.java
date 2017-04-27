package at.wirecube.additiveanimations.additive_animator;

import java.util.HashMap;
import java.util.Map;

/**
 * Helper class for accumulating the changes made by all of the additive animators.
 */
class PropertyAccumulator {
    private Map<PropertyDescription, Float> tempProperties = new HashMap<>();
    int totalNumAnimationUpdaters = 0;
    int updateCounter = 0;

    void add(PropertyDescription property, Float delta) {
        tempProperties.put(property, tempProperties.get(property) + delta);
    }

    Map<PropertyDescription, Float> getAccumulatedProperties() {
        return tempProperties;
    }
}
