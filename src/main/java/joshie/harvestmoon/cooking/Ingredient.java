package joshie.harvestmoon.cooking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import joshie.harvestmoon.cooking.registry.ICookingComponent;
import joshie.harvestmoon.util.SafeStack;

public class Ingredient implements ICookingComponent {
    //A list of all registered Ingredients
    public static HashMap<String, Ingredient> ingredients = new HashMap();
    //A list of all items that provide this ingredient type
    public Set<SafeStack> keys = new HashSet();
    public String uniqueIdentifier;
    public int stamina;
    public int fatigue;
    public int hunger;
    public float saturation;
    public int eatTime;
    
    /**@param stamina - how much this restored stamina
     * @param fatigue - how much this adds to fatigue
     * @param hunger - how much minecraft hunger restores
     * @param saturation - how much minecraft saturation restores
     * @param eatTime - how long this adds to eat time*/
    public Ingredient(String uniqueIdentifier, int stamina, int fatigue, int hunger, float saturation, int eatTime) {
        this.uniqueIdentifier = uniqueIdentifier;
        this.stamina = stamina;
        this.fatigue = fatigue;
        this.hunger = hunger;
        this.saturation = saturation;
        this.eatTime = eatTime;
        this.ingredients.put(uniqueIdentifier, this);
    }

    //Whether or not these two ingredients are equal, for this recipe
    @Override
    public boolean isEquivalent(String unlocalized, ICookingComponent component) {
        ArrayList<ICookingComponent> equals = FoodRegistry.getEquivalents(unlocalized);
        if(equals != null && equals.contains(component)) {
            return true;
        } else return component.equals(this);
    }

    // Sets the key for this ingredient
    @Override
    public Ingredient addKey(SafeStack key) {
        keys.add(key);
        return this;
    }
}
