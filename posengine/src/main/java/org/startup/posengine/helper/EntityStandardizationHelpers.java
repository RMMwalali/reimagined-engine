package org.startup.posengine.helper;

import java.util.UUID;

/**
 * <p>
 *     A helper class whose main aim is to help with generating of
 *     Ids for the various table entries
 * </p>
 * @author bikathi-martin
 */
public class EntityStandardizationHelpers {
    /**
     * <p>
     *     A re-usable method that helps generate the ids of the various
     *     entities in the properties
     * </p>
     * @return String that is the id of the entity
     * @author bikathi-martin
     */
    public static String generateEntityId() {
        return UUID.randomUUID().toString()
            .replace("-", "")
            .substring(0, 12)
            .toLowerCase();
    }

    /**
     * <p>
     *     A utility class to help with converting names of any relevant fields
     *     in the entity tables to lowercase
     * </p>
     * @author bikathi-martin
     * @param startString The string you want to convert to lowercase
     * @return String that is a lowercase version of the argument
     */
    public static String stringToLowerCase(String startString) {
        return startString.toLowerCase();
    }
}
